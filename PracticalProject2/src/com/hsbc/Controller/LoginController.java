package com.hsbc.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.DAO.LoginDao;
import com.hsbc.Model.Login;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

	public LoginController() {
		super();
		loginDao = new LoginDao();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	// TODO Auto-generated method stub
	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Login loginBean = new Login();
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		if (loginDao.validate(loginBean)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("todo/todolist.jsp");
			dispatcher.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			// session.setAttribute("user", username);
			// response.sendRedirect("login.jsp");
		}
	}
}
