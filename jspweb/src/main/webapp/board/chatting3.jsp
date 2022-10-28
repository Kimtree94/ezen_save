<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/jspweb/css/chatting.css">
</head>
<body>


	<%@include file="../header.jsp"%>
	<!-- 로그인한 회원 아이디 숨기기 [ 헤더.jsp loginid 변수 존재 ]  -->
	<input type="hidden" class="mid" value="<%=loginid%>"><!-- 채팅에 접속한 회원아이디 고관 -->
	<input type="hidden" class="type" value="1"> 
	<div class="container"><!-- 부트스트랩 css는 미리 만들어지 class 사용 -->
		<div class="col-sm-6 offset-3 chattingbox"> <!-- 채팅 구역 -->
			<div class="row">
				<div class="col-sm-4"> <!-- 접속회원목록 -->
			
			
			
				</div>
	<div class="col-sm-8"> <!-- 채팅창 -->
		<div  class="contentbox my-3"> <!-- 채팅창 -->
		
			<div class="secontent my-3">
				<span class="date"> </span> 
				<span class="content">  </span>
			</div>
			
			
		</div>  <!-- 채팅창  -->
					<!-- 채팅 입력창  -->
					<textarea  rows="" cols="" class="form-control msgbox" onkeyup="enterkey()"></textarea><!-- 메시지 입력 상자 -->
					<!--이모티콘, 메시지 보내기 버튼  -->
					<div class="row">
						<div class="col-sm-2">
							<button class="dropdown-toggle" type="button" id="emobutton" data-bs-toggle="dropdown"> 
								이모티콘 
							</button>
							
							<ul style="width: 400px; height: 200px;" class="dropdown-menu">
									<!-- 이모티콘 표시 구역  -->		
									<li><img  src="/jspweb/img/imoji/emo1.gif" width="70PX;" onclick="emosend()"> </li>					
							</ul>
							
						</div>	
						<div class="col-sm-3 offset-7">
							<button class="form-control" type="button" onclick="send()">보내기</button>
						</div>
					</div>
					
					
				</div>
			</div>
 		</div><!-- 채팅 구역 end -->
	</div> <!-- 컨테이너 end  -->
	<script type="text/javascript" src="../js/board/chatting.js"></script>
</body>
</html>


<!-- 	<div class="alarm"> 알람 메시지 
				<span>유재석 님이 입장 하셨습니다. </span>
			</div>
			<div class="row g-0 my-3">  받을때 
				<div class="col-sm-1 mx-2"> 프로필
					<img width="100%" class="rounded-circle" alt="" src="/jspweb/img/nike.jfif" >
				</div>
				<div class="col-sm-9"> 내용
					<div class="recontent">
						<div class="name">강호동</div>
						<span class="content">안녕하소</span>
						<span class="date"> 오전 10:08 </span>
					</div>
				</div>
			</div>
 -->