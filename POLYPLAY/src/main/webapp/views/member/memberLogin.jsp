<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/MemberLoginAction">
	<div>
		<div>
			<label>id</label>
			<input type="text" id="mId" name="mId">
		</div><br>
		<div>
			<label>password</label>
			<input type="password" id="mPassword" name="mPassword">
		</div><br>
		<div>
			<input type="submit" value="�α���">
		</div>
	</div>
	</form>
</body>
</html>