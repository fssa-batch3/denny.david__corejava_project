package com.fssa.denny.day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fssa.denny.day11.solved.ConnectionUtil;

//import com.fssa.learnJava.corejava.day13.ConnectionUtil;

/**
 * @author BharathwajSoundarara
 *
 */
//Explain in class what is the difference between Statement and PreparedStatement 
public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO USERS (user_name, email_id,  password) VALUES ( ?, ?, ? );";
		PreparedStatement pdst = connection.prepareStatement(query);
		pdst.setString(1, "bharathwaj");
		pdst.setString(2, "bharathwaj.soundararajan@ctr.freshworks.com");
		pdst.setString(3, "password007");
		System.out.println(pdst.toString());
		int rows2 = pdst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
		pdst.close();
	
	}
	
}
