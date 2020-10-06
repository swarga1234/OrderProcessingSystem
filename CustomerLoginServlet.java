package com.hsbc.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.CustomerLogin;
import com.hsbc.model.Customer;

/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
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
		int customerid=Integer.parseInt(request.getParameter("customerid"));
		String password= request.getParameter("password");
		Customer customer= new Customer();
		customer.setCustomerid(customerid);
		customer.setPassword(password);
		CustomerLogin customerlogin= new CustomerLogin();
		if(customerlogin.customerLoginValidate(customer))
		{
			RequestDispatcher rd= request.getRequestDispatcher("ProfileServlet");
			rd.forward(request, response);
			
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("customerLogin.jsp");
			request.setAttribute("errormsg", " Please enter the CustomerID or Password correctly!!");
			rd.forward(request, response);
		}
	}

}
