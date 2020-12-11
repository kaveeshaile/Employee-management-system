package com.oop.servlet.attendance;

import java.io.IOException;
import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.DatabaseConnectionUtil;
/**
 * 
 * @author SAlitha Ekanayaka
 * IT19121048
 * this the servlet to 
 * validate search function of attendance table
 * display get searched values 
 * send to display searched values
 */
/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public searchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		Connection connection;
		Statement statement;
		try {
			//connection is taken by databaseConnectionUtil file
			connection = DatabaseConnectionUtil.getConnection();
			String search = request.getParameter("search");
			//declare array values
			ArrayList arraylist = null;
			ArrayList search_list = new ArrayList();
			//sql to get searched attendance ID
			String sql = "select * from attendance where attendanceID = '" + search + "'";
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				//add values to arraylist if searched attendance ID is there
				arraylist = new ArrayList();
				arraylist.add(rs.getString(1));
				arraylist.add(rs.getString(2));
				arraylist.add(rs.getString(3));
				arraylist.add(rs.getString(4));
				arraylist.add(rs.getString(5));
				search_list.add(arraylist);
			}

			request.setAttribute("search_list", search_list);
			RequestDispatcher dis = request.getRequestDispatcher("searchedAttendance.jsp");
			dis.forward(request, response);
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
