package com.skillsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class JDBCInfo6 {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
	con.setAutoCommit(false); 
	PreparedStatement pstmt=con.prepareStatement("Insert into Movies values(?,?)");
	Scanner s=new Scanner(System.in);
	while(true)
	{
	System.out.println("Enter the Movies Id");
	int id=s.nextInt();
	System.out.println("Enter the movies name");
	String name=s.next();
	pstmt.setInt(1, id);
	pstmt.setString(2, name);
	int rs=pstmt.executeUpdate();
	System.out.println(rs);
	System.out.println("rollback/commit");
	String ch=s.next();
	if(ch.equals("rollback"))
		con.rollback();
	if(ch.equals("commit"))
		con.commit();
	System.out.println("Do you want search any other");
	char c=s.next().charAt(0);
	if(c=='N')
		break;
	}
	con.commit();
		
		
	
	
	
}
}
