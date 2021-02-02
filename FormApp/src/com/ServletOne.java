package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set Content Type
		response.setContentType("text/html");
		
		//Get reference of Writer Object
		PrintWriter Out = response.getWriter();
		
		//Get the value from Request Parameter
		String pName = request.getParameter("personname");
		Out.println("Congratulations!!!!!  " + pName +".");
		
		Out.print("<br><br>");
		Out.println("Your Form Submitted Successfully :) ");
		Out.print("<br><br>");
		Out.print("Wish You All The Best! <br>  " + pName +".");
		Out.print("<br><br>");
		Out.print(new Date());
	}



	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
