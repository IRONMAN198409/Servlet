package com.marondal.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/favories/delete")
public class UserDeleteController extends HttpServlet {

		@Override 
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String id = request.getParameter("id");
			
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String query = "DELETE FROM `favorites` WHERE `id` = " + id + ";";
			
			mysqlService.update(query);
			
			response.sendRedirect("/database/test/test02.jsp");
			
			
		}
}
