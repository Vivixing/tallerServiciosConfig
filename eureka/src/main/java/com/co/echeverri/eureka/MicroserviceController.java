package com.co.echeverri.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/endpoint")
	public String retrieveLimits() {
		return configuration.getValue();
	}
}
