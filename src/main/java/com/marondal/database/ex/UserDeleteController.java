package com.marondal.database.ex;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.common.MysqlService;

@WebServlet("/db/user/delete")
public class UserDeleteController extends HttpServlet {
	
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// id를 전달 받고, 해당하는 행을 삭제하는 기능
		String id = request.getParameter("id");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "DELETE FROM `new_user` WHERE `id` = " + id + ";";
		
		mysqlService.update(query);
		
		response.sendRedirect("/database/ex/ex02.jsp");
	}
}
