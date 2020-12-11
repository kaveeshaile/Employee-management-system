package com.oop.servlet.attendance;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.attendance.Iattendance;
import com.oop.service.attendance.attendanceService;

/**
 * Servlet implementation class timeinServlet
 */
/**
 * 
 * @author SAlitha Ekanayaka
 * IT19121048
 * this the servlet to 
 * insert values in to
 * attendance table
 */
@WebServlet("/timeinServlet")
public class timeinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public timeinServlet() {
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
	        	String empID = request.getParameter("empID");
	    		String date = request.getParameter("date");
	    		String timein = request.getParameter("timein");
	    		String timeout = request.getParameter("timeout");
	    		Iattendance Iattendance = new attendanceService();
	    		Iattendance.addAttendance(empID, date, timein, timeout);
	    		RequestDispatcher dis = request.getRequestDispatcher("allAttendance.jsp");
	    		dis.forward(request, response);
		
		

	}

}
