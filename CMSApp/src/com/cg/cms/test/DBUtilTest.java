package com.cg.cms.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.cms.util.DBUtil;

public class DBUtilTest  {

	public static void main(String[] args) {
		DBUtil dbutil= new DBUtil();
		String sql ="INSERT INTO users(name , contact , email , loginname , pwd , status, role) VALUES (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = dbutil.prepareStatement(sql);
		try {
			/*
			 * id is auto generated
			 * pstmt.setInt(1,1);
			 * at 2 , i provide the name
			 * changed it to 1
			 */
			
			pstmt.setString(1 , "Priyanka");
			pstmt.setString(2 , "7356952347");
			pstmt.setString(3, "priyanka@gmail.com");
			pstmt.setString(4 , "priyanka");
			pstmt.setString(5 , "priyanka@123");
			pstmt.setInt(6, 1);
			pstmt.setInt(7, 2);
			pstmt.execute();
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
		System.out.println("Successful  data inserted , check database");
	}

}
