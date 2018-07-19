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

var idCk = false;			//ID �ߺ�üũ ���� (�ߺ��� ��� = false, �ߺ��� �ƴ� ��� = true)
var nickCk = false;		//nick �ߺ�üũ ���� (�ߺ��� ��� = false, �ߺ��� �ƴ� ��� = true)

$(function() {
	$.idCheck();
	$.nickCheck();
});

$.idCheck = function(){
	
	// idCheck ��ư�� Ŭ�� ���� ��
	$("#idCheck").click(function() {
		
		var userID = $("#mId").val();
		alert(userID);
		
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/MemberIdCheck/"+userID,
			dataType : "json",
			success : function(data) {
				alert("ajax return: "+data);
				if(data > 0) {					// �������� ����

	            	alert("���̵� �����մϴ�. �ٸ� ���̵� �Է����ּ���.");
	              	// �������� ����
	              	$("#divId").removeClass("has-success");
	                $("#divId").addClass("has-error");
	                $("#mId").focus();
	                
	            } else {				
	            	
	                alert("��밡���� ���̵��Դϴ�.");
					// �Ķ����� ����
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
	
	// nickCheck ��ư�� Ŭ�� ���� ��
	$("#nickCheck").click(function() {
		
		var userNick = $("#mNickname").val();
		alert(userNick);
		
		
			$.ajax({
				type : "POST",
				url : "${pageContext.request.contextPath}/MemberNickCheck/"+userNick,
				data : userNick,
				dataType : "json",
				success : function(data) {
					alert("ajax return: "+data);
					if(data > 0) {					// �������� ����
						
						alert("�г����� �����մϴ�. �ٸ� �г����� �Է����ּ���.");
		              	// �������� ����
		              	$("#divNick").removeClass("has-success");
		                $("#divNick").addClass("has-error");
		                $("#mNick").focus();
		                
		            } else {				
		            	
		                alert("��밡���� �г����Դϴ�.");
						// �Ķ����� ����
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
	<form action="${pageContext.request.contextPath}/MemberJoinAction">
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
			<label class="control-label">�̸���</label>
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