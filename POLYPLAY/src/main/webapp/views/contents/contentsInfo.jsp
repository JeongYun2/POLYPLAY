<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="/include/header.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">


function addWish(){
	
//	alert("작동합니까?");
	var formname = document.frm;

	var res;
	res = confirm("상품을 찜목록에 추가하시겠습니까?");

	if (res == true) {
		
		formname.method = "post";
		formname.action = "<%=request.getContextPath()%>/AddToWishList";
		formname.submit();
	}
	return;		
}

function addBasket() {
	
	var formname = document.frm;

	var res;
	res = confirm("상품을 장바구니에 추가하시겠습니까?");

	if (res == true) {
		
		formname.method = "post";
		formname.action = "<%=request.getContextPath()%>/AddToBasket";
		formname.submit();
	}
	return;
	
	
}

function addOrder() {
	
	var formname = document.frm;

	var res;
	res = confirm("상품을 바로구매하시겠습니까?");

	if (res == true) {
		
		formname.method = "post";
		formname.action = "<%=request.getContextPath()%>/JustOrderPay";
		formname.submit();
	}
	return;
	
	
}



</script>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div class="container">
<c:choose>
	<c:when test="${sMemberMidx != null}">
		<c:set var="midx" value="${sMemberMidx}" />
	</c:when>
	
	<c:otherwise>
		<c:set var="midx" value="0" />
	</c:otherwise>

</c:choose>

	<form name="frm" method="post">
		
<input type="text" id="midx" name="midx" value="${sMemberMidx}"/>

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
			<input type="text" name="cidx" value="${cv.cidx}"/>
			<input type="text" name="cImage" value="${cv.cImage}"/>
			<input type="text" name="cSubject" value="${cv.cSubject}"/>
			<input type="text" name="cPrice" value="${cv.cPrice}"/>

			</td>
			</tr>
	</table>
	
	

	
	</form>
	
			<button type="button" id="addWish" name="addWish" onclick="addWish();">찜하기</button>
			<button type="button" id="addBasket" name="addBasket" onclick="addBasket();" />장바구니담기</button>
			<button type="button" id="addOrder" name="addOrder" onclick="addOrder();" />바로구매</button>

</div>	
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
</body>
</html>

<%@ include file="/include/footer.jsp" %> 