<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>

<%@ page import="com.polyplay.pp.domain.*" %>
<%@ include file="/include/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1:1문의 </title>
<%
		ArrayList<BoardVo> alist =(ArrayList<BoardVo>)request.getAttribute("alist");
		PageMaker pm = (PageMaker)request.getAttribute("pageMaker");
%>
<%-- <% int num =pm.getTotalCount()-((pm.getScri().getPage()-1)*pm.getScri().getPerPageNum());
for (BoardVo bvo : alist )
{ %>
	<tr>
	<td><%=num%></td>
	<td style="text-align:left;">
	&nbsp;&nbsp;	
	<% 
	for (int i=1;i<=bvo.getbLevel();i++){
		out.print("&nbsp;&nbsp;");
		if (i == bvo.getbLevel()){
			out.print("☞");
		}
	} 
	%>	 --%>

<%-- 
	<a href="<%=request.getContextPath() %>/BoardContentController<%=pm.makeSearch(pm.getScri().getPage())%>&bidx=<%=bvo.getBidx()%>">
	<% 
	if (pm.getScri().getSearchType() != null){
		if (pm.getScri().getSearchType().equals("bSubject")){
			out.println(bvo.getbSubject().replaceAll(pm.getScri().getKeyword(), "<span style='color:red;font-weight:bold'>"+pm.getScri().getKeyword()+"</span>"));
		}else{
			out.println(bvo.getbSubject());
		}
	}else{
		out.println(bvo.getbSubject());
	}
	%>		
	</a>
	</td>	
	<td>
	<% 
	if (pm.getScri().getSearchType() != null){
		if (pm.getScri().getSearchType().equals("bWriter")){
			out.println(bvo.getbWriter().replaceAll(pm.getScri().getKeyword(), "<span style='color:red;font-weight:bold'>"+pm.getScri().getKeyword()+"</span>"));
		}else{
			out.println(bvo.getbWriter());
		}
	}else{
		out.println(bvo.getbWriter());
	}
	%>	
	</td>
	
	<td><%=bvo.getbWriteday() %></td>		
	</tr>	
<% 
	num = num -1;
	} 
%> --%>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        $("#Write").click(function(){
            // 페이지 주소 변경(이동)
            location.href = "<%=request.getContextPath()%>/BoardInquiryWrite";
        });
    });
</script>
</head>

<body>
<h1>1:1문의</h1>

<form name=frm>
	 

        <button type="button" id="Write">글쓰기</button>
       
	<table border=1>
		<tr>
			<td>번호</td>
			<td width=100px height=50px>카테고리</td>
			<td>작성자</td>
			<td>제목</td>
			<td>등록일</td>
		</tr>


		<%
			for (BoardVo bvo : alist) {
		%>
		<tr>
		
		    <td><%=bvo.getBidx() %>
			<td><%=bvo.getbSubcate() %>
			<td><%=bvo.getbWriter()%></td>
			<td><a href="<%=request.getContextPath() %>/BoardInquiryContentPassword?bidx=<%=bvo.getBidx()%>">
			<% 
		for (int i=1;i<=bvo.getbLevel();i++){
		out.print("&nbsp;&nbsp;");
		if (i == bvo.getbLevel()){
			out.print("☞");
		}
	} 
	%>	<%=bvo.getbSubject()%></a></td>
			<td><%=bvo.getbWriteday() %></td>
		</tr>
		<%} %>

	</table>
	
</form>

</body>
</html>
<%@ include file="/include/footer.jsp" %> 




