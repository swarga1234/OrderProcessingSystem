package com.hsbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.JDBC.DBConnection;
import com.hsbc.Model.Login;

public class LoginDao {
	
	public boolean validate(Login login){
		boolean status=false;
		
		try {
			Class.forName("com.mysql.jsbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection connection = DBConnection.getConnection();
		try {
			PreparedStatement preparedStatement = connection
		            .prepareStatement("select * from users where username = ? and password = ? ");
		            preparedStatement.setString(1, login.getUsername());
		            preparedStatement.setString(2, login.getPassword());

		            System.out.println(preparedStatement);
		            ResultSet rs = preparedStatement.executeQuery();
		            status = rs.next();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
		
	}

}
