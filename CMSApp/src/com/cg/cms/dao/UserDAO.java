package com.cg.cms.dao;

import java.util.List;
import com.cg.cms.domain.User;
/**
 * This UserDAO interface will perform the CRUD Operations
 * @author Ananya Priyadarshini
 *
 */
public interface UserDAO {
	/**
	 * It will save the user object into the users table
	 * @param user object will be saved
	 */
	void save(User user);
	/**
	 * It will delete the user object from the users table
	 * @param user object will be deleted
	 */
	
	void delete(User user);
	/**
	 * It will delete the user object based on user id
	 * @param id of the person
	 */
	
	void delete(int id);
	/**
	 * It will update the user object 
	 * @param user data will be updated
	 */
	
	void update(User user);
	/**
	 * It will return the list of users in the users table
	 * @return
	 */
	
	List<User> findAll();
}
