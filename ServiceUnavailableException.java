package com.wipro.cab.exception;

public class ServiceUnavailableException extends Exception {
	public ServiceUnavailableException(String message) {
		super(message);
	}

	

	@Override
	public String toString()
	{
		return "Service Unavailable";
	}
}
