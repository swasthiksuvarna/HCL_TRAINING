package com.project.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/home")
public class Home extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession hs = req.getSession();
	PrintWriter pw = resp.getWriter();
	if(hs.getAttribute("myname")!=null) {
		RequestDispatcher dispatcher = req .getRequestDispatcher("home.jsp");
		dispatcher.forward(req, resp);
	}
	else  {
		pw.println("Invalid username and password");
		RequestDispatcher dispatcher =req.getRequestDispatcher("login.jsp");
		dispatcher.include(req, resp);
	}
}
}
