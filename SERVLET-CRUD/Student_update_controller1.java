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

@WebServlet(value = "/update1")
public class Student_update_controller1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		StudentDao dao=new StudentDao();
		Integer id=Integer.parseInt(req.getParameter("sid"));
		Student student=dao.getStudentById(id);
		
		if(student!=null)
		{
			RequestDispatcher rs=req.getRequestDispatcher("stupdate.jsp");
			req.setAttribute("student", student);
			rs.forward(req,resp);
		}
		else {
			PrintWriter pw=resp.getWriter();
			pw.println("student not found");
		}
		
	}

}
