bview();

function bview() {
	$.ajax({
		url: "/jspweb/board/view",
		success: function(re) {
			let board = JSON.parse(re)
			console.log(board)
			document.querySelector(".bno").innerHTML = board.bno
			document.querySelector(".btitle").innerHTML = board.btitle
			document.querySelector(".bcontent").innerHTML = board.bcontent
			document.querySelector(".mid").innerHTML = board.mno
			/*/jspweb/board/filedown */
			/*
				<a href="URL?변수명=데이터">
			*/

			if (board.bfile !== null) { // null , undefined , 0 , false
				let filelink = '<a href="../board/filedown?bfile=' + board.bfile + '">' + board.bfile + '</a>'
				//' '  : 전체 문자열 처리
				//" "  : 전체 문자열내 문자열 구분
				document.querySelector(".bfile").innerHTML = filelink;
			}
			let btnbox = document.querySelector(".btnbox")
			if(board.btnaction==true){
			//삭제 버튼 활성화 
			let deletbtn = '<button onclick="bdelete('+board.bno+')"> 삭제 </button>';
			btnbox.innerHTML+=deletbtn;		
			// 수정 버튼 활성화 
			let updatebtn = '<button><a href="../board/update.jsp">수정하기</a></button>'
			btnbox.innerHTML+=updatebtn;	
			}

		}
	})

}

function bdelete(bno) {// 삭제 버튼 클릭시 삭제할 번호의 인수 [ 식별용 ]

	$.ajax({
		url: "/jspweb/board/bdelete",
		data: { "bno": bno },//삭제할 게시물의 식별번호[pk-bno]
		success: function(re) {
			if (re === 'true') {
				alert('글삭제성공')
				location.href = "../board/list.jsp";
			}
			else {
				alert('글삭제 실패 ')
			}
		}

	})
}













