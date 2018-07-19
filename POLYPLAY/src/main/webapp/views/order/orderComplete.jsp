<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.polyplay.pp.domain.OrderPayVo" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h1>주문결제완료페이지</h1>

<form name="frm">
<table>
		<!-- 속성 이름 -->
		<tr>
			<th>cidx</th>
			<th>썸네일</th>
			<th>제목</th>
			<th>금액</th>
	
		</tr>
		<c:set var="i" value="0"/>
		<c:forEach var="oclvo" items="${orderCompleteList}" varStatus ="status">
		<!-- 속성 값 -->
		<tr>
			<td>${oclvo.cidx} ${status.count}</td>
			<td>${oclvo.cImage}</td>
			<td>${oclvo.cSubject}</td>
			<td>${oclvo.oPrice}</td>
		</tr>
		</c:forEach>
	</table>
	
	<br>
	**결제정보확인
	주문일 : ${oclvo.oWriteday}
	결제방법 : ${oclvo.pMethod}
	입금자명 : ${oclvo.pDepsitor}
	결제금액 : ${oclvo.pPrice}
	<br>
	

<input type="button"  id="main" name="main" value="메인페이지가기"  />
<input type="button"  id="myorder" name="myorder" value="주문내역확인"  />
<!-- <input type="submit"  id="pay" name="pay" value="결제하기"  /> -->
<%-- <input type="hidden" name="midx" value="${midx}"/> --%>
<input type="hidden" name="midx" value="1"/>



</form>




</body>
</html>