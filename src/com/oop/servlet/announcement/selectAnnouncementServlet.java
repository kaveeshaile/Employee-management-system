package com.oop.servlet.announcement;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.announcement.announcement;
import com.oop.service.announcement.Iannouncement;
import com.oop.service.announcement.announcementService;

/**
 * Servlet implementation class selectAnnouncementServlet
 */
@WebServlet("/selectAnnouncementServlet")
public class selectAnnouncementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectAnnouncementServlet() {
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
		String id = request.getParameter("id");			
 		Iannouncement Iannouncement = new announcementService();
 		announcement announcement = Iannouncement.getAnnouncementbyID(id);

		request.setAttribute("announcement", announcement);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/selectedAnnouncement.jsp");
		dispatcher.forward(request, response);
	}

}
