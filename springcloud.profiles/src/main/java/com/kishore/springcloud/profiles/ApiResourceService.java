package com.kishore.springcloud.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kishore.springcloud.profiles.util.ServerUtil;

@Service
public class ApiResourceService {
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${spring.profiles.active}")
	private String activeProfile;

	@Value("${server.port}")
	private String serverPort;

	public ApiResource allResource() {
		return new ApiResource(applicationName, activeProfile,ServerUtil.getHostName(),serverPort);
	}
	
	public String applicationNameApi() {
		return "Application-Profile:\t".concat(applicationName);
	}
	
	public String activeProfileApi() {
		return "Active-Profile:\t".concat(activeProfile);
	}

	
}
