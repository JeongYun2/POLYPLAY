<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
	<form>
	<table>
		<!-- 속성 이름 -->
			<tr>
			<th>
			<a href="${pageContext.request.contextPath}/"class="t">컨텐츠 정보</a>
			<a href="${pageContext.request.contextPath}/"class="t">리뷰보기</a>
			<a href="${pageContext.request.contextPath}/"class="t">비슷한 컨텐츠</a>
			</th>
			</tr>
			
			
			<tr>
			<td>${cv.cSubject}</td>
			<td>${cv.cRuntime}</td>
			</tr>
			<tr>
			<td>${cv.cOpenYear}</td>
			</tr>
			<img src='displayFile?fileName=${cv.cImage}'/>
			<tr>
			<td>${cv.cViewCnt}</td>
			</tr>
			<tr>
			<td>${cv.cStory}</td>
			</tr>
			<tr>
			<td>${cv.cDirector}</td>
			</tr>
			<tr>
			<td>${cv.cActor}</td>
			</tr>	
			<tr>
			<td>${cv.cPrice}</td>
			</tr>	
			
			<tr>
			<td>
			<input type="button"name="" value="찜하기" onclick="" />
			<input type="button"name="" value="장바구니" onclick="" />
			<input type="button"name="" value="바로구매" onclick="" />
			</td>
			</tr>
	</table>
	</form>
</body>
</html>