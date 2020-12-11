/**
 * 
 */
package com.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author SAlitha Ekanayaka
 *
 */
public class DatabaseConnectionUtil {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
	}
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/online_employee_management_system";
			String user = "root";
			String pass = "password";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected");
			return con;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;	
	}
	
}
