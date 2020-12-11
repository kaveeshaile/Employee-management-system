package com.service;
/*
IT19106502
I.k.madhubhashana
*/
import java.util.ArrayList;

import com.employee.Leave;
/*
 * Implement of employee leave form.
 */
public interface LeaveService {

	/*
	 * remove the detail of leave form.
	 */
	public boolean DeleteLeave(String employeeId, String employeeName, String leaveType, String duration, String reason);
	
	/*
	 * update the detail of leave form.
	 */
	public boolean UpdateLeave(String employeeId, String employeeName, String leaveType, String duration, String reason);
	/*
	 * list the detail of leave form.
	 */
	public  ArrayList<Leave> getleavelist();
	
	/*
	 * add/insert the detail in to the  leave form.
	 */
	public boolean insertemployee(String  EmployeeId,String EmployeeName,String Duration,String LeaveType,String Reason);
	
	
	
	
	
	
}
