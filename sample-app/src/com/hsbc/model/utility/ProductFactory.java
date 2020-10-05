package com.hsbc.model.utility;

import com.hsbc.model.dao.JdbcProductDao;
import com.hsbc.model.service.ProductServiceImpl;

public class ProductFactory {
	
	public static Object getInstance(String type) {
		if(type.equals("dao"))
			return new JdbcProductDao();
		if(type.equals("service"))
			return new ProductServiceImpl();
		
		return null;
	
	}
}