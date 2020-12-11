/**
 * Salitha Ekanayaka
 * it19121048
 */
package com.oop.model.announcement;

/**
 *
 * Salitha Ekanayaka
 * it19121048
 *
 *
 */
public class announcement {
	private int id;
	private String title;
	private String date;
	private String day;
	private String description;
	/**
	 * @param id
	 * @param title
	 * @param date
	 * @param day
	 * @param description
	 */
	public announcement(int id, String title, String date, String day, String description) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.day = day;
		this.description = description;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
