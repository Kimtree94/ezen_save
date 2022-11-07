
//2. 첨부파일 삭제 버튼을 눌렀을때 (1. 통신경로 2. 보낼데이터 3.받을데이터 꼭 생각하기)
function bfiledelete() {
	//1. 
	if (confirm('삭제하시겠습니까?')) { // 만약에 확인 버튼을 눌렀을때 
		//confirm [ 확인 = true / 취소 = false ]
		$.ajax({
			url: "/jspweb/board/bfiledelete",
			success: function(re) {
				if (re === 'true') {
					alert('첨부파일 삭제')
					//*현재페이지 새로고침 : location.reload();
					//location.reload();
					document.querySelector("#oldbfilebox").innerHTML = '';//공백처리 
					// * 특정태그만 새로고침 : JQUERY ( $ ) 에서 제공 
					$("#oldbfilebox").load(location.href + ' #oldbfilebox')
					//$(#id).load(location.href+' #id')
					//$(.id).load(location.href+' .id')
				} else {
					alert('첨부파일 삭제 실패')
				}
			}
		})
	}//if E

}

bview();
//1. 수정 페이지에서 사용되는 기존 게시물 불러오기 
function bview() {

	$.ajax({
		url: "/jspweb/board/view",
		success: function(re) {
			let board = JSON.parse(re);
			console.log(board)

			document.querySelector(".btitle").value = board.btitle;
			// 썸머노트는 내용 저장시 html 형식으로 저장하기 때문에 
			document.querySelector(".bcontent").innerHTML = board.bcontent;

			if (board.bfile !== null) {// 첨부파일이 존재하면
				let filedelete = board.bfile + '<button type="button" onclick="bfiledelete()">삭제</button>';
				document.querySelector(".oldbfilebox").innerHTML = filedelete;

			}

			/* 썸머노트 실행 */
			$(document).ready(function() {
				$('#summernote').summernote({
					 //$('#summernote').summernote( {설정객체} );
					placeholder: ' 내용을 입력하세요 ',
					maxHeight: null,
					minHeight: 300,
				});
			});

			/*----------------------------- */
		}
	})

}







function bupdate() {

	let form = document.querySelector('form');
	let formdata = new FormData(form)

console.log(formdata)

	$.ajax({
		url: "/jspweb/board/bupdate",
		data: formdata,
		//첨부파일시
		type: "POST",
		contentType : false,
		processData : false,
		//성공시
		success: function(re) {
			console.log(re)
			if(re==='true'){
				alert('수정성공')
				location.href='view.jsp'
			}else{alert('수정실패')}
		}
	})
}



































