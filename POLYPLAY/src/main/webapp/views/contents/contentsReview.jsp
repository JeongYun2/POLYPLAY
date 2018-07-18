<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function del(){	
var formname = document.frm;
var res;
res = confirm("삭제 하시겠습니까?");
if (res == true){
	
	formname.action ="<%=request.getContextPath()%>/ReviewDelete";
	formname.method ="POST";
	formname.submit();
}
	return;

		
		return;
	}
</script>
</head>
<body>
	<form name =frm>
	<table>
		<!-- 속성 이름 -->
		<tr>
			<th>번호</th>
			<th>회원번호(테스트)</th>
			<th>컨텐츠 번호</th>
			<th>별점</th>
			<th>리뷰내용</th>
			<th>좋아요</th>
			<th>리뷰작성날자</th>	
			<th>아이피</th>		
		</tr>
		<tr>
			<td>${rv.ridx}</td>
			<td>${rv.midx}</td>
			<td>${rv.cidx}</td>
			<td>${rv.rPoint}</td>
			<td>${rv.rContent}</td>
			<td>${rv.rLike}</td>
			<td>${rv.rWriteday}</td>
			<td>${rv.rIp}</td>
		</tr>	
		<input type='button' value='삭제' onclick='javascript:del();'></button>
		
	</table>
	</form>
	<table>
		<!-- 속성 이름 -->
		<tr>
			<th>번호</th>
			<th>회원번호(테스트)</th>
			<th>컨텐츠 번호</th>
			<th>별점</th>
			<th>리뷰내용</th>
			<th>좋아요</th>		
		</tr>
		<c:forEach items="${alist}" var="rvo">
		<!-- 속성 값 -->
		<tr>
			<td>${rv.ridx}</td>
			<td>${rv.midx}</td>
			<td>${rv.cidx}</td>
			<td>${rv.rPoint}</td>
			<td>${rv.rContent}</td>
			<td>${rv.rLike}</td>
		</tr>	
		</c:forEach>
	</table>
	
	
	
</body>
</html>