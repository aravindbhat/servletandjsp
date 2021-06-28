package com.sorcerer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		System.out.println("----------------------Add servlet------------------------");
		System.out.println("@WebServlet annotation is used to configure servlet instead of web.xml file");
		System.out.println("Using doGet");
		System.out.println("The sum of numbere "+i+" and "+j+" is: "+k);
		System.out.println("Calling SquareServlet using RequestDispatcher");
		System.out.println("Passing the Sum "+k+" as attribute of Request object");
		ServletContext ctx=getServletContext();
		String name=ctx.getInitParameter("MyName");
		System.out.println("Printing Servletcontext Myname "+name);
		Cookie cookie=new Cookie("num1", i+"");
		Cookie cookie2=new Cookie("num2", j+"");
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		req.setAttribute("k", k);
		 RequestDispatcher disp=req.getRequestDispatcher("square"); 
		 disp.forward(req,resp);
		 
	}
}
