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

<h1>MY����</h1>

<table>
		<!-- �Ӽ� �̸� -->
		<tr>
			<th>�����</th>
			<th>����</th>
			<th>��ư</th>
	
		</tr>
		<c:forEach var="blvo" items="${basketList}">
		<!-- �Ӽ� �� -->
		<tr>
			<td>${blvo.cImage}</td>
			<td>${blvo.cSubject}</td>
		</tr>
		</c:forEach>
	</table>
	

</body>
</html>