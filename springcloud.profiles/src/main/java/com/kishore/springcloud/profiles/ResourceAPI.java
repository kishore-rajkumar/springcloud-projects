package com.kishore.springcloud.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app-resource")
public class ResourceAPI {

	private ApiResourceService service;
	
	@Autowired
	public ResourceAPI(ApiResourceService _service) {
		this.service=_service;
	}
	
	@GetMapping
	public ApiResource allResourceApi() {
		return service.allResource();
	}
	
	@GetMapping("application-name")
	public String applicationNameApi() {
		return service.applicationNameApi();
	}
	
	@GetMapping("active-profile")
	public String activeProfileApi() {
		return service.activeProfileApi();
	}
}
