package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		
		// {"addition":123, "subtraction"21, "multiplication":1253, "division"));
		
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
	    int division = number1 / number2;
		
		out.println("{\"addition\":\"" + addition + "\", \"subtraction\":" + subtraction + "\", \"multiplication\":\"" + multiplication + "\", \"division\":\"" + division + "}");
	}
}
