

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class FetchData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FetchData() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<table border='1'><tr><th>maKH</th><th>TenKH</th><th>Phone</th></tr>");
		try {
//			ServletContext ctx=getServletContext();  
//			Connection con=(Connection)ctx.getAttribute("mycon");  
			String user="root";
			String password="nghia123";
			Class.forName("com.mysql.jdbc.Driver");
			String urlString="jdbc:mysql://localhost:3306/qlch";
			Connection con=(Connection) DriverManager.getConnection(urlString, user, password);
			
			PreparedStatement ps=con.prepareStatement("select maKH,TenKH,Phone from KhachHang");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {				
				out.print("<tr><td>");
				out.print(rs.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(3));
				out.print("</td>");
				out.print("</tr>");
				
			}
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.print("</table>");
		
		out.close();
	}

}
