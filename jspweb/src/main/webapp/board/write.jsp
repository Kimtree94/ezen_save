<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%@include file="../header.jsp" %>
		
	<!-- 로그인 되있는경우만  경우에만 페이지 로드 -->
	<% if(loginid==null){response.sendRedirect("../member/login.jsp");} %>
	

	<div class="webbox">
		<h3>글쓰기</h3>
		
		<!--  1. form = 동기식 [페이지전환O] 2. ajax=[페이지전환X] 중 1개 선택  -->
		
		<!-- 1.form 형식 -->
		<!-- <form method="get" action="/jspweb/board/write">
		제목 : <input type="text" name="btitle"> <br>
		내용 : <input type="text" name="bcontent">
			<button type="submit">작성하기</button>
		</form> -->
		
		<!-- 2.ajax형식 -->
	
		제목 : <input type="text" name="btitle" id="btitle"> <br>
		내용 : <input type="text" name="bcontent"><br>
		첨부파일 : <input type="file"><br>
		<button onclick="bwrite()">작성하기</button>
		<script type="text/javascript" src="../js/board/write.js"></script>
	
	</div>
	
	
	
</body>
</html>