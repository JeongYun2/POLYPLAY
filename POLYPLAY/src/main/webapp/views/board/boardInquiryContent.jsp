<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page import="com.polyplay.pp.domain.BoardVo" %>
<%
BoardVo bvo = (BoardVo)request.getAttribute("bvo"); 

%>

<title>Insert title here</title>
</head>
<body>
<h1>1:1문의 내용</h1>

번호:<%=bvo.getBidx() %><br>
카테고리 : <%=bvo.getbSubcate() %> <br>
글쓴이 : <%=bvo.getbWriter() %> <br>
제목: <%=bvo.getbSubject() %> <br>
내용 : <%=bvo.getbContent() %><br>

<a href="<%=request.getContextPath()%>/BoardInquiryModify?bidx=<%=bvo.getBidx()%>">수정</a>
<a href="<%=request.getContextPath()%>/BoardInquiryContentDelete?bidx=<%=bvo.getBidx()%>">삭제</a> 

</body>
</html>