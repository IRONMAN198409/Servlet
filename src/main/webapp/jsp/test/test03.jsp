<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Method - 링크(날짜 시간 정보)</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<%
		//날짜 정보를 보여줄 때는 date, 시간은 time
		String what = request.getParameter("what");
		Date now = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 yyyy년 M월 d일");
		SimpleDateFormat timeFormatter = new SimpleDateFormat("현재 시간 HH시 mm분 ss초");
		
		String dateString = dateFormatter.format(now);
		String timeString = timeFormatter.format(now);
		
		String resultString = null;
		//현재 날짜를 보여주고 싶을 때
		if(what.equals("date")) {
			resultString = dateString;
		} else { // 현재 시간을 보여주고 싶을 때
			resultString = timeString;
		}
	%>
	
	<div class="container">
		<div class="display-4"><%= resultString %></div>
	</div>	
	
	
	<!--   내가 작성한 코드
	<% 
		String type = request.getParameter("type");
		String result = "";
		if(type.equals("date")) {
			SimpleDateFormat formatter = new SimpleDateFormat("오늘날짜 yyyy년 M월 d일");
			result = formatter.format(now);
		} else if(type.equals("time")) {
			SimpleDateFormat formatter = new SimpleDateFormat("현재시간 HH시 mm분 ss초");
			result = formatter.format(now);
		}
	%>
	
	<%= result %> 
	-->
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>