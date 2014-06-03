<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JRebel Test</title>
</head>
<body>

	<form action="user" method="post">
		<h1>JRebel Test</h1>
		<p style="color: red">${param.errorMessage}</p>
		<p style="color: green">${param.successMessage}</p>
		<label for="firstName">First Name: </label>
		<input type="text" name="firstName" id="firstName" />
		<br />
		<label for=lastName">Last Name: </label>
		<input type="text" name="lastName" id="lastName" />
		<br />
		<br />
		<input type="submit" value="Send" />
	</form>
</body>
</html>