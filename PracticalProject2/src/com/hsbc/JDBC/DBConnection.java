package com.hsbc.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DBConnection {

	private static String jdbcUrl = "jdbc:derby:Database_Name;create=true";
	private static String jdbcUsername ="admin";
	private static String jdbcPassword ="admin";
	
	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;
	
	
	
	public Connection getConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
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
		return preparedStatement;
	}
	
	
}
