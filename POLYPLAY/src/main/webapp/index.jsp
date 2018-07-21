<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<a href="<%=request.getContextPath() %>/MyBasketList"> 장바구니 고고 </a>

<br>
<br>

<a href="<%=request.getContextPath() %>/MyWishList"> 위시리스트 고고 </a>

<br>
<br>

<a href="<%=request.getContextPath() %>/MyContentsList"> 구입한작품 고고 </a>


<br>
<br>

<a href="<%=request.getContextPath() %>/MyOrderList"> 주문내역 고고 </a>



<br>
<a href="<%=request.getContextPath() %>/ContentsInfo"> 컨텐츠 상세정보 </a>


<br>
<a href="<%=request.getContextPath() %>/ReviewList?cidx=8"> 컨텐츠 리뷰정보  </a>

<br>
<a href="<%=request.getContextPath() %>/MainList"> 홈으로 가기 </a>
<br>
<a href="<%=request.getContextPath() %>/ContentsList"> 장르별 컨텐츠 리스트 </a>

<br>
<a href="<%=request.getContextPath() %>/AdminContentsWrite"> 컨텐츠 등록 </a>
<br>
<a href="<%=request.getContextPath() %>/AdminContentsModify"> 컨텐츠 수정 </a>
<br>
<a href="<%=request.getContextPath() %>/AdminContentsDelete"> 컨텐츠 삭제 </a>
<br>
<a href="<%=request.getContextPath() %>/ContentsPlay"> 컨텐츠 실행 </a>

<br><br><br><br><br>




<a href="<%=request.getContextPath() %>/MemberLogin"> 로그인 </a><br>

<a href="<%=request.getContextPath() %>/MemberJoin"> 회원 가입 </a><br>

<a href="<%=request.getContextPath() %>/MemberIdFind"> 아이디 찾기 </a><br>

<a href="<%=request.getContextPath() %>/MemberPwFind"> 비빌번호 찾기 </a><br>

<a href="<%=request.getContextPath() %>/MemberModify"> 회원 수정 </a><br>

<a href="<%=request.getContextPath() %>/MemberDelete"> 회원 삭제 </a><br>

<br><br>
<a href="<%=request.getContextPath() %>/BoardNoticeList "> 공지사항리스트 </a>
<br>
<a href="<%=request.getContextPath() %>/BoardFAQUserList "> FAQ 리스트 </a>
<br>
<a href="<%=request.getContextPath() %>/BoardInquiryList "> 1:1문의 리스트 </a>
<br>
<a href="<%=request.getContextPath() %>/BoardInquiryWrite "> 1:1문의 작성하기 </a>

</body>
</html>