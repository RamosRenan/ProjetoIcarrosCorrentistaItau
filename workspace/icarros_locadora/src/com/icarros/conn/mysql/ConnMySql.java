package com.icarros.conn.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnMySql {
	
	private static Connection conn = null;
	
	private Statement state = null;
	
	private ResultSet resultSet = null;
	
	private static boolean successConn = false;
	
	public ConnMySql()
	{
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/icarros?"+"user=renan&password=renan1994");
			
			state = conn.createStatement();
			
			resultSet = state.executeQuery("select * from test_connection");
			
			while(resultSet.next())
			{
				System.out.println(" --> "+resultSet.getString("id")+" "+resultSet.getString("info"));
			}
			
			successConn = conn.isValid(2);
		} catch (SQLException e) {
			// TODO: handle exception
			// handle any errors
		    System.out.println("SQLException: " + e.getMessage());
		    System.out.println("SQLState: " + e.getSQLState());
		    System.out.println("VendorError: " + e.getErrorCode());
		}
		finally 
		{
			try {
				conn.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage()+"\n"+e2.getCause());
			}
		}
	}
	
	public Connection getConnection()
	{
		return ConnMySql.conn;
	}
	
	public static boolean isConnected() throws SQLException
	{
		boolean valid  = successConn;
		successConn = false;
		return valid;
	}
}
