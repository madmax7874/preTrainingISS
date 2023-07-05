package application;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root", "root");
			String uname = request.getParameter("uname");
			PreparedStatement ps = con.prepareStatement("SELECT uname FROM users WHERE uname = ?");
			ps.setString(1, uname);
			String pass1 = request.getParameter("pass");
			String pass2 = request.getParameter("rpass");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Username already exists!');");
				out.println("location.href='Register.jsp'");
				out.println("</script>");
				return;
			}
			if(!pass1.equals(pass2)) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Password does not match!');");
				out.println("location.href='Register.jsp'");
				out.println("</script>");
				return;
			}
			ps = con.prepareStatement("INSERT INTO users(uname, password) values(?, ?);");
			ps.setString(1, uname);
			ps.setString(2, pass1);
			int result = ps.executeUpdate();
			if(result > 0) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User registered successfully!');");
				out.println("location.href='Login.jsp'");
				out.println("</script>");
			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User registration failed. Try again!');");
				out.println("location.href='Register.jsp'");
				out.println("</script>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
