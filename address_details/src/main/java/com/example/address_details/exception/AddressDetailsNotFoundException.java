package com.example.address_details.exception;

public class AddressDetailsNotFoundException extends Exception{

	
	private String message;
	public AddressDetailsNotFoundException(String message) {
		super(message);
	}
}
