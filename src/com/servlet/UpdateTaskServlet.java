package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.AddtaskDButil;
import com.util.EmployeeDButil;
/*
IT19106502
I.K.madhubhashana.
 */
/**
 * Servlet implementation class UpdateTaskServlet
 */
@WebServlet("/UpdateTaskServlet")
public class UpdateTaskServlet extends HttpServlet {
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
		isTrue=addtaskDButil.UpdateTask(taskId, title, dueDate, description);
		
		if(isTrue==true){
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		
		
		
	}

}
}
