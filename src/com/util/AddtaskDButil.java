package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.employee.Task;
import com.service.TaskService;

/*
 * This is Database connection creation class
 */

public class AddtaskDButil implements TaskService {



public  boolean insertAddtask(String TaskId,String Title,String DueDate,String Description) {
	 	
	
	
	
	
		
		boolean isSuccess = false;
		 
		String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
		String user="root";
		String pass ="password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			
			
			
			String sql=" insert into online_employee_management_system.task(TaskId,Title,DueDate,Description) values('"+TaskId+"','"+Title+"','"+DueDate+"','"+Description+"')";
			
			System.out.println("sql statement" + sql);
			int rs = stmt.executeUpdate(sql);
		
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				
			isSuccess = false;
				
				
			}
			
			
		}
		
		catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
		
    }
			
		
		
	
public  ArrayList<Task> gettasklist() {
	
	
	 ArrayList<Task> taskList = new ArrayList<Task>();	
	
	
	
	
		
		
		 
		String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
		String user="root";
		String pass ="password";
		ResultSet rs = null;
		java.sql.PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			
			
			
			String sql=" select * from online_employee_management_system.task";
					
			System.out.println("sql statement" + sql);
			preparedStatement = con.prepareStatement(sql);
			rs = preparedStatement.executeQuery();
			
			while (rs.next()){
				taskList.add( new Task(rs.getInt("TaskId"), rs.getString("Title"), rs.getString("DueDate"),rs.getString("Description")));
				
				
				
			}
			
			
			
			
		}
		
		catch (Exception e) {
   		e.printStackTrace();
   	}
	
   	return taskList;
		
}
public  boolean UpdateTask(String taskId, String title, String dueDate, String description) {
	
	boolean isSuccess = false;
	 
	String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
	String user="root";
	String pass ="password";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stmt=con.createStatement();
		
		
		
		String sql=" update online_employee_management_system.task set TaskId='"+taskId+"',Title='"+title+"',DueDate='"+dueDate+"',Description='"+description+ "' "
				+"where TaskId="+taskId+";";
		System.out.println("sql statement" + sql);
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			
			isSuccess = false;
			
			
		}
		
		
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;

}
public  boolean DeleteTask(String taskId, String title, String dueDate, String description) {
	
	boolean isSuccess = false;
	 
	String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
	String user="root";
	String pass ="password";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement stmt=con.createStatement();
		
		
		
		String sql=" delete from online_employee_management_system.task where TaskId="+taskId+";";
		System.out.println("sql statement" + sql);
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			
			isSuccess = false;
			
			
		}
		
		
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;

}
}
			
		
		
