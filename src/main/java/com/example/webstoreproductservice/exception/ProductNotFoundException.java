package com.example.webstoreproductservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8831709296931097973L;
	
	public ProductNotFoundException(String message) {
		super(message);
	}
	
}
