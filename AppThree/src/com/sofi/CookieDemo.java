package com.sofi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   //Create a Cookie 
		Cookie myCookie = new Cookie("testCookie", "SimplilearnUser");
		
  // Set the Expire Of this cookie 
		myCookie. setMaxAge(3600);
		
   // Add the cookie to the response 
		response .addCookie(myCookie);

	//Get reference to the writer object
		PrintWriter out = response.getWriter();
		
  //Fetch the value from our cookie
		out.println(myCookie.getValue());
		
	//Get reference to the Cookies
		Cookie [] cookies = request.getCookies();
		
	//Traverse through the cookies
		for(Cookie theCookie : cookies) {
			
//			out.println("<br/>" + theCookie.getValue());
//			out.println("<br/>" + theCookie.getMaxAge());
			
			if(theCookie.getValue().equals("SimplilearnUser")) {
				response.sendRedirect("index.html");
			}
		
		}
	}
}


