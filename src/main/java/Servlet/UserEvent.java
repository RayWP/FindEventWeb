package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Event;
import Entity.User;
import Service.EventService;

/**
 * Servlet implementation class UserEvent
 */
@WebServlet("/UserEvent")
public class UserEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(req, resp);
		}
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	User current_user = (User) req.getSession().getAttribute("user");
		if(current_user == null) {
			resp.sendRedirect("login.jsp");
		} else {
			int holder_id = current_user.getId();
			List<Event> all_events = EventService.findEventMadeBy(holder_id);
			req.setAttribute("all_events", all_events);
			req.getRequestDispatcher("/dashboard.jsp").forward(req, resp);
		}
    }

}
