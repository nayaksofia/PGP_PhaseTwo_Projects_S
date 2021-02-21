package com.sofi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
@WebServlet(urlPatterns = "/ServletConfigDemo" , initParams = {@WebInitParam(name = "jdbcDriver", value = "com.mysql.cj.jdbc.Driver")})
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Set Content Type
		response.setContentType("text/html");
		
		//Get a reference to the writer object
		PrintWriter out= response.getWriter();
		
		//Get a reference to the ServletConfig object
		ServletConfig config = getServletConfig();
		
		//Print name of this Servlet
		//out.println(config.getServletName());
		
		// String dbDriver = "com.mysql.cj.jdbc.Driver";
		
		//Get the value out of the init param
		out.println("<h1>" + config.getInitParameter("jdbcDriver") + "</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
