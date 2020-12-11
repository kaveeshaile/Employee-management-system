package com.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.EmployeeRegistration.employee;
import com.oop.util.DatabaseConnectionUtil;


public class emplyoyeeDButil implements employeePaymentInterface{
	private static PreparedStatement ps;
	private static Connection con;
	
public static List<employeePayment> validate(String empname, String empID){
		
		ArrayList<employeePayment> emp = new ArrayList<>();
		
		//create database connection
				String url = "jdbc:mysql://localhost:3306/online_employee_management_system";
				String username = "root";
				String password = "password";
						
				//validate
				
				try{
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url,username,password);
					Statement stmt = con.createStatement();
					String sql = "select * from online_employee_management_system.emp_details where name='"+empname+"' and id='"+empID+"' ";
					ResultSet rs = stmt.executeQuery(sql);
					
					if(rs.next()){
						
						String id = rs.getString(1);
						String name = rs.getString(2);
						String department = rs.getString(3);
						 float basicSalary = rs.getFloat(4);
						 float deduction = rs.getFloat(5);
						 float overTime = rs.getFloat(6);
						 
						
						employeePayment e = new employeePayment(id,name,department,basicSalary,deduction,overTime);
						emp.add(e);
					}
					
				}
				catch(Exception e){
					e.printStackTrace();
					
				}
		
		      return emp;
		
	          }
	
      public static boolean insertemployee( String id, String name , String department , float BasicSalary , float deduction , float overTime) {
    	  
    	  boolean isSuccess = false;
    	  
    	//create db connection
  		String url = "jdbc:mysql://localhost:3306/online_employee_management_system";
  		String username = "root";
  		String password = "password";
  		
  		
  		try{
			Class.forName("com.mysql.jdbc.Driver");
								
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
            String sql = "insert into emp_details values ('"+id+"','"+name+"','"+department+"','"+BasicSalary+"','"+deduction+"','"+ overTime+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0){
				isSuccess = true;
			}else{
				isSuccess = false;
			}
            
			}
			catch(Exception e){
			 e.printStackTrace();
		    }
    	  
    	  return isSuccess;
    	  
          }	
	
      public static boolean updateEmploye(String id , String name , String department , float basicSalary , float deduction , float overTime ){
    	  boolean isSuccess = false; 
    	  
    		//create db connection
    		String url = "jdbc:mysql://localhost:3306/online_employee_management_system";
    		String username = "root";
    		String password = "password";
    	  
    	 try {
    		 
    	    Class.forName("com.mysql.jdbc.Driver");
				
 			Connection con = DriverManager.getConnection(url,username,password);
 			Statement stmt = con.createStatement();
 			String sql = "update emp_details set name = '"+name+"',department='"+department+"',basicSalary='"+basicSalary+"',deduction='"+deduction+"',overTime='"+overTime+"'" + "where id ='"+id+"'";
 			int rs = stmt.executeUpdate(sql);
 			
 			if(rs>0){
				isSuccess = true;
			}
 			else{
				isSuccess = false;
			}
    		 
    		 }
    	 catch(Exception e){
			 e.printStackTrace();
			}
    	  return isSuccess;
      }

	public static boolean DeleteEmploye(String id) {
		 boolean isSuccess = false;
		 
		//create db connection
 		String url = "jdbc:mysql://localhost:3306/online_employee_management_system";
 		String username = "root";
 		String password = "password";
 	  
 	 try {
 		 
 	    Class.forName("com.mysql.jdbc.Driver");
				
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String sql = "delete from online_employee_management_system.emp_details where id = '"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0){
				isSuccess = true;
			}
			else{
				isSuccess = false;
			}
 	 }catch(Exception e){
		 e.printStackTrace();
		}
		 return isSuccess;
	}
	public  ArrayList<employeePayment> getemployeePayment() {
		ArrayList<employeePayment> employeeDetailsList = new ArrayList<employeePayment>();
		try {
				con = DatabaseConnectionUtil.getConnection();
				String sql = "SELECT * FROM online_employee_management_system.emp_details";
				Statement statement = con.createStatement();
				ResultSet rs= statement.executeQuery(sql);

			while(rs.next()) {
				employeePayment emp = new employeePayment( rs.getString(1) , rs.getString(2), rs.getString(3),rs.getFloat(4), rs.getFloat(5), rs.getFloat(6));
				employeeDetailsList.add(emp);
				
		    }
			ps.close();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return employeeDetailsList;
	}  
      
      
}
             



