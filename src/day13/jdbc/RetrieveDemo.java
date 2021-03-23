package day13.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "vvreddy",
					"root");
			System.out.println("Connected to DB");
			System.out.println("\nUsing Statement Interface");

			Statement st = connection.createStatement();
			ResultSet rset = st.executeQuery("SELECT * FROM BANK_CUSTOMER");
			while (rset.next()) {
				System.out.println(rset.getInt(1) + "\t" + rset.getString(2) + "\t");
			}

			PreparedStatement pst = connection.prepareStatement("SELECT * FROM BANK_CUSTOMER WHERE CUST_ID=?");
			pst.setInt(1, 1011);
			System.out.println("\nUsing PreparedStatement Interface");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
