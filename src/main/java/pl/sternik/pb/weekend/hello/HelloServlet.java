package pl.sternik.pb.weekend.hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String param1 = req.getParameter("param1");
		resp.setContentType("text/html; charset=UTF-8");
		resp.getOutputStream().println("Hura mój pierwszy post! z param = " + param1);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getOutputStream().println("Hurrra moj 1st servlet!");
	}
}
