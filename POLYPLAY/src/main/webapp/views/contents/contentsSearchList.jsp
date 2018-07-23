<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<H1>검색 컨텐츠 리스트</H1>




<form>
	<table>
		<!-- 속성 이름 -->
		<tr>
			<th>번호</th>
			<th>장르</th>
			<th>제목</th>
			<th>가격</th>
			<th>감독</th>
			<th>배우</th>
			<th>러닝타임</th>	
			<th>개봉연도</th>	
			<th>줄거리</th>	
			<th>날짜</th>
				
				
		</tr>
		<c:forEach var="cvo" items="${searchList}">
		<!-- 속성 값 -->
		<tr>
			<td>${cvo.cidx}</td>
			<td>${cvo.gidx}</td>
			<td>${cvo.cSubject}</td>
			<td>${cvo.cPrice}</td>
			<td>${cvo.cDirector}</td>
			<td>${cvo.cActor}</td>
			<td>${cvo.cRuntime}</td>
			<td>${cvo.cOpenYear}</td>
			<td>${cvo.cStory}</td>
			<td>${cvo.cWriteday}</td>
			
		
		</tr>
		</c:forEach>
	</table>
	
	
	</form>
</body>
</html>