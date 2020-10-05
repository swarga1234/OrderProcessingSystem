<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
 <link rel ="stylesheet" href = "Z:/javaprgrams/sample-app/bootstrap.min.css">
</head>
<body>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>
		
<form action = "AddProducts" method = "post"></form>	
<table class="table table-hover table-dark" id = "Table">
  <thead>
    <tr>
    <th scope="col">ADD</th>
      <th scope="col">PRODUCTID</th>
      <th scope="col">NAME</th>
      <th scope="col">PRICE</th>
      <th scope="col">CATEGORY</th>
    </tr>
  </thead>
  <tbody>
 <core:forEach items = "${listKey}" var = "u">
 	<tr> 
 	<td><input type="checkbox"/></td>
     <td> ${u.prodId}</td>
      <td>${u.name}</td>
      <td>${u.price}</td>
      <td>${u.category}</td>
    </tr>
</core:forEach>
    </tbody>
    </table>
   <!--  <input type="button" action = "AddProducts"value="Get Selected" onclick="GetSelected()" />
  -->
</body>
</html>