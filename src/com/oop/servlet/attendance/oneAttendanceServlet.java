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
 * this the servlet to select corresponding row in attendance table by attendance ID
 */
/**
 * Servlet implementation class oneAttendanceServlet
 */
@WebServlet("/oneAttendanceServlet")
public class oneAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public oneAttendanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

 		String attendanceID = request.getParameter("attendanceID");			
 		Iattendance Iattendance = new attendanceService();
		attendance attendance = Iattendance.getAttendancebyID(attendanceID);

		request.setAttribute("attendance", attendance);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/selected.jsp");
		dispatcher.forward(request, response);
	}

}
