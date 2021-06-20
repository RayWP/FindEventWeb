package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.User;
import Service.UserService;

/**
 * Servlet implementation class UserProfile
 */
@WebServlet("/UserProfile")
public class UserProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User current_user = (User) request.getSession().getAttribute("user");
		if(current_user == null) {
			response.sendRedirect("login.jsp");
		} else {
			request.setAttribute("user", current_user);
			request.getRequestDispatcher("/user_profile.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	for updating
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		request.setAttribute("username", username);
		
		String email = request.getParameter("email");
		request.setAttribute("email", email);
		
		String description = request.getParameter("description");
		request.setAttribute("description", description);
		
		User current_user = (User) request.getSession().getAttribute("user");
		
		if(current_user != null) {
			int id = current_user.getId();
			
//			if password and re-type password is not the same
			User user = new User(id, username,  email, description);
			int result = UserService.update(user);
			
//				if: failed to create account, else: success create account
			if(result<=0) {
				request.setAttribute("alert", "Email has been used");
			} else {
				current_user.setUsername(username);
				current_user.setDescription(description);
				request.getSession().setAttribute("user", current_user);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
		} else {
			response.sendRedirect("login.jsp");
		}
		
		
			
	}
}
