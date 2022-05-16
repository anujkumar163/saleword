<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="view">create New contacts</a>
	<table>
	<tr>
		<th>Id</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Lead Source</th>
		<th>Mobile</th>
		<th>Billing</th>
		
	</tr>
	<c:forEach var="contacts" items="${contacts }">
	<tr>
		<td>${contact.id}</td>
		<td><a href="getContactById?id=${contact.id}">${contact.firstName }</a></td>
		<td>${contact.lastName }</td>
		<td>${contact.email }</td>
		<td>${contact.leadSource }</td>
		<td>${contact.mobile }</td>
		<td><a href="getContactById?id=${contact.id}">Generate Bill</a></td>
		
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>