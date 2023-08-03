package com.user.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validatePassword(String Password) throws TooLongException, TooShortException {
		// TODO Auto-generated method stub
		return false;
	}
	
}
