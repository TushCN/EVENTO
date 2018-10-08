<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<div class="container" id="e1">
        <a class="navbar-brand logo" href="#">
            <img src="assets/img/logo.png" alt="Evento"/>
        </a></div>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="mystyle.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><title>Admin</title>
<title>Update Event</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//http 1.1
response.setHeader("Pragma", "no-cache");//http 1.0
response.setHeader("Expires", "0");//proxies
if(session.getAttribute("username")==null)
{
	response.sendRedirect("AdminLogin.jsp");
	}
%>
<div class="container tp bc" id="shown">
<br><h1 class="f2">Update event</h1><br>
<form class="form-group" action= "UpdateEvent" method= "post">
Event name* <input class="form-control" type= "text" name= "e_name" ><br><br>
Date* <input class="form-control" type= "text" name="dt" ><br><br>
Venue* <input class="form-control" type= "text" name= "venue" ><br><br>
Fees <input class="form-control" type= "text" name= "fees"><br><br>
About* <input class="form-control" type= "text" name= "about" ><br><br>
<div class="f2">
<input class="btn btn-primary " type= "submit" value= "Update event" >
</div>
</form>
<form class="form-group" action= "Logout" method= "post">
<div class="f2">
<input class="btn btn-primary " type= "submit" value= "Logout">&nbsp;&nbsp;&nbsp;&nbsp;<a href="/EventManagement/AdminOpt.jsp"><input class="btn btn-primary" type= "button" value= "Previous"></a>
</div>
</form>
</div>
</body>
</html>