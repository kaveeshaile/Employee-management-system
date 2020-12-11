package com.oop.model.attendance;

/**
 * 
 * @author SAlitha Ekanayaka
 * IT19121048
 * this is a child class of employeebehavior class
 */
public class attendance extends employeebehavior{
	/**
	 * @param attendanceID
	 */
	public attendance(int attendanceID) {
		super(attendanceID);
	}
	/**
	 * variables
	 */
	private String empID;
	private String date;
	private String timein;
	private String timeout;

	/**
	 * @param attendanceID
	 * @param empID
	 * @param date
	 * @param timein
	 * @param timeout
	 */
	/**
	 * 
	 * overloaded constructor
	 */
	public attendance(int attendanceID, String empID, String date, String timein, String timeout) {
		super(attendanceID);
		this.empID = empID;
		this.date = date;
		this.timein = timein;
		this.timeout = timeout;
	}
	/**
	 * @return the attendanceID
	 */
	public int getAttendanceID() {
		return attendanceID;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @return the timein
	 */
	public String getTimein() {
		return timein;
	}
	/**
	 * @return the timeout
	 */
	public String getTimeout() {
		return timeout;
	}
	/**
	 * @return the empID
	 */
	public String getEmpID() {
		return empID;
	}
	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @param timein the timein to set
	 */
	public void setTimein(String timein) {
		this.timein = timein;
	}
	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	
	
	
}
