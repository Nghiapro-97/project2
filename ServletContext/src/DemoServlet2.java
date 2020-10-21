

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DemoServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		ServletContext context=getServletContext();
		String str=(String)context.getAttribute("company");
		
		pw.println("welcome to " + str);
		pw.close();
	}

}
