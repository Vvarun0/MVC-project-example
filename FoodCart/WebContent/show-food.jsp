<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MENU</title>
</head>
<body>
<h1 align="center">Menu</h1>
<table border="2" cellpadding="30%" align="center">
<tr>
<th>id</th>
<th>item</th>
<th>price</th>
</tr>
 <c:forEach  var="items" items="${foodItems}">
 <tr>
 <td>${items.id}</td>
  <td>${items.item}</td>
   <td>${items.price}</td>
  
   </tr>
 </c:forEach>
 </table>
</body>
</html>