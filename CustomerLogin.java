package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.connections.DbConnection;
import com.hsbc.model.Customer;

public class CustomerLogin {
	
	DbConnection db= new DbConnection();
	public boolean customerLoginValidate(Customer customer)
	{
		PreparedStatement pst= db.getPreparedStatement("select * from customers where customerid=? and password=?");
		boolean status = false;
		try {
			pst.setInt(1, customer.getCustomerid());
			pst.setString(2, customer.getPassword());
			
			ResultSet rs= pst.executeQuery();
			status=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			db.closeConnection();
		}
		return status;
	}

}
