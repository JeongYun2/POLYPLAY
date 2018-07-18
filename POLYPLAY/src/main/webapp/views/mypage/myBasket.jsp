<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.polyplay.pp.domain.BasketListVo" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <% BasketListVo blvo = (BasketListVo)request.getAttribute("basketList"); %> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

function orderCheck() {
	
//	alert("뭐여");
	
	var formname = document.frm;

	var res;
	res = confirm("선택한 상품을 구매하시겠습니까?");

	if (res == true) {
		
		formname.method = "post";
		formname.action = "<%=request.getContextPath()%>/OrderPay";
		formname.submit();
	}
	return;

}





</script>

</head>
<body>
<h1>MY장바구니</h1>

<!-- 장바구니->찜할때 selectWishListCheck하기 Ajax로  -->

<form name="frm" method="post" action="<%=request.getContextPath()%>/OrderPay">

<table>
		<!-- 속성 이름 -->
		<tr>
			<th></th>
			<th>썸네일</th>
			<th>제목</th>
			<th>금액</th>
			<th></th>
	
		</tr>
		<c:forEach var="blvo" items="${basketList}" varStatus ="status">
		<!-- 속성 값 -->
		<tr>
			<td><input type="checkbox" id="cidx${status.count}" name="cidx" value="${blvo.cidx}"></td>
			<td>${blvo.cImage}||${blvo.cidx}</td>
			<td>${blvo.cSubject}</td>
			<td>${blvo.cPrice}</td>
		<%-- 	<input type="hidden" id="baPrice${status.count}" name="baPrice" value="${blvo.cPrice}"/> --%>
			<td>
				<a href="<%=request.getContextPath()%>/FromBaToWish">찜하기</a>
				<a href="<%=request.getContextPath()%>/MyBasketDelete">삭제</a>
				<!-- <input type="button" name="addToWish" value="찜하기" onclick=";" />
				<button id="addToWish" >삭제</button> -->
		</tr>
		</c:forEach>
	</table>

<input type="submit"  id="order" name="order" value="구매하기"  />
<%-- <input type="hidden" name="midx" value="${midx}"/> --%>
<input type="hidden" name="midx" value="1"/>


</form>

</body>
</html>