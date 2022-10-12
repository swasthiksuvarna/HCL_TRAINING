package com.project.httpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/login")
public class Login extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	String pswd = req.getParameter("pswd");
	HttpSession hs = req.getSession();
	PrintWriter pw = resp.getWriter();
	if(name.equals("Amisha") && pswd.equals("123")) {
		hs.setAttribute("myname", name);
	
	RequestDispatcher dispatcher =req.getRequestDispatcher("/home");
	dispatcher.forward(req, resp);
	}
	else {
		pw.println("Invalid username and password");
		RequestDispatcher dispatcher =req.getRequestDispatcher("login.jsp");
		dispatcher.include(req, resp);
	}
}
}
