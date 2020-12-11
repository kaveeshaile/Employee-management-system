package com.oop.servlet.EmployeeRegistration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.EmployeeRegistration.EmployeeDao;
import com.oop.service.EmployeeRegistration.EmpolyeeDaoImpl;


@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLoginServlet() {
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
		boolean isTrue1;
		PrintWriter out = response.getWriter();
		String position = request.getParameter("position");
		String userName = request.getParameter("user");
	    String password = request.getParameter("pass");
	    EmployeeDao EmployeeDeo = new EmpolyeeDaoImpl();
		isTrue1 = EmployeeDeo.adminloginvalidation(position,userName, password);
		if(isTrue1 == true)
		{
			RequestDispatcher dis = request.getRequestDispatcher("/AdminMainInterface.jsp");
			dis.forward(request, response);
		}
		else 
		{
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('please enter valid username or password');");
		    out.println("location='AdminLogin.jsp';");
		    out.println("</script>");
		}
	}

}
