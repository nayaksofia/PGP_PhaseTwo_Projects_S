
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Using JSP</title>
</head>
<body>
<h2><%= "Company : " + request.getParameter("company") + ", Location : " + request.getParameter("location") %></h2>
<form action="index.jsp" method="post">
<input type="text" placeholder="Your Name" name="userName"><br>
<input type="text" placeholder="Your Country" name="userCountry"><br>
<input type="submit" value="SUBMIT">
</form>
</body>
</html>