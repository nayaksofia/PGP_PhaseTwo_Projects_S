package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Set the content type
		response.setContentType("text/html");
		
		 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		/*Note:
		 * RequestDispatcher : It is an interface.
		 * RequestDispatcher : Provides the facility of dispatching the request to another resource like html,servlet or jsp
		 *                   and also used to include the content of another resource. 
		 * RequestDispatcher : It is one of the way of servlet collaboration. 
		 */
		RequestDispatcher rd = null;
		
		if(username.equals("Sofia") && password.equals("Shagun")) {
			
			rd = request.getRequestDispatcher("SuccessServlet"); //Navigate to another servlet by using forward method
			rd.forward(request, response);
		}else {
			rd = request.getRequestDispatcher("login.html"); //Include the content of index.html using include method 
			PrintWriter out = response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid Credentials!!!!!</span> </center>");
			
		}
		
	}

}
