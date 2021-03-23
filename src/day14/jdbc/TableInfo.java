package day14.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TableInfo {
	public static void main(String[] args) {
		Connection connection = null;
		try {

			// step 1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded");

			// step 2
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "vvreddy",
					"root");
			System.out.println("Connected to DB");

			// step 3
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_EMPLOYEE");
			ResultSetMetaData rsm = rs.getMetaData(); // fetch the meta data of a table
			System.out.println("Details of the table");

			int count = rsm.getColumnCount();
			System.out.println("Table contains " + count + " columns.");
			while (count > 0) {
				System.out.println(rsm.getColumnName(count));
				count--;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
