package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Event;

import java.util.List;

import Service.EventService;

/**
 * Servlet implementation class EventAll
 */
@WebServlet("/EventAll")
public class EventAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Event> all_events = EventService.findAll();
		request.setAttribute("all_events", all_events);
		request.getRequestDispatcher("/all_events.jsp").forward(request, response);
 	}

}
