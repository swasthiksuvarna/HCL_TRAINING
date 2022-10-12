package com.skillsoft.jdbc;

import java.sql.*;


public class JDBCInfo5
{
	public static void main(String[] args)throws Exception {
		LatestMovies mv=new LatestMovies();
		LatestMovie m=new LatestMovie();
		m.id=55;
		m.name="raina";
		mv.add(m);
	}
}
class LatestMovies
{
	public void add(LatestMovie m)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
		PreparedStatement pst=con.prepareStatement("insert into Movies values(?,?)");
		pst.setInt(1, m.id);
		pst.setString(2, m.name);
		int count=pst.executeUpdate();
		System.out.println(count);
		pst.close();
		con.close();
		
	}
}
class LatestMovie
{
	int id;
	String name;
}