package com.hsbc.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DBConnection {

	private static String jdbcUrl = "jdbc:mysql://localhost:3306/Project1;create=true";
	private static String jdbcUsername ="admin";
	private static String jdbcPassword ="admin";
	
	static Connection connection;
	Statement statement;
	PreparedStatement prepStatement;
	
	
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public Statement getStatement() {
		try {
			connection = DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return statement;
	}
	
	public PreparedStatement getPreparedStatement() {
		try {
			connection = DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return prepStatement;
	}
	
	public Date getSQLDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    public LocalDate getUtilDate(Date sqlDate) {
        return sqlDate.toLocalDate();
    }
	
}
