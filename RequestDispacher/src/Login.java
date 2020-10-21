

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String p=request.getParameter("pass");
		
		if (p.equals("login")) {
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		} else {
			pw.print("Sorry UserName or Password Error!");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
