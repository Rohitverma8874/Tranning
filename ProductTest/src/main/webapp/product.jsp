<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h1>Add Product</h1>
<form action="/ProductTest/InsertData" method="post">
        <p>Prod ID:</p> 
        
        <input type="text" name="id"/>
        <br/>
        <p>Prod Name:</p> 
        <input type="text" name="pname"/>
        <br/>
         <p>Prod Desc:</p> 
        <input type="text" name="pdesc"/><br/>
         <p>Price:</p> 
        <input type="text" name="pric"/><br/><br/>
        <input type="submit" value="show">
    </form>

</body>
</html>