<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- 썸머노트 API css -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
</head>
<body>
	<%@include file="../header.jsp"%>

	<!-- 로그인 되있는경우만  경우에만 페이지 로드 -->
	<%
	if (loginid == null) {
		response.sendRedirect("../member/login.jsp");
	}
	%>


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
		<form>
			제목 : <input type="text" name="btitle" > <br>
			<textarea id="summernote" name="bcontent"></textarea><br>
			첨부파일 : <input type="file" name="bfile"><br>
		<!-- form태그 안에서 button 사용시에는 type 필수로 넣기 -->
			<button type="button" onclick="bwrite()">작성하기</button>
		</form>
	</div>
		<!-- 썸머노트 API js -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
   <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
   <script src="lang/summernote-ko-KR.js"></script>
	<!-- 사용자정의 js -->
	

<script type="text/javascript" src="../js/board/write.js"></script>
</body>
</html>