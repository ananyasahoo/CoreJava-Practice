package com.minijavaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;


public class DeleteDemo {
	private static Logger logger = Logger.getLogger(DeleteDemo.class);

	public static void main(String[] args) throws Exception {

		// 1. Collect the DB information
		String driverClassName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost/sms";
		String user = "postgres";
		String password = "admin";
		// 2. Register the Driver
		Class c = Class.forName(driverClassName);
		// System.out.println(c);
		logger.info(c);
		// 3. Get Connection Object
		Connection con = DriverManager.getConnection(url, user, password);
		logger.info(con);
		// 4. Create Statement and execute query
		String sql = "DELETE FROM student WHERE id=103";
		Statement stmt =  con.createStatement();
		logger.info(stmt);
		logger.info(sql);
		stmt.execute(sql);
		logger.info("Success! Record Removed");
		// 5. Release Resource (Statement, Connection)
		stmt.close();
		con.close();
	}

}


