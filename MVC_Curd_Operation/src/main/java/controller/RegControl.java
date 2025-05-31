package controller;

import java.io.IOException;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.User;

@WebServlet("/reg")
public class RegControl extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		User user = new User();
		user.setUname(uname);
		user.setEmail(email);
		user.setPass(pass);
		
		UserDao dao = new UserDao();
		if(dao.isEmailExist(email))
		{
			req.setAttribute("err","Email Already exist!!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		else
		{
			int i = dao.addUser(user);
			if(i>0);
		}
		int i =  dao.addUser(user);
		
		if(i>0)
		{
			req.setAttribute("msg", "Registration successfully !!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
	}
}
