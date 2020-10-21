

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String pass=request.getParameter("password");
		if (pass.equals("admin")) {
			chain.doFilter(request, response);
		} else {
			out.print("Sorry UserName or Password Error!");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
