<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h1>Login Page</h1>
<form action="/ProductTest/welcomeServlet" method="post">
<input type = "text" name="uname" placeholder ="Enter username"/><br><br>
<input type = "password" name="pwd" placeholder ="Enter password"/><br><br>
<input type = "submit" value = "LogIn"/><br><br>
</form>

</body>
</html>