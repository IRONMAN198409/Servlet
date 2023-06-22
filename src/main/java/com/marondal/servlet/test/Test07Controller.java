package com.marondal.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.parseInt(request.getParameter("price"));
		
		out.println("<html><head><title>배송결과</title></head><body>");
		
		if(!address.contains("서울시")) {
			out.println("<h1>배달 불가 지역입니다.</h1>");
		} else if(card.equals("신한카드")) {
			out.println("<h1> 결제 불가 카드입니다. </h1>");
		} else {
			// 정사적일 경우 아래와 같이 보여짐
			out.println("<h2>" + address + "로 배달 준비중</h2><hr>");
			out.println("<div>결제금액 : " + price + "</div>");
		}
 		
		out.println("</body></html>");
		
	}
}
