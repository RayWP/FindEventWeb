/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.User;
import Service.UserService;

/**
 *
 * @author Raymond WP aka rwp1byte
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	User user = new User(password, email);
    	user = UserService.login(user);
    	if(user == null) {
    		req.setAttribute("error", "User not found/password or username is wrong");
    		req.getRequestDispatcher("/login.jsp").forward(req, resp);
    		
    	} else {
    		req.getSession().setAttribute("user", user);
    		resp.sendRedirect("index.jsp");
    	}
    }

}
