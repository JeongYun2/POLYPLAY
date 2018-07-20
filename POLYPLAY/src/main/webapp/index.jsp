<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="<%=request.getContextPath() %>/GoToHome"> 홈으로 가기 </a><br>

<a href="<%=request.getContextPath() %>/MemberLogin"> 로그인 </a><br>

<a href="<%=request.getContextPath() %>/MemberJoin"> 회원 가입 </a><br>

<a href="<%=request.getContextPath() %>/MemberIdFind"> 아이디 찾기 </a><br>

<a href="<%=request.getContextPath() %>/MemberPwFind"> 비빌번호 찾기 </a><br>

<a href="<%=request.getContextPath() %>/MemberModify"> 회원 수정 </a><br>

<a href="<%=request.getContextPath() %>/MemberDelete"> 회원 삭제 </a><br>

<b>
${session.sMidx}<br>
</b>
</body>
</html>