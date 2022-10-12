package com.skillsoft.jdbc;

import java.sql.*;


public class JDBCInfo4 {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
	Statement pstmt=con.createStatement();
	int counter=0;
	ResultSet count=pstmt.executeQuery("select * from Movies");
	while(count.next())
	{
		int id=count.getInt(1);
		String name=count.getString(2);
		counter++;
		System.out.println("Id= "+id+"  "+"Name= "+name);
	}
	System.out.println(counter);
	pstmt.close();
	con.close();
}
}
