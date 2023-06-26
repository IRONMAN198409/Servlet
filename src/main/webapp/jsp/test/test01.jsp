<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제1. JSP 기본 문법</title>
</head>
<body>
	<%-- 1.점수들의 평규 구하기 --%>
	<%
		int[] scores = {80, 60, 100, 95, 80};
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double average = sum / scores.length;
	%>
	<h2>점수 평균은 <%= average %> 입니다. </h2>
	
	<!-- 2.채점 결과 -->
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		
		int total = 0; 
		for(String ox:scoreList) {
			if(ox.equals("O")) {
				total += 100 / scoreList.size();	
			}
		}
	%>
	<h2>채점 결과는 <%= total %>점 입니다.</h2>
	
	<!-- 3.1부터 n까지의 합계를 구하는 함수 -->
	<%!
		// 1부터 n까지의 합을 구하는 함수
		public int sumAll(int number) {
			int sum = 0;
			for(int i = 1; i <= number; i++) {
				sum += i;
			}
			return sum;
		}
	%>
	<h2>1에서 50까지의 합은 <%= sumAll(50) %></h2>
	
	<!-- 4.나이 구하기 -->
	<%
		String birthDay = "20010820";
		int year = Integer.parseInt(birthDay.substring(0, 4));
		int age = 2023 - year + 1;
	%>
	<h2><%= birthDay %>의 나이는 <%= age %>살 입니다.</h2>

</body>
</html>