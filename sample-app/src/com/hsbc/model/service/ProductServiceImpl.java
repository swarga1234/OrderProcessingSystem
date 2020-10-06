/**
 * 
 */
package com.hsbc.model.service;

import java.util.*;

import com.hsbc.model.beans.Order;
import com.hsbc.model.beans.Product;
import com.hsbc.model.dao.ProductDao;
import com.hsbc.model.utility.ProductFactory;


/**
 * @author AAKASH GILOTRA
 *
 */
public class ProductServiceImpl implements ProductService {
	private ProductDao prodDao = null;
	 public ProductServiceImpl() {
			prodDao = (ProductDao)ProductFactory.getInstance("dao");
		}
	
	@Override
	public List<Product> fetchAll() {
		 
			return	prodDao.getAll() ;
		
		 
	}

	@Override
	public List<Order> getQoutes(int customerId) {
		List<Order> orders = new ArrayList<>();
		orders =  prodDao.getQoutes(customerId);
		return orders;
		
	}

	@Override
	public void approveOrder(int orderId) {
		prodDao.updateOrderStatus(orderId);
		
		
	}

	@Override
	public List<Order> getOrders(int customerId) {
		List<Order> orders = new ArrayList<Order>();
		orders = prodDao.getApprovedOrders(customerId);
		return orders;
	}

	@Override
	public List<Product> fetchProductList(int orderId) {
		List<Product> items = new ArrayList<>();
		items = prodDao.getProductList(orderId);
		return items;
	}

}
