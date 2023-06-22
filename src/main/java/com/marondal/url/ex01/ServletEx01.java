package com.marondal.url.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 문자 인코딩 설정
		response.setCharacterEncoding("UTF-8");
		// 파일 형식 설정(MIME)
		response.setContentType("text/plain");
		
		
		//현재 날짜와 시간을 보여주는 페이지
		Date now = new Date();
		
		PrintWriter out = response.getWriter();
		
		out.println(now);
		
		// formating
		// 2023-06-20 19:16:48
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = formatter.format(now);
		
		out.println(formatDate);
	}
}
