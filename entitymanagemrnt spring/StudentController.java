package com.servlet.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.student.dao.StudentDao;
import com.servlet.student.dto.Student;
@WebServlet(value = "/register")
public class StudentController  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String studentname = req.getParameter("sname");
	String studentemail = req.getParameter("smail");
	
	StudentDao dao= new StudentDao();
	Student s = new Student();
	dao.saveStudent(s);
	PrintWriter pw = resp.getWriter();
	pw.write("<html><body><h1>Data Inserted Successfully</h1></body></html>");
	RequestDispatcher rd = req.getRequestDispatcher("registrationstudent.jsp");
	rd.include(req, resp);

}
}
