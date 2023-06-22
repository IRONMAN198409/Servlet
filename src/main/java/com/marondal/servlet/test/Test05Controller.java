package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class Test05Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		// 구구단을 리스트로 만든다.
		out.println("<html><head><title>구구단</title></head> <body><ul>");
		for(int i = 1; i <= 9; i++) {
			out.println("<li>" + dan + " X " + i + " = " + (dan * i) + "</li>");
		}
		
		out.println("</ul></body></html>");
		
//		response.setCharacterEncoding("utf-9");
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		
//		String number = request.getParameter("number");
//		
//		out.println("<html><head><title></title></head> <body><ul>");
//		
//		
//		for(int i = 1; i <= 9; i++) {
//			int result = Integer.parseInt(number) * i;
//			out.println("<li>" + number + " x " + i + " = " + result + "</li></body></html>");
//		}
		
	
		
		
	}
}
