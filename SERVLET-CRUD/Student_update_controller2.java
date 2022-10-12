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

@WebServlet(value = "/updatestudent2")
public class Student_update_controller2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Student student=new Student();
		
		student.setStid(Integer.parseInt(req.getParameter("sid")));
		student.setStname(req.getParameter("sname"));
		student.setStemail(req.getParameter("semail"));
		
		StudentDao dao=new StudentDao();
		dao.updateStudentId(student, student.getStid());
		
		if(student!=null)
		{
			RequestDispatcher rs=req.getRequestDispatcher("display.jsp");
			rs.include(req, resp);
		}
		else {
			PrintWriter pw=resp.getWriter();
			pw.println("student not found");
		}
		
		
		
	}

}
