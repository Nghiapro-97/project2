

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("userName");
		out.print("Welcome " + name);
		
		out.print("<form action='Servlet2'>");  
        out.print("<input type='hidden' name='uname' value='"+name+"'>");  
        out.print("<input type='submit' value='go'>");  
        out.print("</form>");  
        out.close();  
	}

}
