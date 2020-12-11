package com.emp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/empII")
public class empII extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String department = request.getParameter("department");
		float BasicSalary = Float.parseFloat(request.getParameter("BasicSalary"));
		float deduction = Float.parseFloat(request.getParameter("deduction"));
		float overTime = Float.parseFloat (request.getParameter("overTime"));
		
		
		boolean isTrue;
		
		 isTrue = emplyoyeeDButil.insertemployee(id, name, department, BasicSalary, deduction, overTime);
		 if(isTrue == true) {
				
				RequestDispatcher dis = request.getRequestDispatcher("/success.jsp");
				dis.forward(request, response);
				
			}else {
				
				RequestDispatcher dis2 = request.getRequestDispatcher("/unsuccess.jsp");
				dis2.forward(request, response);
				
			}
	}

}
