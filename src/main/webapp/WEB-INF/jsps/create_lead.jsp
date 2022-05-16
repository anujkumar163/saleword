<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Rename</title>
</head>
<body>
	<h2>leads | Create</h2>
	<form action="saveLead" method="post">
		<pre>
			FirstName<input type="text" name="firstName"/>
			LastName<input type="text" name="lastName"/>
			Email<input type="text" name="email"/>
			Lead Source:
			<select name="leadSource">
			<option value="tv commerical">Volvo</option>
			<option value="radio">radio</option>
			<option value="news">new paper</option>
			<option value="online">online</option>
			</select>
			Mobile<input type="text" name="mobile"/>
			<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>