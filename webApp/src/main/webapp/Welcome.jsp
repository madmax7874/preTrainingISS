<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<div align="center">
<h1>Welcome <%= request.getAttribute("name") %> </h1>
<form action="LoginServlet" method="post">
<input type="submit" value="Logout">
</form>
</div>
</body>
</html>