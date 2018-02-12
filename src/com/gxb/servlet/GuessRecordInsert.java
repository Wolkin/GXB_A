package com.gxb.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gxb.dao.DBConnection;

/**
 * Servlet implementation class GuessRecordInsertAction
 */
public class GuessRecordInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 
     * @see HttpServlet#HttpServlet()
     */
    public GuessRecordInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String guessWallet = request.getParameter("guessWallet");
		String guessValue = request.getParameter("guessValue");
		String gxsNum = request.getParameter("gxsNum");
		String guessDate = df.format(new Date());
		String guessStatus = "0";
		String guessTerm = "2017001";
		//String url = "https://wallet.gxb.io/#/transfer/?from="+guessWallet+"&to=gxb-wm&amount="+gxsNum+"&memo="+guessValue;
		
		String sql = " insert into guessrecord (wallet,gxsNum,guessValue,guessDate,guessTerm,guessStatus)"
				+ " values ('" + guessWallet + "'"
				+ ",'" + gxsNum + "'"
				+ ",'" + guessValue + "'"
				+ ",'" + guessDate + "'"
				+ ",'" + guessTerm + "'"
				+ ",'" + guessStatus + "')";
		System.out.println(sql);
		Connection conn = new DBConnection().getConnection();
		Statement stat = null;
		try {
			stat = conn.createStatement();
			stat.execute(sql);
			stat.close();
			conn.close();
		} catch (SQLException e) {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.sendRedirect(url);
		response.setStatus(200);
	}
}