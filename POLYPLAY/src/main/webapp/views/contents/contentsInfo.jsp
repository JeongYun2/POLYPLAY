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
		

	
	
	
	<section class="service-sec" id="benefits">
  <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="heading text-md-center text-xs-center" >
      <a href="${pageContext.request.contextPath}/ContentsInfo?cidx=${cv.cidx}" ><font size="5">컨텐츠 정보</font></a>
   
      <a href="${pageContext.request.contextPath}/ReviewList?cidx=${cv.cidx}"><font size="5">리뷰보기</font></a>
    </div>
        </div>
        
      <div class="col-md-8">
        <div class="row">
            <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-plus" aria-hidden="true"></i>
          <h3>영화명</h3>
          <p>제목 : ${cv.cSubject}</p>
          <p>영화시간 : ${cv.cRuntime}</p>
        </div>
        <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-leaf" aria-hidden="true"></i>
          <h3>영화정보</h3>
          <p>개봉연도 : ${cv.cOpenYear}</p>
          <p>감독 : ${cv.cDirector}</p>
          <p>배우 : ${cv.cActor}</p>
          <p>가격 : ${cv.cPrice}</p>
        </div>
        <div class="col-md-6 text-sm-center service-block"> <i class="fa fa-leaf" aria-hidden="true"></i>
          <h3>줄거리</h3>
          <p>${cv.cStory}</p>
        </div>
        </div>
      </div>
      <div class="col-md-4"> <img src="displayFile?fileName=${cv.cImage}" class="img-fluid" /> </div>
    </div>
    <!-- /.row --> 
  </div>

		<div style="text-align:center;">

	
			<button type="button" id="addWish" name="addWish" onclick="addWish();">찜하기</button>
			<button type="button" id="addBasket" name="addBasket" onclick="addBasket();" />장바구니담기</button>
			<button type="button" id="addOrder" name="addOrder" onclick="addOrder();" />바로구매</button>
			<br>
			<br>
			<br>
			<br>
		</div>
	</section>
	</form>
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