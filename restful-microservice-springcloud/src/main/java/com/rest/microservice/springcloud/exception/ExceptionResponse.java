package com.rest.microservice.springcloud.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private String code;
	private String description;
	private Date timestamp;
	/**
	 * @param code
	 * @param description
	 * @param timestamp
	 */
	public ExceptionResponse(String code, String description, Date timestamp) {
		super();
		this.code = code;
		this.description = description;
		this.timestamp = timestamp;
	}
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	public Date getTimestamp() {
		return timestamp;
	}

	
}
