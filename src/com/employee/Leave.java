package com.employee;
/*
 * This is the employee leave application model.
 */
public class Leave {

	private String employeeId;
	private String employeeName;
	private String duration;
	private String leaveType;
	private String reason;
	
	
	
	
	
	public Leave(String employeeId, String employeeName, String duration, String leaveType, String reason) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.duration = duration;
		this.leaveType = leaveType;
		this.reason = reason;
	}



/*
 * return the EmployeeId
 */

	public String getEmployeeId() {
		return employeeId;
	}


/*
 * @param Employee Id the employeeId to set
 */


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


/*
 * return the EmployeeName.
 */


	public String getEmployeeName() {
		return employeeName;
	}


/*
 * @param EmployeeName
 * the employeeName to set
 */


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


/*
 * return the Duration.
 */


	public String getDuration() {
		return duration;
	}


/*
 * @param Duration the duration to set
 */


	public void setDuration(String duration) {
		this.duration = duration;
	}

/*
 * return LeaveType
 */



	public String getLeaveType() {
		return leaveType;
	}


/*
 * @param Leavetype the leaveType to set
 */


	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

/*
 * return Reason.
 */



	public String getReason() {
		return reason;
	}


/*
 * @param Reason the reason to set
 */


	public void setReason(String reason) {
		this.reason = reason;
	}





	




	






	
	
	
	
	
	
}
