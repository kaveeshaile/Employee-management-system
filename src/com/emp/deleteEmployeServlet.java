package com.emp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteEmployeServlet")
public class deleteEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
boolean isTrue;
		
		isTrue = emplyoyeeDButil.DeleteEmploye(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("/success.jsp");
			dis.forward(request, response);
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("/unsuccess.jsp");
			dis2.forward(request, response);
		
	}

}
}
