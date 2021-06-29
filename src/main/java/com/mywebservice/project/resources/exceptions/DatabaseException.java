package com.mywebservice.project.resources.exceptions;


//Classe criada para eeros de excessões exclusivas do Database
public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
