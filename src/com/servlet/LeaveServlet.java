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
 * insert/adding employee's leave servlet.
 */





/**
 * Servlet implementation class LeaveServlet
 */
@WebServlet("/LeaveServlet")
public class LeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String EmployeeId = request.getParameter("EmployeeId");
		String EmployeeName = request.getParameter("EmployeeName");
		String Duration = request.getParameter("Duration");
		String[] LeaveType = request.getParameterValues("LeaveType");
		String s = LeaveType[0];
		String Reason=request.getParameter("Reason");
		
		
		
		boolean obj;
		EmployeeDButil employeeDButil= new EmployeeDButil();
		obj=employeeDButil.insertemployee(EmployeeId, EmployeeName, Duration, s, Reason);
		
		
		
		if(obj == true) {
			RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("emp inetrface.jsp");
			dis2.forward(request, response);
		}
		
		
		
	}

	

	
}
