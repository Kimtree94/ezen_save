<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 

<link href="/jspweb/css/productview.css" rel="stylesheet">
</head>
<body>
	<%@ include file="../header.jsp"%>

	<%
	//자바를 작성할수 있는 태그 [ 서블릿 ] 
	//1. 경로에 있는 pno request 요청
	//2. 만약에 경로에 
	//if(request.getParameter("pno")==null){response.sendRedirect("/jspweb/index.jsp");}
	//1.경로에 있는 pno 요청
	int pno =Integer.parseInt(request.getParameter("pno"));
	//2. 로그인된 회원정보 호출
	Object object =session.getAttribute("mid");
	String mid = null;
	if(object!=null){//로그인했다,
		mid = (String)object;
	}
	%>
	
	<input type="hidden" value="<%=pno%>" class="pno">
	<input type="hidden" value="<%=mid%>" class="mid">
	<div class="container">
		<!-- b : container -->
		<div class="row">
			<!-- b : row -->
			<!-- 대표	 이미지 -->
			<div class="col-md-6">
				<!-- b : col-md-6 -->
				<img class="pimg" alt="" src="/jspweb/img/사줘.jpg">
			</div>
			<!-- 상품 정보  -->
			<div class="col-md-6">
				<div class="infobox">
					<!-- 제품명  -->
					<h4 class="pname">나이키 업템포 96 화이트</h4>
					
					<!-- 제품설명 -->
					<div class="pcomment">Nike uptempo White 255 Size</div>
					
					<!-- 가격 -->
					<div class="pricebox">
					</div>
					
				

					<!-- 사이즈 종류  -->
					<div class="sizebox">
					</div>

					<!-- 제품 옵션 -->
					<table class="table info_t">
						<!-- b : table -->
						<tr>
							<td>배송구분</td>
							<td>2,500원(70,000원 이상 구매시 무료)</td>
						</tr>
						<tr>
							<td>카드혜택</td>
							<td>무이자 할부</td>
						</tr>
						<tr>
							<td>적립혜택</td>
							<td>3000(1%)</td>
						</tr>
						<tr>
							<td>색상</td>
						<td>
							<select class="color_select"> <!-- b:form-select -->
									
							</select>
						</td>
						</tr>
						<tr>
							<td>사이즈</td>
							<td>
								<select class="size_select">
									
								</select>
							</td>
						</tr>
					</table>
					
					<!-- 선택된 제품 목록  --> 
					<table class="table select_t">
						<tr> 
							<th width="60%">상품명/옵션 </th> 
							<th width="25%"> 수량</th> 
							<th width="15%">가격</th>
						</tr>
					
					</table>
					
					<!-- 선택된 제품들의 총 가격 -->
					<div class="row">
						<div class="col-md-6">총 상품금액</div>
						<div class="col-md-6 totalprice">0원(0)개</div>
					</div>
					
					<!-- 버튼 목록-->
					<div class="btnbox">
						<button id="btn1">바로 구매</button>
						<button id="btn2" class="btncart">장바구니 담기</button>
						<button id="btn3" class="btnlike">찜하기 ♡</button> <!-- 로그인된 회원이 찜하기 X -->
					</div>
				</div>
			</div> 
		</div>

	</div>
	
<script type="text/javascript" src="/jspweb/js/product/productview.js"></script>

</body>
</html>