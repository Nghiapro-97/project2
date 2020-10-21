<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
	<%@page import="com.javatpoint.mypack.UserDao" %>
	<jsp:useBean id="obj" class="com.javatpoint.mypack.User"></jsp:useBean>
	<jsp:setProperty property="*" name="obj"/>
	
	<%
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
		
	obj.setUsername(name);
	obj.setPassword(password);
	obj.setEmail(email);
	int i=UserDao.register(obj);
	if(i>0){
		out.print("you are successfully register!");
	}
	%>
	
</body>
</html>