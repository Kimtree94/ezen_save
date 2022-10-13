<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h3> 게시판 작성</h3>
		제목 : <input type="text" id="ntitle"><br>
		본문 : <textarea rows="15" cols="15" id="ncontent"style="resize: none; text-align: center;"> </textarea><br>
		작성자 : <input type="text" id="nwriter"><br>
		비밀번호 : <input type="password" id="nPassword"><br>
		<button onclick="notice()">게시물등록</button>
	<div id="webbox">
		<h3> 글목록 </h3>
		<table id="noticlist">
		</table>
		삭제할 글 번호<input type="text" id="nNum"> 
		비밀번호<input type="password" id="nPassword2">
		<button onclick="deletebox()">삭제하기</button>
		
		<div>
			<table id="detail">
			</table>
		
		</div>
	</div>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src=../js/member/noticelist.js></script>

</body>
</html>	