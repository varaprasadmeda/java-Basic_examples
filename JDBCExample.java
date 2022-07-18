package com.java.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		System.out.println("Getting All Rows from a table!");
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/";
		String db = "java_practice";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "admin";
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url + db, user, pass);
			try {
				Statement st = con.createStatement();
				ResultSet res = st.executeQuery("SELECT * FROM  employee");
				System.out.println("EmployeeID: " + "\t" + "FirstName: ");
				while (res.next()) {
					int i = res.getInt("EmployeeID");
					String s = res.getString("FirstName");
					System.out.println(i + "\t\t" + s);
				}
				con.close();
			} catch (SQLException s) {
				System.out.println("SQL code does not execute.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
