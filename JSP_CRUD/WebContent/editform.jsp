<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.dao.*, com.bean.*, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
	<%
	String sid=request.getParameter("id");
    int id=Integer.parseInt(sid);
    
    Emp e=EmpDao.getEmployeeById(id);
	%>
	
	<h1>Edit Form</h1>
	<form action="edituser.jsp" method="post">
		<input type="hidden" name="id" value="<%=e.getId()%>"/>
		<table>  
			<tr><td>Name:</td><td>  
			<input type="text" name="name" value="<%= e.getName()%>"/></td></tr>  
			<tr><td>Password:</td><td>  
			<input type="password" name="password" value="<%= e.getPassword()%>"/></td></tr>  
			<tr><td>Email:</td><td>  
			<input type="email" name="email" value="<%= e.getEmail()%>"/></td></tr>  
			<tr><td>Country:</td><td>  
			<select name="country">  
			<option>India</option>  
			<option>Pakistan</option>  
			<option>Afghanistan</option>  
			<option>Berma</option>  
			<option>Other</option>  
			</select>  
			</td></tr>  
			<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
		</table>  
	</form>
	
</body>
</html>