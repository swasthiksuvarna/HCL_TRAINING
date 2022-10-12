<%@page import="org.studentservlet_crud_dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="org.studentservlet_crud_dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>

<%
StudentDao dao=new StudentDao();
List<Student> stud=dao.getAllStudent();

%>

<table >
<tr>

<th>Id </th>
<th>Name </th>
<th>Email</th>
<th>Delete</th>
<th>Update</th>
</tr>

<% for(Student student : stud) { %>
<tr>
<td> <%= student.getStid() %></td>
<td> <%= student.getStname() %></td>
<td> <%= student.getStemail() %></td>
<td><a href="delete?id<%= student.getStid() %>"><button style="background-color=red">Delete</button></a>
<td><a href="update1?id<%= student.getStid() %>"><button style="background-color=yellow">Update</button></a>

</tr>
<%} %>


</table>

</body>
</html>
