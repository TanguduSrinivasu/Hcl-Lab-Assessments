package com.pojo;

@SuppressWarnings("serial")
public class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}
