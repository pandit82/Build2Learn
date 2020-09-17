package com.rest.microservice.springcloud.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean getMessageBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping("/hello/{name}")
	public HelloWorldBean getParamMessage(@PathVariable String name) {
		return new HelloWorldBean(String.format("hello world, %s", name));
	}
	
	@GetMapping("/hello-world-internationalization")
	public String helloWordInternationalization(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, locale);
	}

}
