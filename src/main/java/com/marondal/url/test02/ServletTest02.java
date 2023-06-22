package com.marondal.url.test02;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		// 현재 시간은 14시 52분 43초 입니다.
		
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH시 mm분 ss초");
		String formatTime = formatter.format(now);
		
		out.println("현재 시간은 " + formatTime + " 입니다.");
	}
}
