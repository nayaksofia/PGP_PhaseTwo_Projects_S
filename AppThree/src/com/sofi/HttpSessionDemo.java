package com.sofi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HttpSessionDemo")
public class HttpSessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	//Get a reference to session object
		HttpSession theSession = request.getSession();
		
	//Put a new value into the session
		theSession.setAttribute ("userName", "Saurav");
		
	}

}
