<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  

<html lang="ko">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href=" ">
<title>Poly Play</title>

<!-- Bootstrap core CSS -->
<link href="resources/plugins/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="resources/plugins/css/custom.css" rel="stylesheet">

<!-- Helper Styles -->
<link href="resources/plugins/css/loaders.css" rel="stylesheet">
<link href="resources/plugins/css/swiper.min.css" rel="stylesheet">
<link rel="stylesheet" href="resources/plugins/css/animate.min.css">
<link rel="stylesheet" href="resources/plugins/css/nivo-lightbox.css">
<link rel="stylesheet" href="resources/plugins/css/nivo_themes/default/default.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<!-- Font Awesome Style -->
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>


<!-- Top Navigation -->
    <nav class="navbar navbar-toggleable-md mb-4 top-bar navbar-static-top sps sps--abv">
        <div class="container">
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarCollapse1" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand1" href="${pageContext.request.contextPath}/MainList">Poly<span>Play</span></a>
      <div class="collapse navbar-collapse" id="navbarCollapse1">
        <ul class="navbar-nav ml-auto">
         <li class="nav-item active"> <a class="nav-link1" href="${pageContext.request.contextPath}/MainList">Home<span class="sr-only">(current)</span></a> </li>
        <li class="dropdown nav-item">
                      <a href="#pablo" class="dropdown-toggle nav-link1" data-toggle="dropdown">장르</a>
                      <div class="dropdown-menu">
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=1" class="dropdown-item">액션</a> 
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=2" class="dropdown-item">스릴러</a>
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=3" class="dropdown-item">SF판타지</a>
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=4" class="dropdown-item">공포</a>
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=5" class="dropdown-item">코미디</a>
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=6" class="dropdown-item">로맨스</a>
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=7" class="dropdown-item">드라마</a>
                        <a href="${pageContext.request.contextPath}/ContentsList?gidx=8" class="dropdown-item">애니메이션</a>
                     
                      </div>
                    </li>
 		<li class="nav-item"> <a class="nav-link1" ></a></li>
        <li class="nav-item"> <a class="nav-link1" ></a></li>
        <li class="nav-item"> <a class="nav-link1" ></a></li>
       	<li class="nav-item"> <a class="nav-link1" ></a></li>
        <li class="nav-item"> <a class="nav-link1" ></a></li>
        <li class="nav-item"> <a class="nav-link1" ></a></li>
        <li class="nav-item"> <a class="nav-link1" ></a></li>
   
        <li class="nav-item"> <a class="nav-link1" ></a></li>
        <li class="dropdown nav-item">
                      <a href="#pablo" class="dropdown-toggle nav-link1" data-toggle="dropdown">마이페이지</a>
                      <div class="dropdown-menu">
                        <a href="${pageContext.request.contextPath}/MyBasketList" class="dropdown-item">장바구니</a> 
                        <a href="${pageContext.request.contextPath}/MyWishList" class="dropdown-item">찜한작품</a>
                        <a href="${pageContext.request.contextPath}/MyContentsList" class="dropdown-item">구입한작품</a>
                        <a href="${pageContext.request.contextPath}/MyOrderList" class="dropdown-item">주문내역</a>
                        <a href="${pageContext.request.contextPath}/MemberModify5" class="dropdown-item">회원정보수정</a>
                     
                      </div>
                    </li>
        
        <c:set var="midx" value="${sMemberMidx}" />
        <c:choose>
    	<c:when test='${sMemberMidx == null}'>            
        <li class="nav-item"> <a class="nav-link1" href="${pageContext.request.contextPath}/MemberLogin">로그인</a></li>
        </c:when>
   		
    	<c:when test='${sMemberMidx != null}'>  
    	<li class="nav-item"> <a class="nav-link1" href="${pageContext.request.contextPath}/MemberLogout">로그아웃</a></li>
        </c:when>
		</c:choose>
        </ul>
      </div>
            </div>
    </nav>




    


</body>
</html>
