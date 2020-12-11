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

import com.util.AddtaskDButil;


/*
 * delete employee's tasks servlet
 */

/**
 * Servlet implementation class DeleteTaskServlet
 */
@WebServlet("/DeleteTaskServlet")
public class DeleteTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskId=request.getParameter("taskId");
		String title=request.getParameter("title");
		String dueDate=request.getParameter("dueDate");
		String description=request.getParameter("description");
	
		
		boolean isTrue;
		AddtaskDButil addtaskDButil = new AddtaskDButil();
		isTrue=addtaskDButil.DeleteTask(taskId, title, dueDate, description);
		
		if(isTrue==true){
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		
	}

	}}
