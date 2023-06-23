package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class Test09Controller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 이름, 자기소개 파라미터
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		out.println("<html><head><title>입사지원서</title></head><body>");
		
		out.println("<h2>" + name + "님 지원이 완료 되었습니다.</h2><hr>");
		out.println("<p>지원 내용<br>" + introduce + "</p></body></html>");
	
//	@Override
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		String name = request.getParameter("name");
//		String contents = request.getParameter("contents");
//		
//		out.println("<html><head><title>입사지원서</title></head><body>");
//		out.println("<h2>" + name + "님 지원이 완료 되었습니다.</h2><hr>");
//		out.println("<p>지원 내용<br>" + contents + "</p></body></html>");
	}
}
