/**
 * 
 */
package com.oop.model.attendance;

/**
 * @author Salitha Ekanayaka
 * IT19121048
 * this is the parent class of attendance class
 *
 */
abstract class employeebehavior {
	/**
	 * declare variable
	 */
	protected int attendanceID;

	/**
	 * @param attendanceID
	 * overloaded constructor
	 */
	public employeebehavior(int attendanceID) {
		super();
		this.attendanceID = attendanceID;
	}
	
	
}
