<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" class="com.bean.Emp"></jsp:useBean>
	<jsp:setProperty property="*" name="u"/>
	<%
	int i=EmpDao.update(u);
	response.sendRedirect("viewuser.jsp");
	%>
</body>
</html>