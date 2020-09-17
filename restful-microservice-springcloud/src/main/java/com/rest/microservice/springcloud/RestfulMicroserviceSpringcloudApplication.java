package com.rest.microservice.springcloud;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;


@SpringBootApplication
public class RestfulMicroserviceSpringcloudApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(RestfulMicroserviceSpringcloudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestfulMicroserviceSpringcloudApplication.class, args);
	}
	
	
	  @Bean public LocaleResolver localResolver() { SessionLocaleResolver
	  localeResolver = new SessionLocaleResolver();
	  localeResolver.setDefaultLocale(Locale.US);
	  
	  return localResolver(); }
	  
	  @Bean public ResourceBundleMessageSource bundleMessageSource() {
	  ResourceBundleMessageSource messageSource = new
	  ResourceBundleMessageSource(); messageSource.setBasename("messages"); return
	  messageSource; }
	 
}
