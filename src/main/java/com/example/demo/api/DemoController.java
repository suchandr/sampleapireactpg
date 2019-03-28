package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import reactor.core.publisher.Mono;

@RestController
public class DemoController {
	
	@GetMapping("/customers/{customerId}")
	public Mono<String> getUserById(@PathVariable("customerId") String customerId) {
		 WebClient client = WebClient.create("http://www.google.com");

		return client.get().uri("/").retrieve().bodyToMono(String.class);
	}
}
