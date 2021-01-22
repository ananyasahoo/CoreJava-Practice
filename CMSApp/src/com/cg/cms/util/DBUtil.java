package com.cg.cms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
/*
 * This DBUtil will perform the
 *  common operation like- register user, getting connection object  and prepared statement
 * author-@Ananya Priyadarshini
 */
public class DBUtil {
	private static Logger logger =Logger.getLogger(DBUtil.class);
	private Connection con=null;
	
		static String driverClassName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost/cmsdb";
		String user = "postgres";
		String password = "admin";
		
		private PreparedStatement pstmt;
		
		static {
			try {
				Class c = Class.forName(driverClassName);
				logger.info(c);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		public Connection connect() {
			
			try {
				con = DriverManager.getConnection(url, user, password);
			} 
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return con;
		}
		
		public PreparedStatement prepareStatement(String sql) {
			try {
				pstmt = connect().prepareStatement(sql);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
	    return pstmt;
		}
}

		