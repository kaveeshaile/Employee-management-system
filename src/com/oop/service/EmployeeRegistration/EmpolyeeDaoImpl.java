package com.oop.service.EmployeeRegistration;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.oop.model.EmployeeRegistration.employee;
import com.oop.util.DatabaseConnectionUtil;

public class EmpolyeeDaoImpl implements EmployeeDao {

	private static Connection con;
	private static PreparedStatement ps;
	private static Statement statement;
	/**
	 * This method initially drop existing Employees table in the database and
	 * recreate table structure to insert employee entries
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name using
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error
	 * @throws NullPointerException
	 *             - Service is not available
	 * 
	 */
	public static void createRegistrationTable() {
		try {
			con = DatabaseConnectionUtil.getConnection();
			// Drop table if already exists and as per SQL query available in
			ps = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS registrationlogin(employeeID varchar(45) NOT NULL,name varchar(45) NOT NULL,email varchar(45) NOT NULL,gender varchar(45) NOT NULL,address varchar(45) NOT NULL,position varchar(45) NOT NULL,username varchar(45) NOT NULL, password varchar(45)NOT NULL,PRIMARY KEY(employeeID)");
			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			System.out.println("creating table complete");
		}

	}

	
	/**
	 * Add set of employees for as a batch from the selected employee List
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * 
	 */
	
	public void addRegistration(String employeeID, String name, String email, String gender, String address,
			String position , String username, String password) {
		try {
			con = DatabaseConnectionUtil.getConnection();
			/*
			 * Query is available in mysql  and use
			 * insert_employee key to extract value of it
			 */
			statement = con.createStatement();
			statement = con.createStatement();
			String sql = "INSERT INTO registrationlogin values('" + employeeID + "','" + name + "','" + email + "' ,'" + gender
					+ "' ,'" + address + "','" + position + "','" + username + "','" + password + "')";
			statement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of
			 * transaction
			 */
			try {
				if (statement != null) {

					statement.close();
				}
				if (con != null) {
					con.close();

				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}




	public boolean loginvalidation(String position , String userName, String password) {
		boolean isSuccess = false ;
		try {
			con = DatabaseConnectionUtil.getConnection();
			String sql = "select * from registrationlogin where position = '"+position+"' and username = '"+userName+"' and password = '"+password+"'";
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				isSuccess = true;
			}
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
		return isSuccess;
	}




	@Override
	public boolean adminloginvalidation(String position, String userName, String password) {
		boolean isSuccess = false ;
		try {
			con = DatabaseConnectionUtil.getConnection();
			String sql = "select * from registrationlogin where position = '"+position+"' and username = '"+userName+"' and password = '"+password+"'";
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				isSuccess = true;
			}
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
		return isSuccess;
	}

	/**
	 * Add set of employees for as a batch from the selected employee List
	 * 
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * 
	 */


	@Override
	public  ArrayList<employee> getemployee() {

		ArrayList<employee> employeeDetailsList = new ArrayList<employee>();
		try {
			con = DatabaseConnectionUtil.getConnection();
			String sql = "SELECT * FROM registrationlogin";
			statement = con.createStatement();
			ResultSet rs= statement.executeQuery(sql);

			while(rs.next()) {
				employee emp = new employee( rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getString(7),  rs.getString(8));
				employeeDetailsList.add(emp);
				ps.close();
		    }

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



	/**
	 * Employee details can be retrieved based on the provided employee ID
	 * 
	 * @param employeeID
	 *            - Employee details are filtered based on the ID
	 * 
	 * @see #actionEmployee()
	 */
	@Override
	public employee getEmployeedetailsbyID(String employeeID) {
	
		return actionEmployee(employeeID).get(0);
	}


	/**
	 * Get all list of employees
	 * 
	 * @return ArrayList<employee> 
	 * 						- Array of employee list will be return
	 * 
	 * @see #actionEmployee()
	 */

	private ArrayList<employee> actionEmployee(String employeeID) {
		ArrayList<employee> employeeList2 = new ArrayList<employee>();
		try {
			con = DatabaseConnectionUtil.getConnection();
			/*
			 * Before fetching employee it checks whether employee ID is
			 * available
			 */
			if (employeeID != null && !employeeID.isEmpty()) {
				
				String sql = "select * from registrationlogin where employeeID = ?";
				ps= con.prepareStatement(sql);
				ps.setString(1, employeeID);
			}
			else {
				String sql = "select * from registrationlogin";
				ps = con.prepareStatement(sql);
			}
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				employee emp = new employee( rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getString(7),  rs.getString(8));
				employeeList2.add(emp);
			}

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
		return employeeList2;
	}


	/**
	 * Get the updated employee
	 * 
	 * @param employeeID
	 *            ID of the employee to remove or select from the list
	 * 
	 * @return return the Employee object
	 * 
	 */

	@Override
	public void updateEmployee(String employeeID, employee employee) {
		/*
		 * Before fetching employee it checks whether employee ID is available
		 */
		if (employeeID !=null && !employeeID.isEmpty()) {
			try {
				con = DatabaseConnectionUtil.getConnection();
				 String sql= "update registrationlogin as r set r.employeeID = ?, r.name = ? , r.email = ? , r.gender = ? ,r.address = ? ,r.position = ? ,r.username = ? ,r.password = ?  where r.employeeID = '"+employeeID+"'";
				ps = con.prepareStatement(sql);
				ps.setString(1, employee.getEmployeeID());
				ps.setString(2, employee.getName());
				ps.setString(3, employee.getEmail());
				ps.setString(4, employee.getGender());
				ps.setString(5, employee.getAddress());
				ps.setString(6, employee.getPosition());
				ps.setString(7, employee.getUsername());
				ps.setString(8, employee.getPassword());
				ps.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end of transaction
				 */
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
		}
		
	}


	/**
	 * This method delete an employee based on the provided ID
	 * 
	 * @param employeeID
	 *            - Delete employee according to the filtered employee details
	 * @throws SQLException
	 *             - Thrown when database access error occurs or this method is
	 *             called on a closed connection
	 * @throws ClassNotFoundException
	 *             - Thrown when an application tries to load in a class through
	 *             its string name using
	 * @throws SAXException
	 *             - Encapsulate a general SAX error or warning
	 * @throws IOException
	 *             - Exception produced by failed or interrupted I/O operations.
	 * @throws ParserConfigurationException
	 *             - Indicates a serious configuration error.
	 * @throws NullPointerException
	 *             - Service is not available
	 */

	@Override
	public void removeEmployee(String employeeID) {
		// Before deleting check whether employee ID is available
		if (employeeID !=null && !employeeID.isEmpty()) {
			/*
			 * Remove employee query will be retrieved from database
			 */
			try {
				con = DatabaseConnectionUtil.getConnection();
				String sql = "DELETE FROM registrationlogin WHERE employeeID = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, employeeID);
				ps.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
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
		}
		
	}
	
}
