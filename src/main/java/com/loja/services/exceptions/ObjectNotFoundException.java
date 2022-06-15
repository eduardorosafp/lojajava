package com.loja.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	//exception para regular no banco de dados qnd objeto n for encontrado
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
