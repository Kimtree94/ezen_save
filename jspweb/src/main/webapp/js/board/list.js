

let pageinfo = {
	listsize : 3, 	// 한페이지당 게시물 표시 개수
	page : 1 	  	// 현재페이지번호 
}



list(1);
function list(page){
	
	pageinfo.page=page; // 객체 정보 변경
	
	$.ajax({
		url:"/jspweb/board/list",
		data : pageinfo,
		success: function(re){
			let boards = JSON.parse(re)
			console.log( "데이터//"+boards )
			//1. Object내 게시물리스트 먼저 호출
			let boardlist = boards.data
			console.log(boardlist)
			let html ="";
			//boardlist -> 객체를 하나씩 꺼내기 
			for(let i =0 ; i<boardlist.length  ; i++){
				let b = boardlist[i]
				
				// i 번쨰 객체의 정보를 html 형식으로 변환해서 문자열에 저장 
				html+=
				'<tr>'+
					'<td>'+b.bno+'</td>'+
					//'<td> <a href="/jspweb/board/view.jsp?bno='+b.bno+'">'+b.btitle+'</a></td>'+
					'<td onclick="viewload('+b.bno+')">'+b.btitle+'</td>'+
					'<td>'+b.mid+'</td>'+
					'<td>'+b.bdate+'</td>'+
					'<td>'+b.bview+'</td>'+
				'</tr>'
			}//for E
			console.log(html)
			document.querySelector(".btable").innerHTML = html;
		
			//1. 페이징버튼 html 구성
			let pagehtml ='';
					//2. 이전버튼
					if(page<=1){ pagehtml+='<button onclick="list('+(page)+')">이전</button>'   }
					else{pagehtml+='<button onclick="list('+(page-1)+')">이전</button>'  }
					//4.페이지번호 버튼 
					for(let i=boards.startbtn ; i<=boards.endbtn;i++){
					pagehtml+='<button type="button" onclick="list('+i+')">'+i+'</button>'
					
					}
					//3. 다음버튼
					if(page>=boards.totalpage){	pagehtml+='<button onclick="list('+(page)+')">다음</button>'}
					else{pagehtml+='<button onclick="list('+(page+1)+')">다음</button>'}
					
		
			document.querySelector('.pagebox').innerHTML = pagehtml
		
		
		
		
		}
	})
}
//페이지 전환 
function viewload(bno){
	$.ajax({
		url : "/jspweb/board/viewload",
		data:{"bno":bno},	
		success : function(re){
			location.href="/jspweb/board/view.jsp"
			}
	})

}

/*
function bview(bno){
	$.ajax({
		url : "/jspweb/board/view",
		data:{"bno":bno},	
		success : function(re){
			let board = JSON.parse(re)
			console.log (board)
			}
	})

}
*/















