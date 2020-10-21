package com.servle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clas.*;

@WebServlet("/servlet1")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		Emp emp = new Emp();
		emp.setName(name);
		emp.setPassword(password);
		emp.setEmail(email);
		emp.setCountry(country);
		
		int status=EmpDao.save(emp);
		if (status > 0) {
			out.print("<p> Record saved successfully!<p>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			
		} else {
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
