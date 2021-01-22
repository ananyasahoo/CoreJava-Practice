package com.cg.cms.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.cg.cms.dao.UserDAO;
import com.cg.cms.domain.User;
import com.cg.cms.util.DBUtil;

public class UserDAOImpl extends DBUtil implements UserDAO {

	@Override
	public void save(com.cg.cms.domain.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(com.cg.cms.domain.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(com.cg.cms.domain.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<com.cg.cms.domain.User> findAll() {
		List<User> users=new ArrayList<>();
		String sql="Select * from users";
		PreparedStatement pstmt=prepareStatement(sql);
		try {
			ResultSet rs=pstmt.executeQuery()  ;
			while(rs.next()) {
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setContact(rs.getString("contact"));
				user.setEmail(rs.getString("email"));
				user.setPwd(rs.getString("pwd"));
				user.setRole(rs.getInt("role"));
				user.setStatus(rs.getInt("status"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	

}
