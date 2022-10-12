package com.skillsoft.jdbc;
import java.sql.*;
public class JDBCInfo{
public static void main(String[] args)throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjdbc", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from Movies where mov_id=2");
//	int count=st.executeUpdate("Insert into Movies values(5,'lathesh')");
//	System.out.println(count);
	rs.next();
	String str=rs.getString(2);
	System.out.println(str);
	st.close();
	con.close();
	
}
}