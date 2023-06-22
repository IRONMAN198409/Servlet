package com.marondal.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달 받고, 이름과 나이를 표로 만들어 준다.
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");  // 20010712
		
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2023 - year + 1;
		
//		out.println("<html><head><title>정보</title></head> <body>");
//		out.println("<table border=1> <tr><td>이름</td><td>" + name + "</td></tr>");
//		out.println("<tr><td>나이</td><td>" + age + "</td></tr></table></body></html>");
		
		// response에 데이터 담기
		// response에 '규격(json)'을 만들어서 전달해야함
		// name : 김인규, age : 24
		// json : dictionary
		// {"name":"김인규", "age":24} 
		//
		// json : Array
		// ["김인규", "유재석"]
		//
		// [
		//     {"name":"김인규", "age":24},
		//     {"name":"유재석", "age":32}
		// ]
		
		// {"name":"김인규", "age":24} 
		
		out.println("{\"name\":\"" + name + "\", \"age\":" + age + "}");
	}
}
