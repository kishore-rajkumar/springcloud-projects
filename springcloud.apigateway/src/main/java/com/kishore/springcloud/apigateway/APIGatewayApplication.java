package com.kishore.springcloud.apigateway;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/*
 * API Gateway basic implementation
 * 1. Routing
 * 2. Rate-limiting
 * */


//@EnableConfigurationProperties(UriConfiguration.class)
@RestController
@SpringBootApplication
public class APIGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIGatewayApplication.class, args);
	}

	@Bean
	public KeyResolver userKeyResolver() {
		return exchange -> Mono.just("1");
	}

	@GetMapping("/")
	public String welcome() {
		return "SPRINGCLOUD API GATEWAY".concat("<br/>")
				.concat("----------------------------------------------")
				.concat("<br/>")+ new Date();
	}
}
