package com.userapp.client;

import com.userapp.exception.NameExistsException;

public interface IValidationService {
  boolean validateUsername(String username)throws NameExistsException();
}
