package day14.Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		try {
			System.out.println("Loading Driver Status:");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded...");

			System.out.println("Creating Connection");
			System.out.println("Enter username:");
			String uName = read.nextLine();
			System.out.println("Enter password:");
			String password = read.nextLine();
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			Connection connection = DriverManager.getConnection(url, uName, password);
			System.out.println("Created Connection...");
			System.out.println("Enter the details to check from the db");
			String tUser = read.nextLine();
			String tPwd = read.nextLine();
			PreparedStatement pst = connection.prepareStatement("SELECT * FROM USER_REGR where USER=?, PWD=?");
			pst.setString(1, tUser);
			pst.setString(2, tPwd);
			if (pst.execute()) {
				System.out.println("Successfully logged in.");
			} else {
				System.out.println("User Invalid.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
