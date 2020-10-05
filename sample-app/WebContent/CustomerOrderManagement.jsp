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
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>
<h1>ORDER MANAGEMENT FOR CUSTOMERS</h1>
<a href = "GetQuotes">VIEW PENDING ORDERS</a>
<a href = "GetOrders">VIEW APPROVED ORDERS</a>

<table class="table table-hover table-dark" id = "Table">
  <thead>
    <tr>
    <th scope="col">ORDERID</th>
      <th scope="col">DATE</th>
      <th scope="col">TOTAL VALUE</th>
      <th scope="col">SHIPPING COST</th>
      <th scope="col">SHIPPING AGENCY</th>
      <th scope="col">STATUS</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
 <core:forEach items = "${orderKey}" var = "u">
 	<tr> 
     <td> ${u.orderId}</td>
      <td>${u.date}</td>
      <td>${u.totalValue}</td>
      <td>${u.shippingCost}</td>
      <td>${u.shippingAgency}</td>
      <td>${u.status}</td>
      <td>
      <form name="orderDetails" method="post" action="OrderApprove">
      <input type="hidden" name="orderId" value="${u.orderId}">
      <input type="submit" value ="Approve">
      </form>
      
      </td>
    </tr>
</core:forEach>
    </tbody>
    </table>

</body>
</html>