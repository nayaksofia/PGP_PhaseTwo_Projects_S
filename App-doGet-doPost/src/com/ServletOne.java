package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter Out = response.getWriter();
		String name = request.getParameter("fname");
		Out.print("Hello World, This is doGet Method.");
		Out.print("  Congratulations!!! " + name);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter Out = response.getWriter();
		String name = request.getParameter("fname");
		Out.print("Hello World, This is doPost Method.");
		Out.print("  Congratulations!!! " + name);
	}

}
