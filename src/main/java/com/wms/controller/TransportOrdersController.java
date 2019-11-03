/*
 * package com.wms.controller;
 * 
 * import java.util.List; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.core.ParameterizedTypeReference; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.client.RestTemplate; import
 * org.springframework.web.util.UriComponentsBuilder;
 * 
 * import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand; import
 * com.wms.pojo.TransportOrders;
 * 
 * @RestController
 * 
 * public class TransportOrdersController {
 * 
 * @Autowired RestTemplate restTemplate;
 * 
 * @GetMapping("/api/alltransportOrders") //@HystrixCommand(fallbackMethod =
 * "fallbackMethod") public ResponseEntity<?> getAllTransportOrders() {
 * UriComponentsBuilder builder = UriComponentsBuilder .fromUriString(
 * "http://innoitwf61b42g2.americas.global.nttdata.com:7070//api/alltransportOrders"
 * ); ResponseEntity < List < TransportOrders >> response =
 * restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, new
 * ParameterizedTypeReference < List < TransportOrders >> () {});
 * 
 * return response;
 * 
 * }
 * 
 * public ResponseEntity<?> fallbackMethod(){ return new
 * ResponseEntity("Api server  is down", HttpStatus.GATEWAY_TIMEOUT); } }
 */