package com.skillsoft.jdbc;

import java.sql.*;


public class JDBCInfo2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
		PreparedStatement pstmt=con.prepareStatement("Insert into Movies values(?,?)");
		pstmt.setInt(1,10);
		pstmt.setString(2, "abhishek");
		int count=pstmt.executeUpdate();
		System.out.println(count);
		pstmt.close();
		con.close();
	}
	
}
