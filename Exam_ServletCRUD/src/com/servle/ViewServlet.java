package com.servle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clas.*;

@WebServlet("/servlet4")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='/Exam_ServletCRUD/index.jsp'>Add New Employee</a>");  
        out.println("<h1>Employees List</h1>"); 
        
        List<Emp> list=EmpDao.getAllEmployee();
        
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");  
        for(Emp e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+ "</td><td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td><td><a href='servlet2?id="+e.getId()+"'>edit</a></td><td><a href='servlet3?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
