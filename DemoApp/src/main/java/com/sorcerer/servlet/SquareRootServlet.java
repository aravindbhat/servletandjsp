package com.sorcerer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.InternalFrameUI;



public class SquareRootServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("----------------------Square Root servlet------------------------");
		System.out.println("Using service()");
		int i=0;
		int j=0;
		Cookie [] cookies=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("num1")) {
				i=Integer.parseInt(c.getValue());
			}
			if(c.getName().equals("num2")) {
				j=Integer.parseInt(c.getValue());
			}
		}
		System.out.println("Getting num1 and num2 values from cookies");
		HttpSession session=req.getSession();
		int k=(int) session.getAttribute("k");
		System.out.println("Getting sum value from the session Object");
		System.out.println("SUM of "+i+" and "+j+" = "+k);
		System.out.println("SQUARE of "+k+" = "+k*k);
		System.out.println("CUBE of "+k+" = "+k*k*k);
		System.out.println("SQUAREROOT of "+k+" = "+Math.sqrt(k));
		ServletContext ctx=getServletContext();
		String name=ctx.getInitParameter("MyName");
		System.out.println("Printing Servletcontext Myname "+name);
		ServletConfig config=getServletConfig();
		String name2=config.getInitParameter("name");
		System.out.println("Printing Servletconfig name "+name2);
		PrintWriter out=resp.getWriter();
		out.println("Getting sum value from the session Object");
		out.println("SUM of "+i+" and "+j+" = "+k);
		out.println("SQUARE of "+k+" = "+k*k);
		out.println("CUBE of "+k+" = "+k*k*k);
		out.println("SQUAREROOT of "+k+" = "+Math.sqrt(k));
		
		
	}
}
