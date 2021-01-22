package com.cg.cms.test;

import java.util.List;

import com.cg.cms.dao.UserDAO;
import com.cg.cms.daoimpl.UserDAOImpl;
import com.cg.cms.domain.User;

public class UserDAOImpl_FindAll_OperationTest {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAOImpl();
		List<User> users = userDAO.findAll();
		for(User user:users) {
			System.out.println("Name : "+user.getName() + "..."+"Contact :"+user.getContact());
		}
		
	}

}
