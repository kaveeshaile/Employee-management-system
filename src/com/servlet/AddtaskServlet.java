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
 * insert/adding  data employee's task servlet
 * 
 */
/**
 * Servlet implementation class AddtaskServlet
 */
@WebServlet("/AddtaskServlet")
public class AddtaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String TaskId = request.getParameter("TaskId");
		String Title = request.getParameter("Title");
		String DueDate = request.getParameter("DueDate");
		String Description = request.getParameter("Description");
			
		
		boolean obj;
		AddtaskDButil addtaskDButil = new AddtaskDButil();
		obj=addtaskDButil.insertAddtask(TaskId,Title,DueDate,Description);
		
		
		if(obj==true) {
			RequestDispatcher dis = request.getRequestDispatcher("/Add task.jsp");
			dis.forward(request,response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("/emp inetrface.jsp");
			dis2.forward(request,response);
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
