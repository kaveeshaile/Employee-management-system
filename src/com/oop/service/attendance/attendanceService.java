 /**
 * 
 */
package com.oop.service.attendance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.model.EmployeeRegistration.employee;
import com.oop.model.attendance.attendance;

import com.oop.util.DatabaseConnectionUtil;
/**
 * 
 * @author SAlitha Ekanayaka
 * IT19121048
 * this the class that implemented by Iattendance interface
 */
public class attendanceService implements Iattendance {

	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(attendanceService.class.getName());
	/**
	 * This method create a table structure to insert attendance entries if initially a table is not created in attendance table
	 */
	public static void createAttendanceTable() {
		try {
				//call databaseConnectionUtil to get connection
				connection = DatabaseConnectionUtil.getConnection();
				// this the query to create a table when table it not excists
			PreparedStatement preparedStatement = connection.prepareStatement(
					"CREATE TABLE IF NOT EXISTS attendance(attendanceID int NOT NULL,empID varchar(45),date varchar(45),timein varchar(45) , timeout varchar(45),PRIMARY KEY(attendanceID)");
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			System.out.println("creating table complete");
		}

	}
	/**
	 * This method insert data to attendance table
	 */
	public void addAttendance(String empID , String date , String timein , String timeout) {
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			statement = connection.createStatement();
			// this the query to insert values to attendance table
			String sql = "INSERT INTO attendance values(0,'"+empID+"','"+date+"','"+timein+"','"+timeout+"')";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
					
				}
			} 
			catch (SQLException e) {
				System.out.println(e);
			}
			
		}
	}

	/**
	 * This method delete a raw in attendance table when we want to remove
	 */
	
	public void removeAttendance(String attendanceID) {

		
		/*
		 * Before deleting check  whether attendance ID is available
		 */
		if (attendanceID !=null && !attendanceID.isEmpty()) {
			try {
				//call databaseConnectionUtil to get connection
				connection = DatabaseConnectionUtil.getConnection();
				// this the query to deiete a row in attendance table
				String sql = "DELETE FROM attendance WHERE attendanceID = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, attendanceID);
				preparedStatement.executeUpdate();
			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}
	}
	/**
	 * This method display attendance table when values are inserted
	 */
	public ArrayList<attendance> getAttendance() {

		ArrayList<attendance> attendanceList = new ArrayList<attendance>();
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			// this the query to select all values in attendance table
			String sql = "SELECT * FROM attendance";
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while(resultSet.next()) {
				int attendanceID = resultSet.getInt(1);
				String empID= resultSet.getString(2);
				String date= resultSet.getString(3);
				String timein = resultSet.getString(4);
				String timeout = resultSet.getString(5);
			attendance a = new attendance(attendanceID , empID ,date , timein , timeout);
			attendanceList.add(a);
			preparedStatement.close();
		    }

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return attendanceList;
	}
	/**
	 * This method update corresponding inserted values in attendance table
	 */
	public void updateAttendance(String attendanceID , attendance attendance){
		/*
		 * Before updating check  whether attendance ID is available
		 */
		if (attendanceID !=null && !attendanceID.isEmpty()) {
			try {
				//call databaseConnectionUtil to get connection
				connection = DatabaseConnectionUtil.getConnection();
				// this the query to update values in attendance table
				 String sql= "update attendance as a set a.empID = ?,a.date = ? , a.timein = ? , a.timeout = ? where a.attendanceID = '"+attendanceID+"'";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, attendance.getEmpID());
				preparedStatement.setString(2, attendance.getDate());
				preparedStatement.setString(3, attendance.getTimein());
				preparedStatement.setString(4, attendance.getTimeout());
				preparedStatement.executeUpdate();

			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}
	}
	/**
	 * This method get selected attendance id when we want to select 
	 */
	@Override
	public attendance getAttendancebyID(String attendanceID) {
		// TODO Auto-generated method stub
		return actionAttendance(attendanceID).get(0);
	}
	/**
	 * this method make an arrayList when we select an attendance ID
	 */
	private ArrayList<attendance> actionAttendance(String attendanceID) {
		ArrayList<attendance> attendanceList1 = new ArrayList<attendance>();
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			/*
			 * Before fetching check  whether attendance ID is available
			 */
			if (attendanceID != null && !attendanceID.isEmpty()) {
				// this the query to select all records for corresponding attendanceID in attendance table
				String sql = "select * from attendance where attendanceID = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, attendanceID);
			}
			else {
				// this the query to select all values in attendance table
				String sql = "select * from attendance";
				preparedStatement = connection.prepareStatement(sql);
			}
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				attendance attendance = new attendance(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3), resultSet.getString(4) ,  resultSet.getString(5));
				attendanceList1.add(attendance);
			}

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return attendanceList1;
	}
	/**
	 * This method used to validate employeeID
	 * when we select an employeeID this method check whether that ID is in registrationlogin table 
	 * If if it is there it we return suceess unless false
	 */
	@Override
	public boolean addValidation(String empID) {
		boolean isSuccess = false ;
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			// this the query to select all values of corresponding employeeID of registrationlogin table
			String sql = "select * from registrationlogin where employeeID = '"+empID+"'";
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				isSuccess = true;
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return isSuccess;
	}
	/**
	 * This method select employee Id from employee class and send to actionEmloyeeID method
	 */
	@Override
	public employee employeeIDValidation(String empID) {
		// TODO Auto-generated method stub
		return actionEmployeeID(empID).get(0);
	}
	/**
	 * As mensioned above when employee id is there it validate and then
	 * this method used to print employeeID we select in an interface
	 */
	private ArrayList<employee> actionEmployeeID(String empID) {
		ArrayList<employee> employeeList1 = new ArrayList<employee>();
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			/*
			 * Before fetching check  whether employeeID is available
			 */
			if (empID != null && !empID.isEmpty()) {
				// this the query to select all values of corresponding employeeID of registrationlogin table
				String sql = "select * from registrationlogin where employeeID = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, empID);
			}
			else {
				// this the query to select all values in registrationlogin table
				String sql = "select * from registrationlogin";
				preparedStatement = connection.prepareStatement(sql);
			}
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				employee employee = new employee(resultSet.getString(1), null, null, null, null, null, null , null);
				employeeList1.add(employee);
			}

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return employeeList1;
	}

	

	

	
	

	

	

}
