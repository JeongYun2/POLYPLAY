<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>MY 구입한 작품 </h1>



<form name="frm">

<table border="1" width="100%" style="text-align: center;">
		<!-- 속성 이름 -->
		<tr>
			<th>cidx</th>
			<th>썸네일</th>
	
		</tr>
		<c:forEach var="opvo" items="${myContentsList}" varStatus ="status">
		<!-- 속성 값 -->
		<tr>
			<td><a href="<%=request.getContextPath()%>/ContentsPlay?cidx=${opvo.cidx}">${opvo.cidx}</a></td>
			<td>${opvo.cImage}</td>
	
		</tr>
		</c:forEach>
	</table>


</form>



</body>
</html>