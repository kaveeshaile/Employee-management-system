package com.service;
/*
 IT19106502
 I.k.madhubhashana
 */
import java.util.ArrayList;

import com.employee.Task;

/*
 * Implement of task form.
 */

public interface TaskService {
	/*
	 * insert/add into the detail of task form.
	 */
	public boolean insertAddtask(String TaskId,String Title,String DueDate,String Description);
	/*
	 * list the detail of task form.
	 */
	public  ArrayList<Task> gettasklist();
	/*
	 * update the detail of task form.
	 */
	public  boolean UpdateTask(String taskId, String title, String dueDate, String description);
	/*
	 * remove the detail of task form.
	 */
	public  boolean DeleteTask(String taskId, String title, String dueDate, String description);

		
	
}
