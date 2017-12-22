package com.gxb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private final String driver = "com.hxtt.sql.access.AccessDriver";
//    private final String url = "jdbc:Access:///E:/Workspace/GXB_A/src/accessdb/gxbdb.accdb";
	private final String url = "jdbc:Access:///.../accessdb/gxbdb.accdb";
	private final String user = "";
    private final String password = "";
    private Connection conn = null;

    public DBConnection() {
		try {
			Class.forName(driver);	//JDBC-ODBCÇÅ½ÓÆ÷
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conn;
	}

	private Statement  createStatement() throws SQLException {
		return conn.createStatement();
	}

	public void close() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    
}
