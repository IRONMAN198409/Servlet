<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재시간</title>
</head>
<body>
	<h1>기사</h1>
	<%-- date.jsp 불러오기 (정적방식), 제한적으로 쓰는게 좋다 --%>
	<%@ include file="date.jsp" %>
	
	<%= now %>

</body>
</html>