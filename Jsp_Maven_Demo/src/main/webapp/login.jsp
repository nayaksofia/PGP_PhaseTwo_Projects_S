<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/login.css">
</head>
<body>
<!-- Design the form ; reference W3School with CSS -->
<form action="first.jsp" method="post">
  <div class="imgcontainer">
    <img src="image/img_avtar1.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Enter Your Name:  </b></label>
    <input type="text" placeholder="Enter Your Name" name="uname" required>

    <label for="psw"><b>Enter Your Password</b></label>
    <input type="password" placeholder="Enter Your Password" name="psw" required>
        
    <button type="submit">Login</button>
  </div>

</form>

</body>
</html>