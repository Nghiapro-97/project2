package com.servle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clas.Emp;
import com.clas.*;

@WebServlet("/servlet1")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sPageId=request.getParameter("page");
		int pageId=Integer.parseInt(sPageId);
		int total=5;
		if (pageId==1) {
			
		} else {
			pageId=pageId-1;  
            pageId=pageId*total+1; 
		}
		List<Emp> list=EmpDao.getRecord(pageId, total);
		
		out.print("<h1>Page No: " + sPageId + "</h1>");
		out.print("<table border='1' cellpadding='4' width='60%'>");
		out.print("<tr><th>ID</th><th>Name</th><th>Salary</th>");
		for (Emp emp : list) {
			out.print("<tr><td>" + emp.getId() + "</td><td>" + emp.getName() + "</td><td>" + emp.getSalary() + "</td></tr>");
		}
		out.print("</table>");
		
		out.print("<a href='servlet1?page=1'>1</a>");
		out.print("<a href='servlet1?page=2'>2</a>");
		out.print("<a href='servlet1?page=3'>3</a>");
		
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
