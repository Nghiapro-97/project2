<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>
	<form action="register.jsp" method="post">  
		<table>  
			<tr><td>UserName:</td><td><input type="text" name="username"/></td></tr>  
			<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>  
			<tr><td>Email:</td><td><input type="email" name="email"/></td></tr>    
			<tr><td colspan="2"><input type="submit" value="register"/></td></tr>  
		</table>
	</form>
</body>
</html>