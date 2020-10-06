package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.connections.DbConnection;
import com.hsbc.model.Employee;

public class EmployeeLogin {
	
	DbConnection db= new DbConnection();
	public boolean customerLoginValidate(Employee employee)
	{
		PreparedStatement pst= db.getPreparedStatement("select * from employee where employeeid=? and password=?");
		boolean status = false;
		try {
			pst.setInt(1, employee.getEmployeeid());
			pst.setString(2, employee.getPassword());
			
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
