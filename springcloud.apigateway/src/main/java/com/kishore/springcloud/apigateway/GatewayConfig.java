package com.kishore.springcloud.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class GatewayConfig {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {
		
		String httpServiceOneUri = uriConfiguration.getServiceOne();
		String httpServiceTwoUri = uriConfiguration.getServiceTwo();
		
	    return builder.routes()
	    		 .route("service-one", r -> r.path("/service-one/**")
	    				 .uri(httpServiceOneUri))
	    		 .route("service-two", r -> r.path("/service-two/**")
	    				 .uri(httpServiceTwoUri))
	    		.build();
	}
	
	
}
