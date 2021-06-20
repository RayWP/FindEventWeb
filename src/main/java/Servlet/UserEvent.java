package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.User;

/**
 * Servlet implementation class UserEvent
 */
@WebServlet("/UserEvent")
public class UserEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	User current_user = (User) request.getSession().getAttribute("user");
		if(current_user == null) {
			resp.sendRedirect("login.jsp");
		} else {
			List<Event> all_events
			request.setAttribute("user", current_user);
			request.getRequestDispatcher("/user_profile.jsp").forward(request, response);
		}
    }

}
