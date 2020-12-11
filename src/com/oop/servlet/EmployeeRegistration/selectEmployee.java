package com.oop.servlet.EmployeeRegistration;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.EmployeeRegistration.employee;
import com.oop.service.EmployeeRegistration.EmployeeDao;
import com.oop.service.EmployeeRegistration.EmpolyeeDaoImpl;

/**
 * Servlet implementation class selectEmployee
 */
@WebServlet("/selectEmployee")
public class selectEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		String EmployeeID = request.getParameter("employeeID");
		EmployeeDao EmployeeDeo = new EmpolyeeDaoImpl();
		employee employee = EmployeeDeo.getEmployeedetailsbyID(EmployeeID);
		request.setAttribute("employee", employee);
		RequestDispatcher dis = request.getRequestDispatcher("/SelectEmployee.jsp");
		dis.forward(request, response);
	}

}
