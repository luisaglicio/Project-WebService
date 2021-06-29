package com.mywebservice.project.services.exceptions;

//classe criada para alterar o codigo de erro 500 para 400 no Postman para o method findById
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
			super("Resource not found. Id "+id);
		
	}

}
