<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기</title>
<script type="text/javascript">
function check() {	
  
  var formname = document.frm;
  
  
    var res;
  	res = confirm("글등록?");
  
  	if (res == true) {
	   	formname.method ="post";
	   	formname.action ="<%=request.getContextPath() %>/BoardInquiryWriteAction";
	   	formname.submit();  
  	}
  	return ;
}	

</script>
</head>
<body>
<form name="frm">
<table border=1 width="100%" height="600px">
<tr>
<td>카테고리</td>
<td>
<select name="bSubcate">
 <option value="1">회원</option>
 <option value="2">플레이어</option>
 <option value="3">결제</option>
 <option value="4">작품제안</option>
 <option value="5">신고하기</option>
 <option value="6">기타</option>
 </select>
</td>
</tr>

<tr>
<td>작성자</td>
<td>
<input type="text" name="writer"  size="20"  />
</td>
</tr>
<tr>
<td>제목</td>
<td>
<input type="text" name="bSubject" id="bSubject" size="20" maxlength="20" />
</td>
</tr>
<tr>
<td>내용</td>
<td>
<textarea name="bContent" rows=20 cols=100 ></textarea>
</td>
</tr>
<tr>
<td></td>
<td align="center">
<input type="button" name="button" value="확인" onclick="javascript:check();" />
<a href="<%=request.getContextPath() %>/BoardInquiryList"> 취소 </a><br>

</td>
</tr>
</table>
</form>
</body>
</html>
