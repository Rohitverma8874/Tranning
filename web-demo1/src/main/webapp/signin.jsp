<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file ="header.jsp" %>
<form action="/web-demo1/WelcomeServlet" method="post">
 
 <label>UserName:</label>
 <input type ="text" name="uname" placeholder="Enter username"/><br><br>
  
 <label>Number:</label>
 <input type ="text" name="pwd"><br><br>
 <input type = "submit" value="Submit" >
 </form>

</body>
</html>