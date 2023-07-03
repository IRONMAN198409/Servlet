package com.marondal.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/favories/insert")
public class UserInsertController extends HttpServlet {

		@Override 
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String name = request.getParameter("name");
			String url = request.getParameter("url");
			
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String query = "INSERT INTO `favorites`\r\n"
					+ "(`name`, `url`)\r\n"
					+ "VALUE\r\n"
					+ "('" + name + "', '" + url + "');";
			
			int count = mysqlService.update(query);

			response.sendRedirect("/database/test/test02.jsp");
			
		}

}