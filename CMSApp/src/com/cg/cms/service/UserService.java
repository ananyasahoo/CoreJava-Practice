package com.cg.cms.service;

import java.util.List;

import com.cg.cms.domain.User;
import com.cg.cms.exception.UserNotFoundException;

/*
 * This userService will perform the user related services
 */
public interface UserService {
 /*
  * This register user method will register the user in system
  * @param user to be registered
  */
	void registerUser(User user);
	/*
	 * This authenticateuser method will check the authenticty of the user
	 * @param pwd of the user
	 * @param loginname of the user
	 * return user if authenticated successfully of usernotFound
	 * 
	 */
	User authenticaticateUser(String loginname ,String pwd) throws UserNotFoundException;
	List<User> showAllUsers();
}
