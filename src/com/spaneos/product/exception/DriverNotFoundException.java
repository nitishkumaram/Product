package com.spaneos.product.exception;

public class DriverNotFoundException extends RuntimeException {
	private String message="Please check the driver class in your class path";
	public DriverNotFoundException() {
	}
	public DriverNotFoundException(String message){
		this.message=message;
	}
	@Override
	public String toString() {
		return "DriverNotFoundException [message=" + message + "]";
	}
	
}
