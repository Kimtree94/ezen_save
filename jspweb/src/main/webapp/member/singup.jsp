<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="../css/signup.css">


</head>
<body>
	<%@include file="../header.jsp"%>
	
	<div class="webbox">
			<form class="signupform" action="/jspweb/member/signup" method="post">
			<h2 class="pagetitle">회원가입</h2>
			<h3 class="parttitle">기본정보</h3>
			<table class="signuptable">
				<tr>
					<td class="col1">아이디#</td><!--name : form 에서 사용,id:js사용 -->
					<td class="col2"><input type="text" name="mid" id="mid" onkeyup="mevent1()"> </td>
					<td class="col3"> </td>
				</tr>
				<tr>
					<td class="col1">비밀번호#</td>
					<td class="col2"><input type="password" name="mpassword" id="mpassword" onkeyup="mevent2()"> </td>
					<td rowspan="2" class="col3"> </td>
				</tr>
				<tr>
					<td class="col1">비밀번호확인#</td>
					<td class="col2"><input type="password" name="mpasswordconfirm" id="mpasswordconfirm" onkeyup="mevent3()"> </td>
				</tr>
				<tr>
					<td class="col1">이름#</td>
					<td class="col2"><input type="text" name="mname"  id="mname" onkeyup="mevent4()" > </td>
					<td class="col3"> </td>
				</tr>
				<tr>
					<td class="col1">전화번호#</td>
					<td class="col2"><input type="text" name="mphone"  id="mphone" onkeyup="mevent5()"> </td>
					<td class="col3"> </td>
				</tr>
				<tr>
					<td class="col1">이메일#</td>
					<td class="col2"><input type="text" name="memail"  id="memail" onkeyup="mevent6()"> </td>
					<td class="col3"> </td>
				</tr>
				<tr>
					<td rowspan="2" class="col1"> 주소# </td>
					<td colspan="2" class="col2">
							<span>
								<input type="text" id="sample4_postcode"placeholder="우편번호" name="maddress1"> 
								<input type="button"onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
							</span>
							<span>
								<input type="text" id="sample4_roadAddress" placeholder="도로명주소"	name="maddress2"> 
								<input type="text"	id="sample4_jibunAddress" placeholder="지번주소" name="maddress3">
							</span>
						</td>
				</tr>
				<tr>
					<td class="col2"><input	type="text" id="sample4_detailAddress" placeholder="상세주소"name="maddress4"></td>
					<td class="col3"></td>
				</tr>
			</table> 
			
				<h3 class="parttitle">이용약관</h3>
				
				 <span class="confirmbox">
	
				 	<textarea  readonly="readonly"></textarea>
					<input id="confirm1" type="checkbox"> <span>[필수] 이용약관 동의</span>
				
					<textarea  readonly="readonly">	</textarea>
					<input id="confirm2" type="checkbox"> <span>[필수] 개인정보 수집 및 이용 동의</span>
			
				 </span>
				 
				<div class="signupbtnbox">
					<button type="reset">취소하기</button>
					<button type="button" onclick="formsubmit()">회원가입</button>
					
				</div>
				</form>
		</div>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script type="text/javascript" src="../js/member/singup.js"></script>

</body>
</html>
<!-- 
	태그 식별자 : id > class > name			[ request 객체가 name 이름의 요청변수 ]
	<h3> : 제목 태그 (h1~h6 : 텍스트 굵기) 
	<input > : 입력태그
		속성 
			1. type
				1. text : 문자열 입력
				2. password : 가려진 텍스트 입력 
				3. submit 
			2. name : 태그의 식별 이름 
			3. value :
	<form> : 폼(양식)  전송기능		
		속성
			1. action = "전송을 받을 url"
			2. method = "전송 방식"
							get -> 서블릿(java ) 
				HTTP 전송 메서드
				
				GET				VS 		POST
				변수URL 표시				변수URL표시X
				보안낮음					보안 높음 
				캐시(기록) 남음				캐시가(기록) 남지 않음
				다음접속시 속도빠름 			다음접속시 속도가 같음 
 				[상세페이지 등]				[ 회원가입 , 로그인 ]
 
 -->








