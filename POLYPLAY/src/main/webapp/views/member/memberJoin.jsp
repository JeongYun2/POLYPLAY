<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>memberJoin</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
<style type="text/css">
	.red {
		color: red;
	}
</style>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>

var idCk = false;			//ID 체크여부 확인 (중복일 경우 = false , 중복이 아닐경우 = true)
var nickCk = false;		//nickname 체크여부 확인 (중복일 경우 = false , 중복이 아닐경우 = true)

$(function() {
	$.idCheck();
	$.nickCheck();
});

$.idCheck = function(){
	
	// idCheck 버튼을 눌렀을 때
	$("#idCheck").click(function() {
		
		var userID = $("#mId").val();
		
		$.ajax({
			type : "POST",
			async: true,
			url : "${pageContext.request.contextPath}/MemberIdCheck",
			data: userID,
			dataType : "json",
			contentType: "application/json; charset=UTF-8",
			success : function(data) {
				
				if(data > 0) {
					$("#idText").html("중복된 아이디입니다. 다른 아이디를 입력해주세요.");
	                $("#mId").focus();
	                idCk = false;
	                
	            } else {
	            	$("#idText").html("사용 가능한 아이디입니다.");
	                idCk = true;
	            }
			},
			error : function() {
				$("#idText").html("오류가 일어났습니다.");
			}
		});
	});
}

$.nickCheck = function(){
	
	// nickCheck 버튼을 눌렀을 때
	$("#nickCheck").click(function() {
		
		var userNick = $("#mNickname").val();
		
			$.ajax({
				type : "POST",
				async: true,
				url : "${pageContext.request.contextPath}/MemberNickCheck",
				data : userNick,
				dataType : "json",
				contentType: "application/json; charset=UTF-8",
				success : function(data) {
					
					if(data > 0) {
						$("#nickText").html("중복된 닉네임입니다. 다른 닉네임를 입력해주세요.");
		                $("#mNickname").focus();
		                nickCk = false;
		            } else {
		            	$("#nickText").html("사용 가능한 닉네임입니다.");
		                nickCk = true;
		            }
				},
				error : function() {
					$("#nickText").html("오류가 일어났습니다.");
				}
			});
		
	});
}

$.check = function(){
		 
	$.clearAll();
	
		if($("#mId").val() == ""){
			$("#idText").html("아이디를 입력하시지 않으셨습니다.");
			$("#mId").focus();
			return;
		} else if($("#mPassword").val() == ""){
			$("#passwordText").html("비밀번호를 입력하시지 않으셨습니다.");
			$("#mPassword").focus();
			return;
		} else if($("#mPasswordConfirm").val() == ""){ 
			$("#passwordConfirmText").html("비밀번호 확인을 입력하시지 않으셨습니다.");
			$("#mPasswordConfirm").focus();
			return;
		} else if($("#mPassword").val() != $("#mPasswordConfirm").val()){
			$("#passwordText").html("비밀번호가 일치하지 않습니다.");
			$("#mPassword").focus();
			return;
		} else if($("#mName").val() == ""){
			$("#nameText").html("이름을 입력하시지 않으셨습니다.");
			$("#mName").focus();
			return;
		} else if($("#mNickname").val() == ""){
			$("#nickText").html("닉네임을 입력하시지 않으셨습니다.");
			$("#mNickname").focus();
			return;
		} else if($("#mEmail").val() == ""){
			$("#emailText").html("이메일을 입력하시지 않으셨습니다.");
			$("#mEmail").focus();
			return;
		} else if($("#mPhone").val() == ""){
			$("#phoneText").html("전화번호를 입력하시지 않으셨습니다.");
			$("#mPhone").focus();
			return;
		}
		
		var res; 
		res = confirm("가입 완료");
		
	  	if (res == true) {
	  		alert("확인");
	  		$('#loginForm').attr('method', 'post');
	        $('#loginForm').attr('action', '${pageContext.request.contextPath}/MemberJoinAction');
	        $('#loginForm').submit();
		}
	  	
	  	return;
}

$.clearAll = function(){
	
	$("#idText").empty();
	$("#passwordText").empty();
	$("#passwordConfirmText").empty();
	$("#emailText").empty();
	$("#phoneText").empty();
	$("#nameText").empty();
	$("#nickText").empty();
	
	return;
}
</script>
</head>
<body>
	<h1>회원가입</h1>
	<form id="loginForm">
	<div>
		<div class="form-group" >
			<label class="control-label">아이디</label>
			<div class="form-inline" id="divId">
				<input type="text" class="form-control" id="mId" name="mId">
				<input type="button" class="btn btn-primary btn-sm" id="idCheck" name="idCheck" value="아이디 중복체크">
				<div> 6~12자리 영문 또는 숫자</div>
			</div>
			<div id="idText" class="red"></div>
		</div>
		<div class="form-group">
			<label class="control-label">비밀번호</label>
			<input type="password" class="form-control" id="mPassword" name="mPassword">
			<div> 6~12자리 영문 또는 숫자</div>
		</div>
		<div id="passwordText" class="red"></div>
		
		<div class="form-group">
			<label class="control-label">비밀번호 확인</label>
			<input type="password" class="form-control" id="mPasswordConfirm" name="mPasswordConfirm">
		</div>
		<div id="passwordConfirmText" class="red"></div>
		
		<div class="form-group">
			<label class="control-label">이름</label>
			<input type="text" class="form-control" id="mName" name="mName">
			<div> 6~12자리 영문 또는 한글</div>
		</div>
		<div id="nameText" class="red"></div>
		
		<div class="form-group">
			<label class="control-label">닉네임</label>
			<div class="form-inline">
				<input type="text" class="form-control" id="mNickname" name="mNickname">
				<input type="button" class="btn btn-primary btn-sm" id="nickCheck" name="nickCheck" value="닉네임 중복체크">
			</div>
			<div> 6~12자리 영문 또는 한글</div>
		</div>
		<div id="nickText" class="red"></div>
		
		<div class="form-group">
			<label class="control-label">이메일</label>
			<input type="text" class="form-control" id="mEmail" name="mEmail">
			<div> 6~12자리 영문 또는 숫자</div>
		</div>
		<div id="emailText" class="red"></div>
		
		<div class="form-group">
			<label class="control-label">전화번호</label>
			<input type="text" class="form-control" id="mPhone" name="mPhone" placeholder="-빼고 숫자만 입력하세요">
		</div>
		<div id="phoneText" class="red"></div>
		
	</div>
	<div>
		<input class="btn btn-primary btn-sm" type="button" id="join" value="가입하기" onclick="$.check();">
		<input class="btn btn-primary btn-sm" type="button" value="취소하기" onclick="location='${pageContext.request.contextPath}/GoToHome'">
	</div>
	</form>
</body>
</html>