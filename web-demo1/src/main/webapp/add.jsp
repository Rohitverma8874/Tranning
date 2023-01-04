<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Register page</title>
</head>
<body style="text-align:center;">
<%@ include file ="header.jsp" %>
 <form action="/web-demo1/Add" method="post">
        <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
        <h3>Register here</h3>

        <label for="username">USER ID:</label>
        <input type="text" placeholder="Enter User Id" name="id">

        <label for="password">NUMBER:</label>
        <input type="password" placeholder="Password" name="name">

        <button type="submit">Register</button>
       
    </form>

</body>
</html>