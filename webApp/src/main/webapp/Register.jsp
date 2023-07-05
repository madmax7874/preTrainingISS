<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<div align="center">
<h2>User Registration</h2>
<form action="RegistrationServlet" method="post">
<table>
<tr>
<td>Enter Username:</td>
<td><input required type="text" name="uname"></td>
</tr>
<tr>
<td>Enter Password:</td>
<td><input required type="password" name="pass"></td>
</tr>
<tr>
<td>Re-enter Password:</td>
<td><input required type="password" name="rpass"></td>
</tr>
</table>
<input type="submit" value="Register">
<br>
<a href="Login.jsp">Have an existing account.</a>
</form>
</div>
</body>
</html>