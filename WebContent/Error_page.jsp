<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Sorry an exception occured !</h3>  
  
<% 
Object err;
err=request.getAttribute("error");
%>

Exception is: <%=err %>  
  
<a href= "Main.jsp">REDIRECT</a>

</body>
</html>

