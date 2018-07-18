<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!--  -->

<h1>MY찜목록</h1>

<table>
		<!-- 속성 이름 -->
		<tr>
			<th>썸네일</th>
			<th>제목</th>
			<th>버튼</th>
	
		</tr>
		<c:forEach var="blvo" items="${basketList}">
		<!-- 속성 값 -->
		<tr>
			<td>${blvo.cImage}</td>
			<td>${blvo.cSubject}</td>
		</tr>
		</c:forEach>
	</table>
	

</body>
</html>