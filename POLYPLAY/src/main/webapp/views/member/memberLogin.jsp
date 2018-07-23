<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript">

$.check = function(){
	
	if($("#mId").val() == ""){
		alert("아이디를 입력하시지 않으셨습니다.");
		$("#mId").focus();
		return;
	} else if($("#mPassword").val() == ""){
		alert("비밀번호를 입력하시지 않으셨습니다.");
		$("#mPassword").focus();
		return;
	}
	
	var res; 
	res = confirm("로그인하시겠습니까?");
  
  	if (res == true) {
  		$('#loginForm').attr('method', 'post');
        $('#loginForm').attr('action', '${pageContext.request.contextPath}/MemberLoginAction');
        $('#loginForm').submit();
	}
  	
  	return;
}; 
</script>
</head>
<body>
	<form id="loginForm">
			<label>id</label><br>
			<input type="text" id="mId" name="mId" placeholder="아이디 입력"><br>
			<label>password</label><br>
			<input type="password" id="mPassword" name="mPassword" placeholder="비밀번호 입력"><br>
			<input type="checkbox" name="useCookie" id="useCookie" /><br>
			<input type="button" value="Login" id="login" onclick="$.check();"><br>
			<a href="${pageContext.request.contextPath}/MemberIdFind">아이디 찾기</a><br>
			<a href="${pageContext.request.contextPath}/MemberPwFind">비밀번호 찾기</a><br>
			<a href="${pageContext.request.contextPath}/MemberJoin">회원 가입</a><br>
	</form>
</body>
</html>