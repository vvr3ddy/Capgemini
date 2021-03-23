package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		try {

			// step 1 -- load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			// step 2 -- create a connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "vvreddy",
					"root");
			System.out.println("Created a connection");
			
			// step 3 - create statement or prepared statement -- to do transactions
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.err.println("Driver not loaded");
		}
	}
}
