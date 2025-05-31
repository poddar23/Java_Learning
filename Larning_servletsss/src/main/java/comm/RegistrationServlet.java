package comm;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")

public class RegistrationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","");
		
		PreparedStatement ps = cn.prepareStatement("insert into users values(?,?,?,?) ");
		ps.setInt(1, 0);
		ps.setString(2, uname);
		ps.setString(3, email);
		ps.setString(4, pass);
		
		int i = ps.executeUpdate();
		
		if (i>0) {
			resp.getWriter().println("Registration successful!");
		} else {
			resp.getWriter().println("Registration failed.");
		}
		
		ps.close();
		
		
		
		
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
