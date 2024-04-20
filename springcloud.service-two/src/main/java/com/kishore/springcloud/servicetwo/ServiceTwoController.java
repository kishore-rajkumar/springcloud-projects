package com.kishore.springcloud.servicetwo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-two")
public class ServiceTwoController {

	@GetMapping
	public List<ServiceTwoDTO> getAllServices() {
		return allServices();
	}

	private List<ServiceTwoDTO> allServices() {
		List<ServiceTwoDTO> services = new ArrayList<ServiceTwoDTO>();
		services.add(new ServiceTwoDTO("SERVICE:TWO-data1"));
		services.add(new ServiceTwoDTO("SERVICE:TWO-data2"));
		return services;
	}

}

class ServiceTwoDTO {
	private UUID id;
	private String name;

	public ServiceTwoDTO(String name) {
		super();
		this.id=UUID.randomUUID();
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}