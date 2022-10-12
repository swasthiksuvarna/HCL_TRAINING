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


@WebServlet(value="/update")

public class StudentUpdateController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	StudentDao dao= new StudentDao();
	Integer studentid = Integer.parseInt(req.getParameter("sid"));
	String studentmail = req.getParameter("smail");
	String studentname=req.getParameter("sname");
	dao.updateStudent(studentid,studentname, studentmail);
	PrintWriter pw = resp.getWriter();
	pw.write("<html><body><h1>Data Updated Successfully</h1></body></html>");
	RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
	rd.include(req, resp);

}
}
