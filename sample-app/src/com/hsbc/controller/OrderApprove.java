package com.hsbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.beans.Order;
import com.hsbc.model.service.ProductService;
import com.hsbc.model.utility.ProductFactory;

/**
 * Servlet implementation class OrderApprove
 */
@WebServlet("/OrderApprove")
public class OrderApprove extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ProductService service = (ProductService)ProductFactory.getInstance("service");
			String order = request.getParameter("orderId");
			int  orderId = Integer.parseInt(order);
			service.approveOrder(orderId);
			HttpSession session = request.getSession();
			List<Order> orders = service.getQoutes(100);
			session.setAttribute("orderKey", orders);
			RequestDispatcher rd = request.getRequestDispatcher("CustomerOrderManagement.jsp");
			rd.forward(request, response);
				
	}

}
