<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>


	<div class="container">


		<table class="table table">
			<tr>
				<th style="width:5%">제품이미지</th>
				<th>제품번호</th>
				<th>카테고리</th>
				<th>제품명</th>
				<th>가격</th>
				<th>할인율</th>
				<th>판매가[가격*할인율]</th>
				<th>판매상태</th>
				<th>등록날짜</th>
				<th>비고</th>
			</tr>
		</table>
	</div>
	
	<!-- 부트스트랩 모달 -->
	<!-- Button trigger modal -->
<button style="display: none;" type="button" class="updatemodelbtn btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
</button>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content"> 		<!--모달 내용 -->
    
      <div class="modal-header">		<!-- 모달 타이틀  -->
        <h1 class="modal-title fs-5" id="staticBackdropLabel">제품 수정창 </h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      
      <div class="modal-body"> 		<!-- 모달 본문 -->
       <!-- regist.jsp form 사용 -->
      		<form class="updateform">
				제품번호 = <input type="text" readonly="readonly" name="pno" class="pno"><br>  
				제품명 : <input type="text" name="pname" class="pname"><br>
				설명 :  <textarea rows="" cols="" name="pcomment" class="pcomment"></textarea><br>
				가격 : <input type="text" name="pprice" class="pprice"><br>
				할인율 : <input type="text" name="pdiscount" class="pdiscount"><br>
				카테고리 :<span class="categorybox"></span><br>
				제품상태 :
				<span class="valuebox">
				<input type="radio" name="pactive" value="0" > 준비중 
				<input type="radio" name="pactive" value="1"> 판매중  
				<input type="radio" name="pactive" value="2"> 재고없음   <br>
				</span>
				상품대표이미지 : <input type="file" id="pimg" name="pimg"><br>
		</form>
      </div>
      
      <div class="modal-footer"> 		<!-- 모달 푸터  -->
        <button type="button" class="modelclosebtn btn btn-secondary" data-bs-dismiss="modal">닫기</button>
        <button type="button" class="btn btn-primary" onclick="updateproduct()">수정</button>
      </div>
      
      
    </div><!--모달 내용 -->
  </div><!--"modal-dialog"  -->
</div><!-- modal fade" -->
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<!-- ======================================================= -->
	<script type="text/javascript" src="/jspweb/js/admin/regist.js"></script>
	<script src="/jspweb/js/admin/list.js" type="text/javascript"></script>
</body>
</html>