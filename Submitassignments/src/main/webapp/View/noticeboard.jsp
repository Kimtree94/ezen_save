<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> 게시판 작성</h3>
	<form action="/Submitassignments/View/notice" method="post">
		제목 : <input type="text" name="ntitle"><br>
		본문 : <textarea rows="15" cols="15" name="ncontent"	style="resize: none; text-align: center;"> </textarea><br>
		작성자 : <input type="text" name="nwriter"><br>
		비밀번호 : <input type="password" name="nPassword"><br>
		<input type="submit" value="게시물등록">
	</form>
</body>
</html>