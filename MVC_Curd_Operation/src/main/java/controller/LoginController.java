package controller;

import java.io.IOException;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import Model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		User user = new User();
		user.setEmail(email);
		user.setPass(pass);
		
		
		UserDao dao = new UserDao();
		User u = dao.loginCheck(user);
		
		
		if(u==null)
		{
			req.setAttribute("err", "Invalid credentials");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("user", u.getUname());
			req.getRequestDispatcher("display").forward(req, resp);
		}
		
		
		
	}
}
