package com.servlet;
/*
IT19106502
I.K.madhubhashana.
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.EmployeeDButil;
/*
 * delete employee's leaves servlet.
 */


/**
 * Servlet implementation class DeleteLeaveServlet
 */
@WebServlet("/DeleteLeaveServlet")
public class DeleteLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String employeeId=request.getParameter("employeeId");
		String employeeName=request.getParameter("employeeName");
		String leaveType=request.getParameter("leaveType");
		String duration=request.getParameter("duration");
		String reason=request.getParameter("reason");
		
		boolean isTrue;
		EmployeeDButil employeeDButil= new EmployeeDButil();
		isTrue=employeeDButil.DeleteLeave(employeeId,employeeName, leaveType, duration, reason);
		
		if(isTrue==true){
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);

			
		}
	}
	}


