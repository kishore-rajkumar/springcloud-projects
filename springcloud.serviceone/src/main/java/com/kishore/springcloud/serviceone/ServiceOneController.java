package com.kishore.springcloud.serviceone;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-one")
public class ServiceOneController {

	@GetMapping
	public List<ServiceOneDTO> getAllServices() {
		return allServices();
	}

	private List<ServiceOneDTO> allServices() {
		List<ServiceOneDTO> services = new ArrayList<ServiceOneDTO>();
		services.add(new ServiceOneDTO("S1-data1"));
		services.add(new ServiceOneDTO("S1-data2"));
		return services;
	}

}

class ServiceOneDTO {
	private UUID id;
	private String name;

	public ServiceOneDTO(String name) {
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