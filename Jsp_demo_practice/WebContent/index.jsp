
<%@page trimDirectiveWhitespaces="true" import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Using JSP Declarations -->
<%!
float fr;

int add(int firstNum, int secondNum){
	return firstNum + secondNum;
}

%>

<!-- Using JSP implicit objects -->
<%  response.setContentType("text/html");%>

<!-- Using response implicit object here -->
<%-- <% response.sendRedirect("demo.html"); %> --%>

<!-- Using the JSP implict object: request -->
<%= "<h1>Welcome " + request.getParameter("userName") + "</h1>" %>

<!-- Using the JSP implicit object: session, application -->
<%
	session.setAttribute("uName", request.getParameter("userName"));// Set the value in the session
	application.setAttribute("uName", request.getParameter("userName"));// Set the userName into ServletContext
	if(session.getAttribute("uName").equals("admin"))
	request.getRequestDispatcher("demo.html").include(request, response);
%>


</body>
</html>