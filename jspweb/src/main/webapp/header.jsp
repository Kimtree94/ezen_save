<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이젠 쇼핑몰</title>
	<!-- 뷰포트 -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 사용자 정의 css 호출  -->
	<link rel="stylesheet" href="/jspweb/css/header.css">
	<!-- 폰트어썸 [아이콘 ] -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	<!-- 부트스트랩 JS -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- 부트스트랩 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	
</head>
<body>

	<div class="webbox"><!--웹 페이지 박스권 -->
	
		<div class="hd_top">
			<div>
				<!-- 로고 -->
				<span class="hd_title">
				 <a class="nav-link" href="/jspweb/index.jsp"> Ezen Shop </a>  
				 </span>
			</div>
			<div>
				<!-- 세션 호출 [ jsp방식=템플릿마다 다름 (JSP vs 리액트)] 10-11 -->
				
				<% 
					// JSP 스크립트 태그 ( 태그안에 JAVA 문법 작성 가능 )
						//jsp 기본 객체로 세션 제공
					String loginid =(String)session.getAttribute("mid");// 형변환 : 세션자료형 = object
				%>
				       
				<!-- 상단 메뉴 -->
				<ul class="hd_sub">
					<!-- 비로그인 메뉴 -->
					<!-- // java  시작//세션이 없다 => 로그인 안했다 . --> 
					<%	if	(loginid==null){%>	
						<li><a class="nav-link"  href="/jspweb/member/login.jsp">로그인</a></li>
						<li><a lass="nav-link"  href="/jspweb/member/singup.jsp">회원가입</a></li>
						<!--//세션이 존재한다 => 로그인했다.  -->
					<% }else if(loginid.equals("admin")){	%><!-- 로그인된 아이디가 admin이면 보이는 메뉴  -->
							<li> <a class="nav-link"  href="/jspweb/admin/dashboard.jsp">관리자모드</a></li>
					<!-- 로그인 메뉴  // 세션이 존재한다.    로그인 했다..  -->
					<%		}else{%>
						<li><%= loginid %> 님 안녕하세요 </li>
						<li> <a class="nav-link"  href="/jspweb/member/logout.jsp">로그아웃</a></li>
					<%   }  %>
						<!-- java E -->
					<!-- 공통메뉴  -->
					<li><a class="nav-link"  href="/jspweb/member/info.jsp">마이쇼핑</a></li>
					<li><a class="nav-link"  href="/jspweb/board/list.jsp">고객센터</a></li>
				</ul>
			</div>
		</div>
		
		<ul class="hd_menu">
			<li><a  class="nav-link" href="#">BIG SIZE!</a></li>
			<li><a  class="nav-link" href="#">1+1 이벤트</a></li>
			<li><a  class="nav-link" href="#">아우터</a></li>
			<li><a class="nav-link"  href="#">상의</a></li>
			<li><a  class="nav-link" href="#">바지</a></li>
			<li><a  class="nav-link" href="#">슈즈</a></li>
			<li><a  class="nav-link" href="#">악세사리</a></li>
			<li><a  class="nav-link" href="#">BEST</a></li>
			<li><a  class="nav-link" href="#">트레이닝</a></li>
			<li><a  class="nav-link" href="#">50% 할인</a></li>
			<li><a  class="nav-link" href="/jspweb/board/api.jsp">공공데이터</a></li>
			<li><a  class="nav-link" href="/jspweb/board/chatting.jsp">자유채팅방</a></li>
			<li class="searchbox">
				<span>
				<input type="search"> 
				<i class="fas fa-search"></i>
				</span>
				<a href="/jspweb/product/cart.jsp"><i class="fas fa-shopping-cart"></i>       </a>
				
			</li>
		</ul>
		
	</div>


<!--  JQUERY  라이브러리-->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

</body>
</html>
<!-- 
	헤더파일 [ 모든 페이지에서 호출되는 파일 ]
		경로 : 
			/jspweb/board/chatting.jsp
				/(한개) :최상위 경로 = localhost:8080/board/chatting.jsp [o]
			jspweb/board/chatting.jsp	
				현재경로 = 현재경로 /jspweb/board/chatting.jsp[x]
 -->



<!-- 
	<div> : 레이아웃 , 박스권 , 구역 [ block 한줄차지 ]
		vs
	<span> : inline
	
	
	<ul> : 글머리 리스트
		<li> : 리스트 아이템 [ 값/항목 ]

 -->