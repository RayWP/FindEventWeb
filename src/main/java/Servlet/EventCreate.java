package Servlet;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Entity.Event;
import Entity.User;
import Service.EventService;

/**
 * Servlet implementation class EventCreate
 */
@MultipartConfig
@WebServlet("/EventCreate")
public class EventCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User current_user = (User) request.getSession().getAttribute("user");
		if(current_user == null) {
			response.sendRedirect("login.jsp");
		} else {
			int id = current_user.getId();
			String name = request.getParameter("event_name");
			String link = request.getParameter("event_link");
			String speaker = request.getParameter("event_speaker");
			String description = request.getParameter("event_description");
			String date_in_string = request.getParameter("event_date");
			
			Date date = convertToDate(date_in_string);
			
			Event new_event = new Event(name, description, date, id, link, description, speaker);
			
			String image_path = "EventPicture"+File.separator;
			String image_type = "";
			long random_id = Math.round(Math.random() * 100); //add additional name to the book name
			Part file_part = request.getPart("event_image");
			
//			if user upload a file
			if(file_part != null) {
//				if the file is an image
				if(file_part.getContentType().contains("image")) {
					image_type = "." + file_part.getContentType().split("/")[1]; //get the type of the content
							   		//ex: image/jpeg will get .jpeg	
					System.out.println("uploadded to: + " + request.getServletContext().getRealPath("")+File.separator+image_path);
					System.out.println("yang di DB: " + image_path);
					image_path = image_path + name + random_id + image_type;
					file_part.write(request.getServletContext().getRealPath("")+File.separator+image_path); //save picture to file
					
					System.out.println("uploadded to: + " + request.getServletContext().getRealPath("")+File.separator+image_path);
					System.out.println("yang di DB: " + image_path);
					
					new_event.setImage_path(image_path);
				} 
			}
			
			
			String result = EventService.createEvent(new_event);
			request.setAttribute("alert", result);
			request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
		}
	}

	private Date convertToDate(String date_in_string) {
		try {
			String[] date_arr = date_in_string.split("-");
			System.out.println("date: " + date_in_string);
			Date date = new Calendar.Builder().setDate(
													Integer.valueOf(date_arr[0]), 
													Integer.valueOf(date_arr[1])-1, 
													Integer.valueOf(date_arr[2])).build().getTime();
			return date;
		} catch (Exception e) {
			return null;
		}
		
	}

}
