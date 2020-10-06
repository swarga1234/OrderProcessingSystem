package com.hsbc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.EmployeeLogin;
import com.hsbc.model.Employee;

/**
 * Servlet implementation class EmployeeLoginServlet
 */
@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int employeeid=Integer.parseInt(request.getParameter("empid"));
		String password= request.getParameter("password");
		Employee employee= new Employee();
		employee.setEmployeeid(employeeid);
		employee.setPassword(password);
		EmployeeLogin employeelogin= new EmployeeLogin();
		if(employeelogin.customerLoginValidate(employee))
		{
			RequestDispatcher rd= request.getRequestDispatcher("ProfileServlet");
			rd.forward(request, response);
			
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("employeeLogin.jsp");
			request.setAttribute("errormsg", " Please enter the EmployeeID or Password correctly!!");
			rd.forward(request, response);
		}
	}

}
