package com.skillsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCInfo7 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
		con.setAutoCommit(false); 
		Statement stmt=con.createStatement();
		int s=stmt.executeUpdate("insert into Bus values(3,'KA987',80)");
		con.commit();
		System.out.println(s);
		stmt.close();
		con.close();
		
		
		
	}
	
}
