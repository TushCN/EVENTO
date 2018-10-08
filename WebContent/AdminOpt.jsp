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
<div class="container">
<br><b style=" text-transform: uppercase;"> <h1> Welcome ${username}</h1></b><br>
<form class="f2" action= "Logout" method= "post">
<a href= "InsertRec.jsp"> 
<br><button class="btn" type= "button" style="width:  135px;">Insert new records</button><br>
</a>
<a href= "InsertEvent.jsp"> 
<br><button class="btn" type= "button" style="width:  135px;">Insert new Events</button><br>
</a>
<a href= "UpdateEvent.jsp"> 
<br><button class="btn" type= "button" style="width:  135px;" >Update events</button><br>
</a>
<a href= "ChngPass.jsp"> 
<br><button class="btn" type= "button" style="width:  135px;" >Change password</button><br>
</a>
<a href= "DeleteEve.jsp"> 
<br><button class="btn" type= "button" style="width:  135px;">Delete events</button><br>
</a>
<a href= "DeleteRec.jsp"> 
<br><button class="btn" type= "button" style="width:  135px;">Delete Record</button><br>
</a>
<br><button class="btn"  type= "button" style="width:  135px;" >Logout</button><br>
</form>
</div>
</body>
</html>