package com.sorcerer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareRootServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("----------------------Square Root servlet------------------------");
		System.out.println("Using service()");
		
		HttpSession session=req.getSession();
		int k=(int) session.getAttribute("k");
		System.out.println("Getting "+k+" value from the session Object");
		System.out.println("SUM="+k);
		System.out.println("SQUARE="+k*k);
		System.out.println("CUBE="+k*k*k);
		System.out.println("SQUAREROOT="+Math.sqrt(k));
		PrintWriter out=resp.getWriter();
		out.println("SUM="+k);
		out.println("SQUARE="+k*k);
		out.println("CUBE="+k*k*k);
		out.println("SQUAREROOT="+Math.sqrt(k));
	}
}
