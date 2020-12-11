package com.oop.servlet.EmployeeRegistration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.oop.service.EmployeeRegistration.EmployeeDao;
import com.oop.service.EmployeeRegistration.EmpolyeeDaoImpl;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		String EmployeeID = request.getParameter("EmployeeID");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String position = request.getParameter("position");
		String username = request.getParameter("username");
		String password = request.getParameter("password");



		EmployeeDao EmployeeDeo = new EmpolyeeDaoImpl();
		EmployeeDeo.addRegistration(EmployeeID, name, email, gender, address,position, username, password);

		RequestDispatcher dis1 = request.getRequestDispatcher("/DisplayEmployeeDetails.jsp");
		dis1.forward(request, response);

	}

}
