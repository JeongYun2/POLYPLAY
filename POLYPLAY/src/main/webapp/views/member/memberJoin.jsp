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
		alert(userID);
		
		$.ajax({
			type : "POST",
			async: true,
			url : "${pageContext.request.contextPath}/MemberIdCheck",
			data: userID,
			dataType : "json",
			contentType: "application/json; charset=UTF-8",
			success : function(data) {
				alert("ajax return: "+data);
				if(data > 0) {

	            	alert("중복된 아이디입니다. 다른 아이디를 입력해주세요.");
	              	// 성공(파랑)에서 실패(빨강)로 변경
	              	$("#divId").removeClass("has-success");
	                $("#divId").addClass("has-error");
	                $("#mId").focus();
	                
	            } else {				
	            	
	                alert("사용 가능한 아이디입니다.");
	             	// 실패(빨강)에서 성공(파랑)로 변경
					$("#divId").removeClass("has-error");
	                $("#divId").addClass("has-success");
	                 
	                idCk = true;
	            }
			},
			error : function(error) {
				alert("error : " + error);
			}
		});
	});
}

$.nickCheck = function(){
	
	// nickCheck 버튼을 눌렀을 때
	$("#nickCheck").click(function() {
		
		var userNick = $("#mNickname").val();
		alert(userNick);
		
		
			$.ajax({
				type : "POST",
				async: true,
				url : "${pageContext.request.contextPath}/MemberNickCheck",
				data : userNick,
				dataType : "json",
				contentType: "application/json; charset=UTF-8",
				success : function(data) {
					alert("ajax return: "+data);
					if(data > 0) {
						
						alert("중복된 닉네임입니다. 다른 닉네임를 입력해주세요.");
						// 성공(파랑)에서 실패(빨강)로 변경
		              	$("#divNick").removeClass("has-success");
		                $("#divNick").addClass("has-error");
		                $("#mNick").focus();
		                
		            } else {				
		            	
		                alert("사용 가능한 닉네임입니다.");
		             	// 실패(빨강)에서 성공(파랑)로 변경
						$("#divNick").removeClass("has-error");
		                $("#divNick").addClass("has-success");
		                 
		                nickCk = true;
		            }
				},
				error : function(error) {
					alert("error : " + error);
				}
			});
		
	});
}
</script>
</head>
<body>
	<h1>회원가입</h1>
	<form action="${pageContext.request.contextPath}/MemberJoinAction" method="post">
	<div>
		<div class="form-group" >
			<label class="control-label">아이디</label>
			<div class="form-inline" id="divId">
				<input type="text" class="form-control" id="mId" name="mId">
				<input type="button" class="btn btn-primary btn-sm" id="idCheck" name="idCheck" value="���̵� �ߺ�üũ">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label">비밀번호</label>
			<input type="text" class="form-control" id="mPassword" name="mPassword">
		</div>
		<div class="form-group">
			<label class="control-label">이메일</label>
			<input type="text" class="form-control" id="mEmail" name="mEmail">
			
		</div>
		<div class="form-group">
			<label class="control-label">전화번호</label>
			<input type="text" class="form-control" id="mPhone" name="mPhone">
		</div>
		<div class="form-group">
			<label class="control-label">이름</label>
			<input type="text" class="form-control" id="mName" name="mName">
		</div>
		<div class="form-group">
			<label class="control-label">닉네임</label>
			<div class="form-inline">
				<input type="text" class="form-control" id="mNickname" name="mNickname">
				<input type="button" class="btn btn-primary btn-sm" id="nickCheck" name="nickCheck" value="�г��� �ߺ�üũ">
			</div>
		</div>
	</div>
	<div>
		<input class="btn btn-primary btn-sm" type="submit" value="가입">
	</div>
	</form>
</body>
</html>