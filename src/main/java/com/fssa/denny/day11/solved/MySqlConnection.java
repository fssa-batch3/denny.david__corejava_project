package com.fssa.denny.day11.solved;

import java.sql.*;

public class MySqlConnection {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core_java";
		String userName = "gj3inaic01u5mzuvnyxq";
		String password = "pscale_pw_10MKsvXMllyUwbzDdMofXPzaPJXyX7E5zRiDu45k4F2";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("connection created...");
	       con.close();
	       
	}
	
}

