package br.edu.utfpr.model.sql;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class SQLBase {
	private String user = "root";
	private String password = "root";
	protected Connection conn = null;

	public Connection open() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/megasena?autoReconnect=true&useSSL=false", user, password);
			conn.getConnectionAttributes();
			
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	public void close() {

			try {
				if (conn != null) 
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
