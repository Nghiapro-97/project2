

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		/* ==> get the initialization parameter
		 * ServletConfig config=getServletConfig(); 
		 * String driver=config.getInitParameter("driver"); 
		 * pw.print("Drive is: " + driver);
		 */
		
		ServletConfig config=getServletConfig();
		Enumeration<String> en=config.getInitParameterNames();
		
		String str="";
		while (en.hasMoreElements()) {
			str=en.nextElement();
			pw.print("<br/>Name: " + str);
			pw.print("value: " + config.getInitParameter(str));
		}
		
		pw.close();
	}

}
