package com.util;



import java.sql.*;
import java.util.ArrayList;

import com.employee.Leave;
import com.service.LeaveService;
import com.service.TaskService;

/*
 * This is Database Connection creation class
 */
public class EmployeeDButil implements LeaveService {
	

	public boolean insertemployee(String  EmployeeId,String EmployeeName,String Duration,String LeaveType,String Reason) {
		
		
		boolean isSuccess = false;
		 
		String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
		String user="root";
		String pass ="password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			
			
			
			String sql="insert into online_employee_management_system.leave(EmployeeName,Duration,LeaveType,Reason) values( '"+EmployeeName+"','"+Duration+"','"+LeaveType+"','"+Reason+"')";
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
			
	public  ArrayList<Leave> getleavelist() {
		
		
		 ArrayList<Leave> leaveList = new ArrayList<Leave>();	
		
		
		
		
			
			
			 
			String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
			String user="root";
			String pass ="password";
			ResultSet rs = null;
			PreparedStatement preparedStatement = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				
				
				
				
				String sql="select * from online_employee_management_system.leave";
						
				System.out.println("sql statement" + sql);
				preparedStatement = (PreparedStatement) con.prepareStatement(sql);
				rs = preparedStatement.executeQuery();
				
				while (rs.next()){
					leaveList.add( new Leave(rs.getString("EmployeeId"), rs.getString("EmployeeName"), rs.getString("Duration"),rs.getString("LeaveType"),rs.getString("Reason")));
					
					
					
				}
				
				
				
				
			}
			
			catch (Exception e) {
	   		e.printStackTrace();
	   	}
		
	   	return leaveList;
			
	}
		
	public boolean UpdateLeave(String employeeId, String employeeName, String leaveType, String duration, String reason) {
		
		boolean isSuccess = false;
		 
		String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
		String user="root";
		String pass ="password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			
			
			
			String sql="update online_employee_management_system.leave set EmployeeName='"+employeeName+"',LeaveType='"+leaveType+"',Duration='"+duration+"',Reason='"+reason+ "' "
					+"where EmployeeId="+employeeId+";";
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
public boolean DeleteLeave(String employeeId, String employeeName, String leaveType, String duration, String reason) {
		
		boolean isSuccess = false;
		 
		String url ="jdbc:mysql://localhost:3306/online_employee_management_system";
		String user="root";
		String pass ="password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			
			
			
			String sql="delete from online_employee_management_system.leave where EmployeeId="+employeeId+";";
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

