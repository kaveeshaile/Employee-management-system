package com.oop.servlet.announcement;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.service.announcement.Iannouncement;
import com.oop.service.announcement.announcementService;

/**
 * Servlet implementation class AnnouncementServlet
 */
/**
*
* Salitha Ekanayaka
* it19121048
* This is servlet to insert adverticement table data 
*
*/
@WebServlet("/AnnouncementServlet")
public class AnnouncementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnouncementServlet() {
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
		doGet(request, response);
		response.setContentType("text/html");
    	String title = request.getParameter("title");
    	String date = request.getParameter("date");
    	String day = request.getParameter("day");
    	String description = request.getParameter("description");
    	Iannouncement iannouncement = new announcementService();
    	iannouncement.addAnnouncement(title , date , day , description);
    	RequestDispatcher dis = request.getRequestDispatcher("displayAnnouncement.jsp");
		dis.forward(request, response);
	}

}
