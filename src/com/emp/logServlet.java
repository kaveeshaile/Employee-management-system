package com.emp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logServlet")
public class logServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("EmpName");
		String id = request.getParameter("ID");
		
		try{
		
		List<employeePayment> empDetails = emplyoyeeDButil.validate(name, id);
		request.setAttribute("empDetails",empDetails );
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
        
		RequestDispatcher dispatcher = request.getRequestDispatcher("/useraccount.jsp");
		dispatcher.forward(request, response);
		
	}

		
	}


