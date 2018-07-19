<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.polyplay.pp.domain.BasketListVo" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  -->

<h1>MY찜목록</h1>

<table>
		<!-- 속성 이름 -->
		<tr>
			<th>cidx</th>
			<th>썸네일</th>
			<th>버튼</th>
	
		</tr>
		<c:forEach var="wlvo" items="${wishList}">
		<!-- 속성 값 -->
		<tr>
			<td>${wlvo.cidx}</td>
			<td>${wlvo.cImage}</td>
			<td></td>
		</tr>
		</c:forEach>
	</table>
	

</body>
</html>