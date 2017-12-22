package com.gxb.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gxb.dao.DBConnection;

public class DAOTest {

	public static void main(String[] args) {
		ResultSet rs = null;
		Connection conn = new DBConnection().getConnection();
		Statement stat;
		try {
			stat = conn.createStatement();
			String sql = "select wallet from guessrecord";
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("wallet"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
