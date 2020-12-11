package com.oop.servlet.attendance;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.attendance.attendance;
import com.oop.service.attendance.Iattendance;
import com.oop.service.attendance.attendanceService;
/**
 * 
 * @author SAlitha Ekanayaka
 * IT19121048
 * this the servlet to update values 
 * in attendance table
 */
/**
 * Servlet implementation class UpdateAttendanceServlet
 */
@WebServlet("/UpdateAttendanceServlet")
public class UpdateAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAttendanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String attendanceID = request.getParameter("attendanceID");	
		int sid = Integer.parseInt(attendanceID);
		String empID = request.getParameter("empID");
		String date = request.getParameter("date");	
		String timein = request.getParameter("timein");	
		String timeout = request.getParameter("timeout");	
		attendance attendance = new attendance(sid,empID , date, timein, timeout);
		Iattendance Iattendance = new attendanceService();
		Iattendance.updateAttendance(attendanceID , attendance);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/allAttendance.jsp");
		dispatcher.forward(request, response);
	}

}
