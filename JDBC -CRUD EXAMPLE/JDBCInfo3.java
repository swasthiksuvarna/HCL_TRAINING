package com.skillsoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class JDBCInfo3 {
public static void main(String[] args) throws Exception {
	Movies mv=new Movies();
	Movie m=mv.getName(1);
	System.out.println(m.name);
	
	
	
			
}
}
class Movies
{
	public Movie getName(int id)
	{
		try
		{
			String query="select mov_name from Movies where mov_id="+id;
			Movie m=new Movie();
			m.mov_id=id;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		rs.next();
		String s=rs.getString(1);
		m.name=s;
		return m;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			return null;
		
	}
}
class Movie
{
	int mov_id;
	String name;
}
