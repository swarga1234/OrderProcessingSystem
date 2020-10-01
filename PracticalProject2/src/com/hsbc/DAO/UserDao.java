package com.hsbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.hsbc.JDBC.DBConnection;
import com.hsbc.Model.User;

public class UserDao {
	

	public void registerUser(User u) {
        String insertUserSQL = "INSERT INTO users" +
            "  (user_id ,first_name, last_name, username, password) VALUES " +
            " (?, ?, ?, ?, ?);";

        try {
        	
        	Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(insertUserSQL);
            preparedStatement.setInt(1, u.getUserID());
            preparedStatement.setString(2, u.getFirstName());
            preparedStatement.setString(3, u.getLastName());
            preparedStatement.setString(4, u.getUsername());
            preparedStatement.setString(5, u.getPassword());

            System.out.println(preparedStatement);
 
            preparedStatement.execute();

        } catch (SQLException e) {
        	
        	e.printStackTrace();
        }
	}

}
