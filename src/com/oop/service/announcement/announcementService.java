/**
 * Salitha Ekanayaka
 * it19121048
 */
package com.oop.service.announcement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.model.announcement.announcement;
import com.oop.util.DatabaseConnectionUtil;

/**
 *
 * Salitha Ekanayaka
 * it19121048
 *
 *
 */
public class announcementService implements Iannouncement {
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(announcementService.class.getName());
	/**
	 * This method create a table structure to insert announcement entries if initially a table is not created in announcement table
	 */
	public static void createAnnouncementTable() {
		try {
				//call databaseConnectionUtil to get connection
				connection = DatabaseConnectionUtil.getConnection();
				// this the query to create a table when table it not excists
			PreparedStatement preparedStatement = connection.prepareStatement(
					"CREATE TABLE IF NOT EXISTS announcement(id int NOT NULL,title varchar(45),date varchar(45),day varchar(45) , description varchar(2000),PRIMARY KEY(id)");
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			System.out.println("creating table complete");
		}

	}
	/**
	 * This method insert data to announcement table
	 */
	public void addAnnouncement(String title, String date, String day, String description) {
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			statement = connection.createStatement();
			// this the query to insert values to announcement table
			String sql = "INSERT INTO announcement values(0,'"+title+"','"+date+"','"+day+"','"+description+"')";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
					
				}
			} 
			catch (SQLException e) {
				System.out.println(e);
			}
			
		}
	}
	/**
	 * This method display announcement table when values are inserted
	 */
	@Override
	public ArrayList<announcement> getAnnouncement() {
		ArrayList<announcement> announcementList = new ArrayList<announcement>();
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			// this the query to select all values in announcement table
			String sql = "SELECT * FROM announcement";
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String title= resultSet.getString(2);
				String date= resultSet.getString(3);
				String day = resultSet.getString(4);
				String description = resultSet.getString(5);
				announcement an = new announcement(id, title, date, day, description);
				announcementList.add(an);
			preparedStatement.close();
		    }

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return announcementList;
	}
	/**
	 * This method get selected announcement id when we want to select 
	 */
	@Override
	public announcement getAnnouncementbyID(String id) {
		// TODO Auto-generated method stub
		return actionAnnouncement(id).get(0);
	}
	/**
	 * this method make an arrayList when we select an attendance ID
	 */
	private ArrayList<announcement> actionAnnouncement(String id) {
		ArrayList<announcement> announcementList1 = new ArrayList<announcement>();
		try {
			//call databaseConnectionUtil to get connection
			connection = DatabaseConnectionUtil.getConnection();
			/*
			 * Before fetching check  whether announcement ID is available
			 */
			if (id != null && !id.isEmpty()) {
				// this the query to select all records for corresponding announcementID in announcement table
				String sql = "select * from announcement where id = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, id);
			}
			else {
				// this the query to select all values in announcement table
				String sql = "select * from announcement";
				preparedStatement = connection.prepareStatement(sql);
			}
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				announcement announcement = new announcement(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3), resultSet.getString(4) ,  resultSet.getString(5));
				announcementList1.add(announcement);
			}

		} catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end
			 * of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return announcementList1;
	}
	/**
	 * This method update corresponding inserted values in announcement table
	 */
	@Override
	public void updateAnnouncement(String anid, announcement announcement) {
		/*
		 * Before updating check  whether announcement ID is available
		 */
		if (anid !=null && !anid.isEmpty()) {
			try {
				//call databaseConnectionUtil to get connection
				connection = DatabaseConnectionUtil.getConnection();
				// this the query to update values in announcement table
				 String sql= "update announcement as a set a.title = ?,a.date = ? , a.day = ? , a.description = ? where a.id = '"+anid+"'";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, announcement.getTitle());
				preparedStatement.setString(2, announcement.getDate());
				preparedStatement.setString(3, announcement.getDay());
				preparedStatement.setString(4, announcement.getDescription());
				preparedStatement.executeUpdate();

			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}
		
	}
	/**
	 * This method delete a raw in announcement table when we want to remove
	 */
	@Override
	public void removeAnnouncement(String id) {
		/*
		 * Before deleting check  whether announcement ID is available
		 */
		if (id !=null && !id.isEmpty()) {
			try {
				//call databaseConnectionUtil to get connection
				connection = DatabaseConnectionUtil.getConnection();
				// this the query to deiete a row in announcement table
				String sql = "DELETE FROM announcement WHERE id = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, id);
				preparedStatement.executeUpdate();
			} catch (Exception e) {
				log.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end
				 * of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					System.out.println(e);
				}
			}
		}
		
	}

}
