<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 제어문 사용하기2(배탈의 민족 검색)</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
	<%  // 타입을 Object로 업캐스팅을 하면 모든 타입을 저장할 수 있음
		List<Map<String, Object>> list = new ArrayList<>();
	    Map<String, Object> map = new HashMap<String, Object>() {{ put("name", "버거킹"); put("menu", "햄버거"); put("point", 4.3); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "BBQ"); put("menu", "치킨"); put("point", 3.8); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "교촌치킨"); put("menu", "치킨"); put("point", 4.1); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "도미노피자"); put("menu", "피자"); put("point", 4.5); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "맥도날드"); put("menu", "햄버거"); put("point", 3.8); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "BHC"); put("menu", "치킨"); put("point", 4.2); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "반올림피자"); put("menu", "피자"); put("point", 4.3); } };
	    list.add(map);
	    
	    String menu = request.getParameter("menu");
	    String point = request.getParameter("point");
	    
	%>
	
	<div class="container">
	<h1 class="text-center">검색결과</h1>
	
		<table class="table text-center">
			<thead>
				<th>메뉴</th>
				<th>상호</th>
				<th>별점</th>
			</thead>
			
			<tbody>
				<% for(Map<String, Object> store:list) { 
					// 메뉴명이 일치하는지
					if(menu.equals(store.get("menu"))) {
						// 별점이 4.0 이상인지
						// Down Casting
						double targetPoint = (Double)store.get("point");
						// 체크가 안되었을때 또는
						// ponit가 체크가 된 상태일때, targetPoint가 4.0 이상인 것
						// or 연산자: 앞이 참이며 뒤에는 해당사항이 없어서 조건을 당연히 안탄다. 그래서 아래로 줄여서 작성이 가능하다.
						// if(point == null || (point.equals("limit") && targetPoint >= 4.0)) { 
				//		if(point == null || targetPoint >= 4.0) { 
						
						//메뉴명이 일치하지 않으면, 아래 태그 포함하지 말아라
						if(!menu.equals(store.get("munu"))) {
							continue;
						}
						
						// point가 체크가 된 상태, targetPoint가 4.0미만
						if(point != null && targetPoint < 4.0) {
							continue;
						}
				%>
							<tr>
								<td><%= store.get("menu") %></td>
								<td><%= store.get("name") %></td>
								<td><%= store.get("point") %></td>
							</tr>
				<% }
				   // } 
				
				} %>	
				
			</tbody>
		</table>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>