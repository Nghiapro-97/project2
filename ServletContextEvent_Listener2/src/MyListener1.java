

import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.sun.jdi.connect.spi.Connection;

@WebListener
public class MyListener1 implements ServletContextListener {

    public MyListener1() {
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
			String user="root";
			String password="nghia123";
			String urlString="jdbc:mysql://localhost:3306/QLCH";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection(urlString, user, password);
		
			ServletContext ctx=sce.getServletContext();
			ctx.setAttribute("mycon", con);
			
		} catch (Exception e) {
			System.err.println("Connect fail!!");
			e.printStackTrace();
		}
    }
	
}
