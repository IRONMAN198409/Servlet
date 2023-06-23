<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제1. JSP 스크립트 요소</title>
</head>
<body>
	<h2>1.점수들의 평균 구하기</h2>
	<%
		int[] scores = {80, 60, 100, 95, 80};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
	%>
	<h3>평균점수: <%= sum %></h3>
	
	<h2>2.채점 결과</h2>
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int result = 0;
		for(int i = 0; i < scoreList.size(); i++) {
			if(scoreList.get(i).equals("O")) {
				result += 10;
			}
		}
	%>
	<h3>채점결과: <%= result %></h3>
	
	<h2>3.1부터 n까지의 합계를 구하는 함수</h2>
	<%!
		public int sum(int number) {
			int total = 0;
			for(int i = 1; i <= number; i++) {
				total += i;
			}
			return total;
		}
	%>
	<h3>1부터 n까지의 합: </h3>

</body>
</html>