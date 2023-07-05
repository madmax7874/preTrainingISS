<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align="center">
<h2>User Login</h2>
<form action="LoginServlet" method="post">
<table>
<tr>
<td>Enter Username:</td>
<td><input required type="text" name="uname"></td>
</tr>
<tr>
<td>Enter Password:</td>
<td><input required type="password" name="pass"></td>
</tr> 
</table>
<input type="submit" value="Login">
<br>
<a href="Register.jsp">Create an new account.</a>
</form>
</div>
</body>
</html>