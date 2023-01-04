<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;">
<%@ include file ="header.jsp" %>
 <form action="<%=request.getContextPath()%>/Add" method="post" style="background-color:skyblue;">
        <p>NAME:</p> 
        
        <input type="text" name="id"/>
   
        <p>NUMBER:</p> 
        <input type="text" name="name"/>

   
        <input type="submit" value="Register">
    </form>

</body>
</html>