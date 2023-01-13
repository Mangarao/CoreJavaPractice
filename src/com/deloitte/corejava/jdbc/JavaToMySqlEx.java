package com.deloitte.corejava.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaToMySqlEx {
	
	public static void main(String[] args) {
		String driverClass = "com.mysql.jdbc.Driver";
		try {
			//1. Register driver class
			//Class.forName(driverClass);
			//2. Create Connection Object
			String URL="jdbc:mysql://localhost:3306/mydb";
			String userName="root";
			String password="root";
			Connection conn = DriverManager.getConnection(URL, userName, password);
		
				DatabaseMetaData dbmd = conn.getMetaData();
				System.out.println(dbmd.getUserName());
				System.out.println(dbmd.getDatabaseProductName());
				System.out.println(dbmd.getDatabaseMajorVersion());
			
			
			//3. Create Statement object
			//Statement stmt = conn.createStatement();
			String insertQuery="insert into emp values (104,'Karthik',66666)";
			
			/*
			 * pstmt.setInt(1, 104); pstmt.setString(2,"Karthik"); pstmt.setInt(3,
			 * 66666666);
			 */
			
			
			String updateQuery="update emp set sal=555555 where id=104";
			String deleteQuery="delete from emp where id=104";
			/*
			 * int count = pstmt.executeUpdate(insertQuery);
			 * System.out.println(count+" record (s) inserted");
			 */
			
			//4. Execute Queries
			
			  String sql="select * from emp";
			  PreparedStatement pstmt = conn.prepareStatement(sql);
			   ResultSet rs = pstmt.executeQuery(sql);
			  while(rs.next()) {
			  System.out.println("ID: "+rs.getInt(1)+" name: "+rs.getString(2)+" sal: "+rs.
			  getInt(3)); }
			  
			  ResultSetMetaData rsmd = rs.getMetaData();
			  System.out.println("no. of columns: "+rsmd.getColumnCount());
			  System.out.println("first column name in the table: "+rsmd.getColumnName(1));
			  System.out.println("first col type: "+rsmd.getColumnTypeName(1));
			 
			
			//5. close connection object
			conn.close();
			
		}  catch (SQLException e) {
			System.err.println("SQL Exception is occurred");
			e.printStackTrace();
		}
	}

}
