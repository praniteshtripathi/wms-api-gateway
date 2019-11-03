package com.wms.configuration;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author moises.macero
 */
@Configuration
public class HystrixFallbackConfiguration {

	@Bean
	FallbackProvider getFallbackProvider() {
		return new FallbackProvider() {

			@Override
			public String getRoute() {
				return "wms-api";
			}

			@Override
			public ClientHttpResponse fallbackResponse(String route, Throwable throwable) {
				return new ClientHttpResponse() {

					@Override
					public HttpStatus getStatusCode() throws IOException {
						return HttpStatus.OK;
					}

					@Override
					public int getRawStatusCode() throws IOException {
						return 200;
					}

					@Override
					public String getStatusText() throws IOException {
						return "OK";
					}

					@Override
					public void close() {

					}

					@Override
					public InputStream getBody() throws IOException {
						return new ByteArrayInputStream(
								"WMS Service is currently unavailable.Please wailt for some time".getBytes());
					}

					@Override
					public HttpHeaders getHeaders() {
						HttpHeaders headers = new HttpHeaders();
						headers.setContentType(MediaType.APPLICATION_JSON);
						return headers;
					}
				};
			}
		};

	}

}
