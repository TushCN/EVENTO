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
<title>Register</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//http 1.1
response.setHeader("Pragma", "no-cache");//http 1.0
response.setHeader("Expires", "0");//proxies
%>
<div class="container" id=q1>
<div class="tp">
<br><h1>Event Registration</h1><br>
</div>
<form class="form-group tp" action= "Register" method= "post"> 
<br>User-Name: <input class="form-control" type= "text" name= "u_name" ><br>
<br>Event-Name: <input class="form-control" type= "text" name= "e_name" ><br>
<input class="btn btn-primary" type="submit" value="Register">&nbsp;&nbsp;&nbsp;&nbsp;<a href="/EventManagement/StuLogin.jsp"><input class="btn btn-primary" type= "button" value= "Previous"></a>
</form>
<% if(request.getAttribute("auth")!=null)
{
%>
<span class="text-danger">
UserName or EventName is WRONG !!!
</span>
<%} %>
</div>
</body>
</html>