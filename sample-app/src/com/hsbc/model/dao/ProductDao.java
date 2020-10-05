package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.model.beans.Order;
import com.hsbc.model.beans.Product;

public interface ProductDao {
	public List<Product> getAll();
	public List<Order> getQoutes(int customerId);
	public void updateOrderStatus(int orderId);
	public List<Order> getApprovedOrders(int customerId);
}
