package org.studentservlet_crud_controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.studentservlet_crud_dao.StudentDao;
import org.studentservlet_crud_dto.Student;

@WebServlet(value = "/register")
public class StudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String studName= req.getParameter("sname");
		 
		 
		 String studemail=req.getParameter("semail");
		 
		 StudentDao dao=new StudentDao();
		 
		 Student student= new Student();
		 student.setStname(studName);
		 student.setStemail(studemail);
		 
		 dao.saveStudent(student);
		 
		 PrintWriter pw=resp.getWriter();
		 pw.println("<html><body><h1>Data Inserted Successfully</h1></body></html>");
		 RequestDispatcher rd=req.getRequestDispatcher("registration_Student.jsp");
		 rd.include(req, resp);
		 
		 

	}

}
