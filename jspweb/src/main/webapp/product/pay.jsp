<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%@include file="../header.jsp"%>

	<div class="container">
		<h5> 받는사람 </h5>
		<input type="checkbox" class="checkbtn"> 회원과 동일 
		<form >
			성명 <input type="text" class="oname"><br>
			연락처 <input type="text" class="ophone"><br>
			주소 <input type="text" class="oaddress"><br>
			배송시 요청사항 <input type="text" class="orequest"><br>
		</form>
			<button type="button" onclick="paymethod('card')">신용카드</button>
			<button type="button" onclick="paymethod('phone')">핸드폰결제</button>
			<button type="button" onclick="paymethod('trans')">계좌이체</button>
			<br>
			<button type="button" onclick="requestPay()">결제하기</button>
	</div>
	
	<!-- iamport.payment.js [ 아임포트 결제API ]-->
	<script type="text/javascript"src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	<script type="text/javascript" src="/jspweb/js/product/pay.js"></script>
</body>
</html>