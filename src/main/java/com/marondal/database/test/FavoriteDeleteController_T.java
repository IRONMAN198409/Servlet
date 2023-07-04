package com.marondal.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;


@WebServlet("/db/favorites/delete")
public class FavoriteDeleteController_T extends HttpServlet {
	
	// 특정 사이트정보를 삭제한다.
	// id를 전달받고, 일치하는 행을 삭제한다.
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "DELETE FROM `favorites` WHERE `id` = " + id + ";";
		
		mysqlService.update(query);
		
		response.sendRedirect("/database/test/favorites_list_T.jsp");
	
	}
}
