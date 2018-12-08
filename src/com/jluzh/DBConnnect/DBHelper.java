package com.jluzh.DBConnnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBHelper  {

	private String jdbcUrl="jdbc:mysql://localhost:3306/OnLineShopping";
	private String username="root";
	private String password="123456";
	private Connection conn=null;
	private Statement statement=null;
	private ResultSet result=null;
	
	public DBHelper(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex){
			throw new RuntimeException(ex);
		}
	}
	
	public void start(){
		try{
			conn= DriverManager.getConnection(jdbcUrl,username,password);
			statement= conn.createStatement();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void close(){
		if(statement!=null){
			try{
				statement.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		}
		if(conn!=null){
			try{
				conn.close();
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		}
	}
	
	public boolean update(String sql){
		try{
			if(statement!=null){
				statement.executeUpdate(sql);
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return true;
	}
	
	public ResultSet query(String sql){
		try{
			if(statement!=null){
				result=statement.executeQuery(sql);
			}
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return result;
	}
}
