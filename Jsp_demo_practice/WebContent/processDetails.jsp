<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student" class="com.sofialearning.Student"></jsp:useBean>
<jsp:setProperty property="*" name="student"/>



<b>Details of the Student:</b><br>
Name: <jsp:getProperty property="studentName" name="student"/><br>
Address: <jsp:getProperty property="studentAddress" name="student"/><br>
Email: <jsp:getProperty property="studentEmail" name="student"/>
</body>
</html>