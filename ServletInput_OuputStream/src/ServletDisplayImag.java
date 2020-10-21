

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class ServletDisplayImag extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletDisplayImag() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		ServletOutputStream out;
		out=response.getOutputStream();
		
		FileInputStream fin=new FileInputStream("C:\\test\\java.jpg");
		BufferedInputStream bin=new BufferedInputStream(fin);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		int ch=0;
		while ((ch=bin.read())!=-1) {
			bout.write(ch);
		}
		
		bin.close();  
	    fin.close();  
	    bout.close();  
	    out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
