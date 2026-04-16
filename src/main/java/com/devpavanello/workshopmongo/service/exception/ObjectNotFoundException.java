package com.devpavanello.workshopmongo.service.exception;

public class ObjectNotFoundException extends RuntimeException {
	public ObjectNotFoundException(String message){
		super(message);
	}
}
