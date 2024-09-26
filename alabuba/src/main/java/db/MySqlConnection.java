package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/alabuba";
	private static final String USER = "root";
	private static final String PASSWORD = "bbmp5988";

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Banco conectado");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Deu ruim ai vu: " + e);
			return null;
		}
	}

}
