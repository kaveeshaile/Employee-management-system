package com.servlet;
/*
IT19106502
I.K.madhubhashana.
 */
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.employee.Leave;
import com.util.EmployeeDButil;
/*
 * display employee's leave form servlet.
 */

/**
 * Servlet implementation class DisplayleaveServlet
 */
@WebServlet("/DisplayleaveServlet")
public class DisplayleaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDButil employeeDButil= new EmployeeDButil();
		HttpSession session = request.getSession();
		ArrayList<Leave> leave  =  employeeDButil.getleavelist();
		session.setAttribute("leave", leave);





	RequestDispatcher dis = request.getRequestDispatcher("Displayleave.jsp");
	dis.forward(request,response);

	
	
}
		
		
		
		
		
		
		
		
	}


