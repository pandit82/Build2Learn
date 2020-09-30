package com.learning.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping("/basicauth")
	public AuthenticationBean authenticationBean() {
		//throw new RuntimeException("Error occered please contact support 800-299-3884");
		return new AuthenticationBean("You are Successfully authenticated");
	}
	
}
