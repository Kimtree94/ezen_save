
noticelist();



function notice(){
	let ntitle=document.querySelector("#ntitle").value;
	let ncontent=document.querySelector("#ncontent").value;
	let nwriter=document.querySelector("#nwriter").value;
	let nPassword=document.querySelector("#nPassword").value;
	
	$.ajax({
		url : "/Submitassignments/member/notice",
		data:{"ntitle":ntitle ,"ncontent":ncontent,"nwriter":nwriter,"nPassword":nPassword},
		success : function(result){
			if(result=='true'){
				alert("글 쓰기 성공")
				}else{
			alert("글 쓰기 실패 ")}
		}
	})
}



function noticelist(){
	$.ajax({
		url:"/Submitassignments/member/noticelist",
		success : function(result){
				let memberlist =JSON.parse(result);
				let table = document.querySelector("#noticlist");
				
				let tag = '<tr>' +
				'<td> 제목 </td>' +
				'<td> 내용 </td>' +
				'<td> 작성자 </td>' +
				'<td> 작성일 </td>' +
				'<td> 조회수 </td>' +
				'</tr>';
				
				for(let i =0 ; i<memberlist.length;i++){
					let m = memberlist[i]
					
					tag+= '<tr>' +
				'<td>' + m.nNum + '</td>' +
				'<td>' + m.ntitle + '</td>' +
				'<td>' + m.ncontent + '</td>' +
				'<td>' + m.nwriter + '</td>' +
				'<td>' + m.ndate + '</td>' +
				'<td>' + m.nview + '</td>' +
				'</tr>';
				}
			table.innerHTML=tag;
			console.log(tag)
		}
	})
}

function deletebox(){
	let deletebox = document.querySelector("#deletenum").value;
	let deletepassword = document.querySelector("#deletepassword").value;
	$.ajax({
		url:"/Submitassignments/member/deletebox",
		data : {"deletenum": deletenum,"deletepassword":deletepassword},
		success : function(result){
			if(result=='true'){
				 alert('삭제성공')
			}else{
				alert('삭제실패 ')
			}
		}
	})
}












