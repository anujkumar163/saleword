<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file="menu.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="view">create New Leads</a>
	<table>
	<tr>
		<th>Id</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Lead Source</th>
		<th>Mobile</th>
		
	</tr>
	<c:forEach var="lead" items="${leads }">
	<tr>
		<td>${lead.id}</td>
		<td><a href="getLeadById?id=${lead.id}">${lead.firstName }</a></td>
		<td>${lead.lastName }</td>
		<td>${lead.email }</td>
		<td>${lead.leadSource }</td>
		<td>${lead.mobile }</td>
		
	</tr>
	</c:forEach>
	</table>
	
</body>
</html>