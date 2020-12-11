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

import com.employee.Task;
import com.util.AddtaskDButil;

/*
 * display employee's task servlet.
 */


/**
 * Servlet implementation class DisplaytaskServlet
 */
@WebServlet("/DisplaytaskServlet")
public class DisplaytaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		AddtaskDButil addtaskDButil = new AddtaskDButil();
				ArrayList<Task> tasks  =  addtaskDButil.gettasklist();
		session.setAttribute("tasks", tasks);
        
		
		
		
		
			RequestDispatcher dis = request.getRequestDispatcher("Displaytask.jsp");
			dis.forward(request,response);
		
			
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


