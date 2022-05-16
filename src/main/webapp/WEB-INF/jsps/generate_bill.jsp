<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Generate Bill</h2>
	<form action="generate" method="post">
		<pre>
			FirstName<input type="text" name="firstName" value="${contact.firstName }"/>
			LastName<input type="text" name="lastName" value="${cotact.lastName }"/>
			Email<input type="text" name="email" value="${contact.email }"/>
			
			Mobile<input type="text" name="mobile" value="${contact.mobile }"/>
			Product Name<input type="text" name="productName"/>
			Amount Paid<input type="text" name="amount"/>
			<input type="submit" value="Generate"/>
		</pre>
	</form>
</body>
</html>