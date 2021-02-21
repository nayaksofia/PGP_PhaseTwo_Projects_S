<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Working with JSP Action Tags</title>
</head>
<body>
<!-- Using the JSP ACtion tag : include -->
<jsp:include page="header.html"></jsp:include>

<jsp:include page="mainContent.jsp"></jsp:include>

<jsp:include page="footer.html"></jsp:include>


<!-- Using the forward action -->

<jsp:forward page="param.jsp">
	<jsp:param value="Simplilearn" name="company"/>
	<jsp:param value="Virtual" name="location"/>
</jsp:forward>
</body>
</html>