

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "this is example test", urlPatterns = { "/Test" })
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Test() {};
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		pw.println("welcome " + name);
		pw.close();
	}

}
