
/*썸머노트*/
  $(document).ready(function() {
     $('#summernote').summernote({
      pliaceholder : '내용입력',
        maxHeight : null,
        minHeight : 300,
        lang : 'ko-KR'
   });
});



function bwrite() {



	//form 버전 
	let form = document.querySelector('form')//1. from 태그 호출
	console.log(form)

	//스크립트에서 지원하는 form전송 양식
	let formdata = new FormData(form)// 2. 객체화된 from 정보 호출 

	console.log(formdata)


	$.ajax({ // ajax 통신 전송타입 : 문자열 
		url: "/jspweb/board/write",	//서블릿 주소 
		data: formdata, // ajax 기본값으로 form 전송 불가능 

		//첨부파일 전송시 : 아래 코드 추가 [1.post방식[get방식불가] 2.]
		type: 'POST', // http메소드 [ get(첨부파일 지원안됨) vs post] 
		contentType: false,
		// 기본값: application/x-www-form-urlencoded;charset = UTF-8 : 첨부파일 지원 X
		//vs 
		//false : multipart/form-data		: 대용량 바이트 [ 첨부파일 지원 ]
		processData: false, // string : 기본값 vs 전송시 사용되는 타입
		//기본값  : 전송url 데이터 명시  http://example.com?title=tit&
		//vs
		//false : http://example.com
		success: function(re) {
			if (re === 'true') { alert('글등록성공'); location.href = "list.jsp" }
			else { alert('글등록실패') }
		}
	})








	/*
	//form 없는 버전
	let inputs = document.querySelectorAll('input')
	
	console.log(inputs)
	let data={
		btitle : inputs[1].value,
		bcontent : inputs[2].value
	}
	
	console.log(data)
	
	
	$.ajax({
		url : "/jspweb/board/write",
		data : data,
		success : function(re){
		if(re==='true'){alert('글등록성공');location.href="list.jsp"}	
		else{alert('글등록실패')}	
			}
	});
	*/


}
/* let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~~ } */