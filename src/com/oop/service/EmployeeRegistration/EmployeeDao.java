package com.oop.service.EmployeeRegistration;

import java.util.ArrayList;

import com.oop.model.EmployeeRegistration.employee;


public interface EmployeeDao {

	void addRegistration(String employeeID, String name, String email, String gender, String address,String position, String username,
			String password);

	boolean loginvalidation(String position ,String userName, String password);

	boolean adminloginvalidation(String position, String userName, String password);
	/**
	 * Get all list of employees
	 * 
	 * @return ArrayList<employee>
	 */
	public ArrayList<employee> getemployee();
	/**
	 * Get a particular employee
	 * 
	 * @param empoyeeID
	 * @return Employee
	 */
	employee getEmployeedetailsbyID(String employeeID);
	/**
	 * Update existing employee
	 * @param employeeID
	 * @param employee
	 * 
	 * @return
	 */
	void updateEmployee(String employeeID, employee employee);
	/**
	 * Remove existing employee
	 * 
	 * @param employeeID
	 */
	void removeEmployee(String employeeID);
	

}
