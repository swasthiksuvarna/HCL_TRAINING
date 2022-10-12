package org.studentservlet_crud_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.studentservlet_crud_dao.StudentDao;

@WebServlet(value="/delete")
public class StudentDeleteController  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		StudentDao dao= new StudentDao();
		Integer studentid = Integer.parseInt(req.getParameter("sid"));
		dao.deleteStudent(studentid);
	}

}
