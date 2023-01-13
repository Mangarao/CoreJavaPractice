package com.deloitte.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransacitonMgmtExample {

	public static void main(String[] args) throws SQLException {
		String driverClass = "com.mysql.jdbc.Driver";
		Connection conn = null;
		try {
			// 2. Create Connection Object
			String URL = "jdbc:mysql://localhost:3306/mydb";
			String userName = "root";
			String password = "root";
			conn = DriverManager.getConnection(URL, userName, password);
			conn.setAutoCommit(false);
			// 3. Create Statement object
			Statement stmt = conn.createStatement();

			String updateQuery1 = "update emp set sal=sal-100000 where id=102";
			String updateQuery2 = "update emp set sal=sal+100000 where id=101";
			stmt.addBatch(updateQuery1);
			stmt.addBatch(updateQuery2);
			stmt.executeBatch();
			conn.commit();

			// 5. close connection object
			conn.close();
			System.out.println("Transaction is successful..");

		} catch (SQLException e) {
			System.err.println("SQL Exception is occurred");
			e.printStackTrace();
			conn.rollback();
		} catch (Exception e) {
			System.out.println("Exception is occurred.. " + e);
			conn.rollback();
		}
	}

}
