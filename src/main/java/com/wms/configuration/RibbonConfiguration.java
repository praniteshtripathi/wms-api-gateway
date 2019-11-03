package com.wms.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;

/**
 * @author moises.macero
 */
public class RibbonConfiguration {

	
	  @Bean public IPing ribbonPing(final IClientConfig config) { 
		    System.out.println("---------------IPing ribbonPing(final IClientConfig config)-----------"  );
	  		return new PingUrl(false,"/health"); 
	  
	  }
	  
	  @Bean public IRule ribbonRule(final IClientConfig config) {
		  System.out.println("---------------Rule ribbonRule(final IClientConfig config)-----------" );
		  return new AvailabilityFilteringRule();
	  
	  }
	 
}
