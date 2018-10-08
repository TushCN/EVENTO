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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><title>Admin</title>
<title>Student</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//http 1.1
response.setHeader("Pragma", "no-cache");//http 1.0
response.setHeader("Expires", "0");//proxies
if(session.getAttribute("username")==null)
{
	response.sendRedirect("StuLogin.jsp");	
}
%>
<div class="container" id="show" style="background-image:url('assets/img/bg/slider.png');" >
<div class="tp">
<br>Welcome ${username}
</div>

<form class="form-group tp" action= "Showall" method= "post"> 
<br><input class="btn btn-info" type= "submit" value= "SHOW ALL UPCOMING EVENTS">
</form>

<form class="form-group tp" action= "Showspec" method= "post" style="padding-right: 63px;"> 
<br>Search: <input class="btn btn-secondary"  type= "text" name= "ser">
<input class="btn btn-info" type= "submit" value= "Search" >
</form>

<form class="form-group tp" action= "Logout" method="post">
<br><input class="btn btn-primary" type= "submit" value= "Logout">
</form>

</div>
</body>
</html>