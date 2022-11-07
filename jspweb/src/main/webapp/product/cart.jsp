<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<%@ include file="../header.jsp"%>
	<div class="container">
		<table class="table cart_t">

		</table>

		<button type="button">선택삭제</button>
		<button type="button">전체삭제</button>
		<button type="button">쇼핑하기</button>
		<!-- 아임포트 결제 버튼 -->
		<button onclick="payload()" type="button" >결제하기</button>
	</div>

	
	<script type="text/javascript" src="/jspweb/js/product/cart.js"></script>
</body>
</html>