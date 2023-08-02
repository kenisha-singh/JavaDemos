package com.voterapp.exception;

import com.voterapp.services.InValidVoterException;

public class UnderAgeException extends Exception{

	public UnderAgeException(String string) {
		
	}

	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public UnderAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
