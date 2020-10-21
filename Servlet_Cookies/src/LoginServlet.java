

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		if (password.equals("admin")) {
			out.print("you are successfullly logged in");
			out.print("<br>Welcome, " + name);
			
			Cookie ck = new Cookie("name", name);
			response.addCookie(ck);
		} else {
			 out.print("sorry, username or password error!"); 
			 request.getRequestDispatcher("Login.html").include(request, response);
		}
		
		out.close();
	}

}
