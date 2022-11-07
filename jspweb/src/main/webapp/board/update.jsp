<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 썸머노트 코드 -->
<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>
	<%@include file="../header.jsp"%>

	<!-- 로그인 되있는경우만  경우에만 페이지 로드 -->
	<%
	if (loginid == null) {
		response.sendRedirect("../member/login.jsp");
	}
	%>
	<h3>글 수정 </h3>
	<div class="webbox">
		<form>
			제목 : <input type="text" name="btitle" class="btitle"> <br>
			내용 :<textarea id="summernote"  name="bcontent"  class="bcontent"></textarea><br>
			첨부파일 : <input type="file" name="bfile" class="bfile"><br>
			
			<!-- 기존 첨부파일 이름과 삭제버튼 표시 구역  -->
			<div id="oldbfilebox" class="oldbfilebox"></div>
			
			
			<!-- form태그 안에서 button 사용시에는 type 필수로 넣기 -->
			<button type="button" onclick="bupdate()">수정하기</button>
		</form>
	</div>
		<!-- 썸머노트 API js -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	<script src="lang/summernote-ko-KR.js"></script>
	<!-- 사용자정의 js -->
	<script type="text/javascript" src="../js/board/write.js"></script>
	
	


<script type="text/javascript" src="../js/board/update.js"></script>
</body>
</html>