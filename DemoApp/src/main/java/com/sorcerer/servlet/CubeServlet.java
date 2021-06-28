package com.sorcerer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CubeServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("----------------------Cube Servlet------------------------");
		System.out.println("@WebServlet annotation is used to configure servlet instead of web.xml file");
		System.out.println("Using service()");
		
		int k=Integer.parseInt(req.getParameter("k"));
		System.out.println("Getting "+k+" value from the getParameter of Request Object");
		System.out.println("The Cube of "+k+" is: "+k*k*k);
		System.out.println("Passing "+k+" value by setting it as Session attribute");
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		ServletContext ctx=getServletContext();
		String name=ctx.getInitParameter("MyName");
		System.out.println("Printing Servletcontext Myname "+name);
		resp.sendRedirect("squareRoot");
	}
}
