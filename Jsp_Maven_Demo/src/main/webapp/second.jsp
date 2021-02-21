<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Success</title>
</head>
<body>

<font size= 7> Welcome <%= session.getAttribute("uName") %> </font>
<br> <br>
<font size = 6 ><a href="logout.jsp"> LogOut </a>
</font>

</body>
</html>