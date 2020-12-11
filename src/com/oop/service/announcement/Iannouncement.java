/**
 * Salitha Ekanayaka
 * it19121048
 */
package com.oop.service.announcement;

import java.util.ArrayList;

import com.oop.model.announcement.announcement;


/**
 *
 * Salitha Ekanayaka
 * it19121048
 *
 *
 */
public interface Iannouncement {
	/* add announcement*/
	void addAnnouncement(String title, String date, String day, String description);
	/* Get all list of announcement*/
	public ArrayList<announcement> getAnnouncement();
	/* select an announcement table row*/
	public announcement getAnnouncementbyID(String id);
	/* Update existing announcement*/
	void updateAnnouncement(String anid, announcement announcement);
	/* Remove existing announcement*/
	void removeAnnouncement(String id);
}
