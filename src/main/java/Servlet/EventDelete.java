package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Event;
import Entity.User;
import Service.EventService;

/**
 * Servlet implementation class EventDelete
 */
@WebServlet("/EventDelete")
public class EventDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User current_user = (User) request.getSession().getAttribute("user");
		
		if(current_user == null) {
//			if the user still not logged in, we will redirect them to login.jsp
			response.sendRedirect("login.jsp");
		} else {
			int holder_id = current_user.getId();
			String id_string = request.getParameter("id");
			if(id_string != null) {
//				if the paremter is not null, we will delete the event
				int id = Integer.valueOf(id_string);
				
				Event delete_event = new Event(id, holder_id);
				
				String result = EventService.delete(delete_event);
				
				request.setAttribute("alert", result);
				request.getRequestDispatcher("/UserEvent").forward(request, response);
				
			} else {
//				if the parameter is null we will send them back to index.jsp
				response.sendRedirect("index.jsp");
			}
		}
	}

}
