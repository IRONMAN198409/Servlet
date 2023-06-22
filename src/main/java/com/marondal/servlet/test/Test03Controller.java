package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class Test03Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>기사</title></head><body>");
		out.println("<h1>[단독] 고양이가 야옹해</h1>");
		out.println("기사입력시간 : 2023/05/12 19:12:12 <hr> 끝 </body></html>");
		
	}
	
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><head><title>뉴스 기사 출력</title></head><body>");
//		out.println("<h2>[단독] 고양이가 야옹해</h2><p>기사 입력시간 : 2021/03/27 06:07:04</p><hr><p>끝</p></body></html>");
//		
//	}
}
