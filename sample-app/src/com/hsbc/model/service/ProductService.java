package com.hsbc.model.service;

import java.util.List;

import com.hsbc.model.beans.Order;
import com.hsbc.model.beans.Product;

public interface ProductService {
	public List<Product> fetchAll();
	public List<Order> getQoutes(int customerId);
	public void approveOrder(int orderId);
	public List<Order> getOrders(int customerId);
	public List<Product> fetchProductList(int orderId);
}
