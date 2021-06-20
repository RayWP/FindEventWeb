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
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("username");
		request.setAttribute("username", username);
		String email = request.getParameter("email");
		request.setAttribute("email", email);
		String description = request.getParameter("description");
		request.setAttribute("description", description);
		String password = request.getParameter("password");
		String re_password = request.getParameter("re_password");
		
		
//		if password and re-type password is not the same
		if(!password.equals(re_password)) {
			request.setAttribute("error", "Password and re-type do not match!");
			request.getRequestDispatcher("/register_user.jsp").forward(request, response);
		} else {
			User user = new User(username, re_password, email, description);
			int result = UserService.register(user);
			
//			if: failed to create account, else: success create account
			if(result<=0) {
				request.setAttribute("error", "Email has been used");
				request.getRequestDispatcher("/register_user.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/UserLogin").forward(request, response);
			}
			
		}
	}

}
