package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	private static String url = "jdbc:mysql://localhost:3306/daojdbc";
	private static String username = "root";
	private static String password = "11072006";

	private static Connection con = null;

	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Database connected!");
			con = connection;
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}
		return con;

	}

}
