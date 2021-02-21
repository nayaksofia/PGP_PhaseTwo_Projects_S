package com.sofi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Set the Content Type
		response.setContentType("text/html");
		
		//Get a Writer Reference Object
		PrintWriter out = response.getWriter();
		String pName=request.getParameter("personName");
		String pPassword = request.getParameter("personPassword");
				
		out.print("<h3>Welcome: </h3>"+ pName);
		out.print("  Your Password Is: " + pPassword);
		out.print("<br>");
		out.println("<h1>Congratulations!!!</h1>");
		out.print("<br>");
		out.print("<h1> You are now serving servlet :) </h1> ");
		
		  //Get the value out of the hidden form field
				String hName = request.getParameter("hdName");
				out.println("Welcome: " + hName); 		
				
        //Get value out of session 
				out.println(" <br> Value from Session : " + request.getSession().getAttribute("userName"));
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
