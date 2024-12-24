package com.wipro.cab.exception;

public class InvalidDataException extends Exception{
	public InvalidDataException(String string) {
		super(string);
	}

	@Override
	public String toString()
	{
		return "Invalid Data";
	}
}
