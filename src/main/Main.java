package main;

import java.sql.Connection;
import java.sql.SQLException;

import db.Db;

public class Main {

	public static void main(String[] args) {
		Connection con = Db.getConnection();
		try {
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		con = Db.getConnection();
		try {
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
