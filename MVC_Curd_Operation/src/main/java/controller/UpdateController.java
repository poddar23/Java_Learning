package controller;

import java.io.IOException;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.User;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String action = req.getParameter("action");
		
		UserDao dao = new UserDao();
		
		if(action.equals("delete"))
		{
			int i = dao.deleteUser(id);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		}
		else if(action.equals("update"))
		{
			User user =  dao.userById(id);
			req.setAttribute("user", user);
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
		
		
	}
}
