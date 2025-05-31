package controller;

import java.io.IOException;
import java.util.List;

import Dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.User;

@WebServlet("/display")
public class DisplayController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		UserDao dao = new UserDao();
		List<User> users = dao.getAllUser();
		
		req.setAttribute("users", users);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
