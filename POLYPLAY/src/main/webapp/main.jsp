<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="Generator" content="EditPlus">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">


<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script language="javascript" src="resources/plugins/jQuery/jquery-ui.min.js" type="text/javascript"></script>
<script language="javascript" src="resources/plugins/jQuery/jq.rolling.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="resources/plugins/css/jq.rolling.css"/>
</head>
<body>

<div>
	<div id="rolling">
		<ul>
			<li class="sp01">제목 1</li>
			<li class="sp02">제목 2</li>
			<li class="sp03">제목 3</li>
		</ul>
	</div>
<ul class="pages"></ul>
</div>


<script>
	$("#rolling").rolling(490,290,{autoscroll:1, delay:1500});
</script> 



<form>
	<table>
		<tr>
		<th>
		최근 업데이트된 작품 리스트
		</th>
		</tr>
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
		<c:forEach items="${alist1}" var="cvo">
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

	<form>
	<table>
		<tr>
		<th>
		요즘 뜨는 컨텐츠
		</th>
		</tr>
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
		<c:forEach items="${alist2}" var="cvo">
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
	
	<form>
	<table>
		<tr>
		<th>
		별점 순 작품 리스트
		</th>
		</tr>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>러닝타임</th>
			<th>개봉연도</th>
			<th>줄거리</th>
			<th>이미지</th>
			<th>미리보기</th>	
			<th>별점</th>	
			
				
		</tr>
		<c:forEach items="${alist3}" var="spvo">
		<!-- 속성 값 -->
		<tr>
			<td>${spvo.cidx}</td>
			<td>${spvo.cSubject}</td>
			<td>${spvo.cRuntime}</td>
			<td>${spvo.cOpenYear}</td>
			<td>${spvo.cStory}</td>
			<td>${spvo.cImage}</td>
			<td>${spvo.cPreVideo}</td>
			<td>${spvo.rPoint}</td>
			
		
		</tr>
		</c:forEach>
	</table>
	
	
	</form>
	
	<form>
	<table>
		<tr>
		<th>
		구매 순 작품 리스트
		</th>
		</tr>
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
		<c:forEach items="${alist4}" var="slvo">
		<!-- 속성 값 -->
		<tr>
			<td>${slvo.cidx}</td>
			<td>${slvo.cSubject}</td>
			<td>${slvo.cRuntime}</td>
			<td>${slvo.cOpenYear}</td>
			<td>${slvo.cStory}</td>
			<td>${slvo.cImage}</td>
			<td>${slvo.cPreVideo}</td>
			<td>${slvo.oid}</td>
			<td>${slvo.pStatus}</td>
			
		
		</tr>
		</c:forEach>
	</table>
	
	
	</form>






</body>
</html>