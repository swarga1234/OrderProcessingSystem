<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" href = "Z:/javaprgrams/sample-app/bootstrap.min.css">
</head>
<body>
<h1>ORDER DETAILS</h1>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>
		
<form action = "AddProducts" method = "post"></form>	
<table class="table table-hover table-dark" id = "Table">
  <thead>
    <tr>
    <th scope="col">NAME</th>
      <th scope="col">CATEGORY</th>
      <th scope="col">PRICE</th>
    </tr>
  </thead>
  <tbody>
 <core:forEach items = "${listKey}" var = "u">
 	<tr> 
 	 <td> ${u.name}</td>
      <td>${u.category}</td>
      <td>${u.price}</td>
    </tr>
</core:forEach>
    </tbody>
    </table>
</body>
</html>