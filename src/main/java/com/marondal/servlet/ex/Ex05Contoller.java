package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class Ex05Contoller extends HttpServlet {

		@Override
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
//			request.setCharacterEncoding("utf-8");
//			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			
			int year = Integer.parseInt(birthday.substring(0, 4));
			int age = 2023 - year + 1;
			
			out.println("<html><head><title>이름, 나이</title></head></head><body>");
			out.println("<h2>이름 : " + name + "</h2>");
			out.println("<h2>나이 : " + age + "</h2");
			
			out.println("</body></html>");
			
		}
}
