package com.servle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clas.*;

@WebServlet("/servlet2_2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        String sid=request.getParameter("id");
        int id=Integer.parseInt(sid);
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String country=request.getParameter("country");
        
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName(name);
        emp.setPassword(password);
        emp.setEmail(email);
        emp.setCountry(country);
        
        try {
        	int status=EmpDao.update(emp);
        	if (status>0) {
        		response.sendRedirect("servlet4");
        	} else {
        		out.println("Sorry! unable to update record");  
        	}
			
		} catch (Exception e) {
			out.println(e);
		}
        
        out.close();
	}

}
