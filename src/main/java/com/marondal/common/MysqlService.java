package com.marondal.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	
	private static MysqlService mysqlService = null;
	
	private Connection connection = null;
	private Statement statement = null;
	
	// 객체를 리턴하는 메소드
	public static MysqlService getInstance() {
		
		if(mysqlService == null) {
			mysqlService = new MysqlService();			
		}
		return mysqlService;
	}
	
	
	// 접속을 위한 기능 메소드
	public void connect() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 접속주소, 아이디, 비밀번호 변수에 담기
			String url = "jdbc:mysql://localhost:3306/jin_0608";
			String userId = "root";
			String password = "root";
			
			// 접속하기
			connection = DriverManager.getConnection(url, userId, password);
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	// 쿼리 수행을 위한 기능 메소드
	public ResultSet select(String query) {
		try {
			ResultSet resultSet = statement.executeQuery(query);
			return resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}  
	}
	
	// insert, update, delete
	public int update(String query) {
		try {
			// 실행된 행의 개수
			int count = statement.executeUpdate(query);
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
	
	// 접속 끊기
	public void disconnect() {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
