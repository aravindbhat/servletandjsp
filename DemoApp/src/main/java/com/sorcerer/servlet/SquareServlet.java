package com.sorcerer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		int k=(int)req.getAttribute("k");
		//PrintWriter print=resp.getWriter();
		//print.println("The result  is "+k);
		//print.println("The result squared is "+k*k);
		
		System.out.println("----------------------Square servlet------------------------");
		System.out.println("Using doGet()");
		System.out.println("Getting "+k+" value from the Attribute Request Object");
		System.out.println("The Square of "+k+" is: "+k*k);
		System.out.println("Calling Cube Servlet using sendRedirect()");
		System.out.println("Passing the value Sum: "+k+"  by appending it in the sendRedirct URL pattern");
		
		resp.sendRedirect("cube?k="+k);
	}

}
