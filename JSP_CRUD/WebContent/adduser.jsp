<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="com.dao.EmpDao"%>  
    <jsp:useBean id="u" class="com.bean.Emp"></jsp:useBean>
	<jsp:setProperty property="*" name="u"/> 
	<% 
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String country=request.getParameter("country");
		
	u.setName(name);
	u.setPassword(password);
	u.setEmail(email);
	u.setCountry(country);
	
	int i=EmpDao.save(u);
	if (i>0){
		response.sendRedirect("adduser-success.jsp");
	}else{
		response.sendRedirect("adduser-error.jsp");
	}
	%>
</body>
</html>