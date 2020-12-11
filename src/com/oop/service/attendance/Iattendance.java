/**
 * 
 */
package com.oop.service.attendance;

import java.util.ArrayList;

import com.oop.model.EmployeeRegistration.employee;
import com.oop.model.attendance.attendance;

/**
 * @author Salitha Ekanayaka
 * IT19121048
 * This is interface which is implemented by attendanceService class
 *
 */
public interface Iattendance {
	/* add attendance*/
	public void addAttendance(String empID,String date , String timein , String timeout);
	/* Get all list of attendance*/
	public ArrayList<attendance> getAttendance();
	/* Update existing attendance*/
	public void updateAttendance(String attendanceID, attendance attendance);

	/* Remove existing attendance*/
	public void removeAttendance(String attendanceID);
	/* select an attendance table row*/
	public attendance getAttendancebyID(String attendanceID);
	/* validation according to employee table*/
	public boolean addValidation(String empID);
	/* get all data which we selected from employee table*/
	public employee employeeIDValidation(String empID);

}
