package com.cg.cms.exception;

public class UserNotFoundException extends Exception {
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * This will create UserNotFoundEception without error message
	 */
   public UserNotFoundException() {
	   super();
   }
   /*
    * This will create UserNotFoundException with error message
    */
   public UserNotFoundException(String errMsg) {
	   super(errMsg);
   }
}
