package registration_login_page.com;

import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")

public class loginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out =resp.getWriter();
		String Email = req.getParameter("fo");
		String password=req.getParameter("for");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection comm =DriverManager.getConnection("jdbc:mysql://localhost:3306/homestay","root","root");
			PreparedStatement ps =comm.prepareStatement("select * from registerdb where email=? and password=?");
			ps.setString(1, Email);
			ps.setString(2, password);
			 ResultSet rs =ps.executeQuery();
			if (rs.next()) {
				HttpSession session=req.getSession();
				session.setAttribute("session_name",rs.getString("fullname"));
				out.print("welcomet to this page");
				RequestDispatcher rd=req.getRequestDispatcher("/homepage.jsp");
				rd.forward(req, resp);
				
				
				
			}
			else {
				resp.setContentType("text/html");
				 out.print("<h1 style='Color:red'>password & email invaild </h1>");
				
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}
			
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
