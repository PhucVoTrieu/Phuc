package Hello.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home","/trangchu"})
public class HomeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String ten = req.getParameter("ten");
		
		String holot = req.getParameter("holot");
		
		PrintWriter printW = resp.getWriter();
		printW.println(holot + "  "  +ten);
		printW.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String ten = req.getParameter("ten");
		
		String holot = req.getParameter("holot");
		
		PrintWriter printW = resp.getWriter();
		printW.println(holot + "  "  +ten);
		printW.close();
	}


}
