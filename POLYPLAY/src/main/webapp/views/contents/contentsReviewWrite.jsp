<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function back(){
		history.back(-1);
	}
  
  
  function check(){	
		//alert(1+"1");
		
    var formname = document.frm;

	 if(formname.content.value == ""){
		alert("��ȭ���� �Է��ϼ���");
		formname.content.focus();
		return;
	
	 } 
		

		var res;
		res = confirm("Ȯ���� �����ּ���");
		if (res == true){
			formname.action ="${pageContext.request.contextPath}/ReviewWriteAction";
			formname.method ="post";
			formname.submit();
		}
		return;
		
	}
</script>
</head>
<body>
<Form name="frm">
<table>
<tr>
<td>
<textarea name="content" cols="200" rows="10" placeholder= "��ȭ ���� ������ּ���(100�� �̳�)"></textarea>
</td>
</tr>
<tr>	
<td>
<input type="button"name="button" value="����ϱ�" onclick="javascript:check();" />
<input type="button"name="button" value="���" onclick="javascript:back();" />
<td>
<tr>
</table>
</Form>
</body>
</html>