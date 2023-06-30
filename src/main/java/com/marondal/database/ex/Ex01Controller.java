package com.marondal.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/ex01")
public class Ex01Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
	//	MysqlService mysqlService = new MysqlService();
		
		MysqlService mysqlService = MysqlService.getInstance();  // 디자인 패턴 중 하나인... singleton 패턴
		
		//접속
		mysqlService.connect();
		String selectQuery = "SELECT * FROM `user_goods`;";
		ResultSet resultSet = mysqlService.select(selectQuery);
		
		out.println("<html><head><title>중고목록</title></head><body>");
		try {
			while(resultSet.next() ) {
				String title = resultSet.getString("title");
				int price = resultSet.getInt("price");
				
				out.println("<div> 제목 : " + title + " 가격 : " + price + "</div>");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String insertQuery = "INSERT INTO `user_goods`\r\n"
				+ "(`sellerId`, `titLe`, `price`, `description`, `image`)\r\n"
				+ "VALUE\r\n"
				+ "(3, '고양이 간식 팝니다', 2000, '저희 고양이가 까탈스러우서 안먹어요', NULL);";
		
		int count = mysqlService.update(insertQuery);
		
		out.println("<div>삽입된 행의 개수 : " + count + "</div>");
		
		out.println("</body></html>");
		
		
		// mysql 접속 후 조회
		// 접속하기(걍 외우기)
//		try {
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			
//			// 접속주소, 아이디, 비밀번호 변수에 담기
//			String url = "jdbc:mysql://localhost:3306/jin_0608";
//			String userId = "root";
//			String password = "root";
//			
//			// 접속하기
//			Connection connection = DriverManager.getConnection(url, userId, password);
//			Statement statement = connection.createStatement();
//			
//			// 여기까지가 딱 브라우저 띄운 상태임
//			
//			// 쿼리 수행
//			String selectQuery = "SELECT * FROM `user_goods`;";
//			ResultSet resultSet = statement.executeQuery(selectQuery);  // iterator와 비슷함..
//			
//			out.println("<html><head><title>중고목록</title></head><body>");
//			
//			while(resultSet.next()) { // 현재 보고있는 행~
//				String title = resultSet.getString("title");
//				int price = resultSet.getInt("price");
//				
//				out.println("<div> 제목 : " + title + " 가격 : " + price + "</div>");
//				
//			}
//			
//			out.println("</body></html>");
//			
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
		
	}
}
