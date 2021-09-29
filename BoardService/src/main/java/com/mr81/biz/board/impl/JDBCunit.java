
package com.mr81.biz.board.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCunit {
	
	private static Connection conn =null;
	
	public JDBCunit() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Connection getConnection(){
		
		
		
	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hgj0307","0307"); 
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return conn;
		
	}

public static void close(PreparedStatement stmt, Connection conn){
	
	try{
		
		if(stmt!=null){
			stmt.close();
		}
		if(conn!=null){
			conn.close();
		}
		
	}catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	
}


public static void close(PreparedStatement stmt, Connection conn, ResultSet set){
	
	try{
		if(set!=null){
			set.close();
		}
		if(stmt!=null){
			stmt.close();
		}
		if(conn!=null){
			conn.close();
		}
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}


}

