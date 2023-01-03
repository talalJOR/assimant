package unvers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class consql {
	public static Connection getconnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "Talal123@";
		Connection conn = DriverManager.getConnection(url, username, password);

		return conn;

	}

}
