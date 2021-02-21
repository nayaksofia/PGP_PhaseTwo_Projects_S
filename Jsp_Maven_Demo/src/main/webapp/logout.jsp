<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogOut</title>
</head>
<body>
<%
 //Terminate the current Session
 session.invalidate(); 
 
 //Redirect to the index page
 response.sendRedirect("login.jsp");
 
 %>
</body>
</html>