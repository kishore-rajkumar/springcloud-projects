package com.kishore.springcloud.apigateway;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties
public class UriConfiguration {

	private String serviceOne = "lb://SPRINGCLOUD-SERVICEONE:5001";
	private String serviceTwo = "lb://SPRINGCLOUD.SERVICE-TWO:5002";

	public String getServiceOne() {
		return serviceOne;
	}

	public void setServiceOne(String serviceOne) {
		this.serviceOne = serviceOne;
	}

	public String getServiceTwo() {
		return serviceTwo;
	}

	public void setServiceTwo(String serviceTwo) {
		this.serviceTwo = serviceTwo;
	}

}
