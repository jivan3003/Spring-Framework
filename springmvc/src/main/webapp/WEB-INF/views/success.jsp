<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service page</title>
</head>
<body>
	<h1>Welcome to page ${user.userName }</h1>
	<h1>Your email is ${user.email }</h1>
	<h1>Your password is ${user.password }</h1>
</body>
</html>