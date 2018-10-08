<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div class="container">
        <a class="navbar-brand logo" href="#">
            <img src="assets/img/logo.png" alt="Evento"/>
        </a>
        </div>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="mystyle.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student login</title>
</head>
<body>
<div class="container" id=q1>
<div class="tp">
<br><h1>Student login</h1><br>
</div>
<form class="form-group tp" action= "StudentLogin" method= "post"> 
<br>Username: <input class="form-control" type= "text" name= "u_name" ><br>
<br>Password: <input class="form-control" type= "password" name= "password" ><br>
<br><input class="btn btn-primary" type= "submit" value= "Login">&nbsp;&nbsp;&nbsp;&nbsp;<a href="/EventManagement/Main.jsp"><input class="btn btn-primary" type= "button" value= "Previous"></a>
&nbsp;&nbsp;&nbsp;&nbsp;<a href="/EventManagement/SignUp.jsp"><input class="btn btn-primary" type= "button" value= "Sign Up ??"></a>
&nbsp;&nbsp;&nbsp;&nbsp;<a href="/EventManagement/Register.jsp"><input class="btn btn-primary" type= "button" value= "Register for an EVENT"></a>
</form>
<% if(request.getAttribute("auth")!=null)
{
%>
<span class="text-danger">
Wrong Credentials!!!
</span>
<%} %>
</div>
</body>
</html>