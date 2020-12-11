package com.employee;

/*
 * This is the employee's task model. 
 */


public class Task {

	
	private int taskId;
	private String title;
	private String dueDate;
	private String description;
	
	public Task(int taskId, String title, String dueDate, String description) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.dueDate = dueDate;
		this.description = description;
	}

	/*
	 *return the TaskId. 
	 */
		
	public int getTaskId() {
		return taskId;
	}
/*
 * @param TaskId the taskId to set.
 */
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
/*
 * return the title.
 */
	public String getTitle() {
		return title;
	}
	
	/*
	 * @param Title the title to set
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * return the DueDate.
	 */
	
	public String getDueDate() {
		return dueDate;
	}
/*
 * @param DueDate the dueDate to set.
 */
	
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	/*
	 * return the Description.
	 */
	
	
	
	public String getDescription() {
		return description;
	}

	/*
	 * @param Description the description to set.
	 */
	
	
	
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
	
	
	
	
	
		
		
}
