<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디찾기</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

<script type="text/javascript">
$(function() {
	$.idFine();
});

$.idFine = function(){
	
	
	$("#idFine").click(function() {
		
		if($("#mName").val() == ""){
			return;
		} else if($("#mPassword").val() == ""){
			return;
		}
		
        $.ajax({
			type : 'POST',
			url : "${pageContext.request.contextPath}/MemberIdFindAction",
			data : userNick,
			dataType : "json",
			contentType: "application/json; charset=UTF-8",
			success : function(data) {
				alert("ajax return: "+data);
				
				$("#idFined").html()
			},
			error : function(error) {
				alert("error : " + error);
			}
		});
        
        return;
		
	});
}
</script>

</head>
<body>
	<h1>아이디 찾기</h1>
	<form>
	<div>
		<div class="form-group" >
			<label class="control-label">이름</label>			
			<input type="text" class="form-control" id="mName" name="mName">	
		</div>
		<div class="form-group" >
			<label class="control-label">이메일</label>
			<input type="text" class="form-control" id="mEmail" name="mEmail">
		</div>
		<input type="button" id="idFine" value="아이디 찾기">
	</div>
	</form>
	<div id="idFined">
		<p></p>
		<p><a href="">로그인하기</a></p>
	</div>
</body>
</html>