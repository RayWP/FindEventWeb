package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Event;
import Service.EventService;

/**
 * Servlet implementation class EventDetail
 */
@WebServlet("/EventDetail")
public class EventDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id_string = request.getParameter("id");
		if(id_string != null) {
//			if the paremter is not null
			int id = Integer.valueOf(id_string);
			Event event = EventService.findEventWith(id);
			
			if(event == null) {
//				if event doest not exist
				response.sendRedirect("index.jsp");
			} else {
//				if event exist
				request.setAttribute("event", event);
				request.getRequestDispatcher("/detail_event.jsp").forward(request, response);
			}
		} else {
//			if the parameter is null
			response.sendRedirect("index.jsp");
		}
	}


}
