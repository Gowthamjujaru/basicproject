package com;

public class InsufficientBalanceException extends RuntimeException{
	private String message;
	public InsufficientBalanceException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}
 /**
  * rules for creating custom Exceptionb (user define Exception)
 * ............................................................
 * 1. create a class with the Exception Name.
 * 2a. class should be extend RuntimeException class to create uncheck
 * 2b. class should extend Exception class to create checked Exception
 * 3. Override getMessage() -> (variable,constructor,getter method)
 * 4. invoke the Exception object using throw keyword & handle it using  try & catch block
*\
  * 
  */
 