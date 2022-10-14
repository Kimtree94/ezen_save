
list();

function list(){
	$.ajax({
		url:"/jspweb/board/list",
		success: function(re){
			console.log(re)
			let boardlist = JSON.parse(re)
			console.log(boardlist)
			let html ="";
			//boardlist -> 객체를 하나씩 꺼내기 
			for(let i =0 ; i<boardlist.length ; i++){
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
			document.querySelector(".btable").innerHTML += html;
		
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














