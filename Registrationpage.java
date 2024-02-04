package registration_login_page.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.catalina.tribes.ChannelSender;
import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")

public class Registrationpage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String Firstname =req.getParameter("form1");
		String lastname =req.getParameter("form2");
		String Email  =req.getParameter("form3");
		String password  =req.getParameter("form4");
		String confirm  =req.getParameter("form5");
		if (password.equals(confirm)) {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection comm =DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","root");
			PreparedStatement ps =comm.prepareStatement("insert into registerdb values(?,?,?,?)");
			ps.setString(1,Firstname);
			ps.setString(2, lastname);
			ps.setString(3, Email);
			ps.setString(4, password);
			int value= ps.executeUpdate();
			if (value>0) {
				RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
				rd.forward(req, resp);
				
				
				
			}
			else {
				RequestDispatcher rd=req.getRequestDispatcher("/registration.html");
				rd.include(req, resp);
				
			}
			
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	      
		
		
		
	}
	
	else {
		out.print("password dint matached");
		RequestDispatcher rd=req.getRequestDispatcher("/registration.html");
		rd.include(req, resp);
	}
}

}

