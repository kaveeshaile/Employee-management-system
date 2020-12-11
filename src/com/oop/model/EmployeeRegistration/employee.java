package com.oop.model.EmployeeRegistration;

public class employee {
	private String EmployeeID;
	private String name;
	private String email;
	private String gender;
	private String address;
	private String position;
	private String username;
	private String password;
	/**
	 * @param employeeID
	 * @param name
	 * @param email
	 * @param gender
	 * @param address
	 * @param position
	 * @param username
	 * @param password
	 */
	public employee(String employeeID, String name, String email, String gender, String address, String position,
			String username, String password) {
		super();
		EmployeeID = employeeID;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.position = position;
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the employeeID
	 */
	public String getEmployeeID() {
		return EmployeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	

	
	

	
	
}