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
<a href="<%=request.getContextPath() %>/GoToHome"> Ȩ���� ���� </a><br>

<a href="<%=request.getContextPath() %>/MemberLogin"> �α��� </a><br>

<a href="<%=request.getContextPath() %>/MemberJoin"> ȸ�� ���� </a><br>

<a href="<%=request.getContextPath() %>/MemberIdFind"> ���̵� ã�� </a><br>

<a href="<%=request.getContextPath() %>/MemberPwFind"> �����ȣ ã�� </a><br>

<a href="<%=request.getContextPath() %>/MemberModify"> ȸ�� ���� </a><br>

<a href="<%=request.getContextPath() %>/MemberDelete"> ȸ�� ���� </a><br>

<b>
${session.sMidx}<br>
</b>
</body>
</html>