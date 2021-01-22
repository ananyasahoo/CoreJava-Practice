package com.minijavaproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.log4j.Logger;
public class PrepStatementDemo {
	private static Logger logger = Logger.getLogger(PrepStatementDemo.class);

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
		String sql = "INSERT INTO student(id, name , age , branch) VALUES (?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		logger.info(pstmt);
		logger.info(sql);
		pstmt.setInt(1, 103);
		pstmt.setString(2, "Tom's");
		pstmt.setString(3, "Dizusa");
		pstmt.setInt(4, 12);
		pstmt.execute();
		logger.info("Success! Record Inserted");
		// 5. Release Resource (Statement, Connection)
		pstmt.close();
		con.close();
	}
}
