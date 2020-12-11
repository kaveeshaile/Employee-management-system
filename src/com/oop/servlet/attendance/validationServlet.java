package com.oop.servlet.attendance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.EmployeeRegistration.employee;
import com.oop.service.attendance.Iattendance;
import com.oop.service.attendance.attendanceService;

/**
 * Servlet implementation class validationServlet
 */
@WebServlet("/validationServlet")
public class validationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean isTrue;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
    	String empID = request.getParameter("empID");
		Iattendance Iattendance = new attendanceService();
		isTrue = Iattendance.addValidation(empID);
		if(isTrue == true)
		{
			Iattendance Iattendance1 = new attendanceService();
			employee employeevalid = Iattendance1.employeeIDValidation(empID);
			request.setAttribute("employeevalid", employeevalid);
			RequestDispatcher dis = request.getRequestDispatcher("/timein.jsp");
			dis.forward(request, response);
		}
		else 
		{
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('please enter valid employeeID');");
		    out.println("location='validEmployeeID.jsp';");
		    out.println("</script>");
		    
		}
		
	}

}
