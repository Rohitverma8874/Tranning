<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 body{
background-image: url('https://coolbackgrounds.io/images/backgrounds/index/sea-edge-79ab30e2.png');

}
</style>
</head>
<body>

    <h1>Update Cart!!</h1>
    <form action="<%=request.getContextPath() %>/product/updateProduct">
       Cart Id: <input type="text" value="${id}" name="prodId"/><br/><br>
       Cart Name: <input type="text" value="${name}" name="prodName" /><br/><br>
       Cart Desc: <input type="text" value="${desc}" name="prodDesc"  /><br><br>
       Cart Price: <input type="text" value="${price}" name="price"  /> <br><br>
        
        <input type="submit" value="Update" />
    </form>
    
    <h3 style="color:red;">${updateMsg}</h3>

    
   
</body>
</html>