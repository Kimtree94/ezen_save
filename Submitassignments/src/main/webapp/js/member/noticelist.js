recomentlist();
noticelist();
//글 작성
function notice() {
	let ntitle = document.querySelector("#ntitle").value;
	let ncontent = document.querySelector("#ncontent").value;
	let nwriter = document.querySelector("#nwriter").value;
	let nPassword = document.querySelector("#nPassword").value;

	$.ajax({
		url: "/Submitassignments/member/notice",
		data: { "ntitle": ntitle, "ncontent": ncontent, "nwriter": nwriter, "nPassword": nPassword },
		success: function(result) {
			if (result == 'true') {
				alert("글 쓰기 성공")
				location.reload()
			} else {
				alert(result)
			}
		}
	})
}


//글목록
function noticelist() {
	$.ajax({
		url: "/Submitassignments/member/noticelist",
		success: function(result) {
			let memberlist = JSON.parse(result);
			let table = document.querySelector("#noticlist");

			let tag = '<tr>' +
				'<td> 번호 </td>' +
				'<td> 제목 </td>' +
				'<td> 내용 </td>' +
				'<td> 작성자 </td>' +
				'<td> 작성일 </td>' +
				'<td> 조회수 </td>' +
				'</tr>';

			for (let i = 0; i < memberlist.length; i++) {
				let m = memberlist[i]

				tag += '<tr>' +
					'<td >' + m.nNum + '</td>' +
					'<td onclick="detail(' + m.nNum + ')"' + m.ntitle + '</td>' +
					'<td>' + m.ncontent + '</td>' +
					'<td>' + m.nwriter + '</td>' +
					'<td>' + m.ndate + '</td>' +
					'<td>' + m.nview + '</td>' +
					'</tr>';
			}
			table.innerHTML = tag;
		}
	})
}
//글 삭제
function deletebox() {
	let nNum = document.querySelector("#nNum").value;
	let nPassword2 = document.querySelector("#nPassword2").value
	console.log("비번" + nPassword)
	$.ajax({

		url: "/Submitassignments/member/deletebox",
		data: { "nNum": nNum, "nPassword2": nPassword2 },
		success: function(result) {
			alert(result)
			if (result == 'true') {
				alert('삭제성공')
			} else {
				alert('패스워드가 틀립니다.')
			}
		}
	})

}
// 글 상세보기 
function detail(nNum) {
	$.ajax({
		url: "/Submitassignments/member/dtail",
		data: { "nNum": nNum },
		success: function(re) {
			let de = JSON.parse(re);
			let t = document.querySelector("#detail");
			let html = '<tr>' +
				'<td> 번호 </td>' +
				'<td> 제목 </td>' +
				'<td> 내용 </td>' +
				'<td> 작성자 </td>' +
				'<td> 작성일 </td>' +
				'<td> 조회수 </td>' +
				'댓글작성란 <input type="text" id="recoment"><br>' +
				'작성자 <input type="text" id="rewriter"><br>' +
				'<button onclick="recoment()">댓글달기</button>' +
				'</tr>';


			for (let i = 0; i < de.length; i++) {

				let m = de[i]
				html +=
					'<tr>' +
					'<td>' + m.nNum + '</td>' +
					'<td onclick="detail(' + m.nNum + ')">' + m.ntitle + '</td>' +
					'<td>' + m.ncontent + '</td>' +
					'<td>' + m.nwriter + '</td>' +
					'<td>' + m.ndate + '</td>' +
					'<td>' + m.nview + '</td>' +
					'</tr>' + '</div>';
			}

			t.innerHTML = html;
		}
	})//1ajax E
	$.ajax({ //글 조회수 증가 
		url: "/Submitassignments/member/count",
		data: { "nNum": nNum },
		success: function(re) {
			if (re == 'true') { }
			else { alert('조회수 증가 안됨 관리자에게 문의') }
		}
	})

}
//댓글달기
function recoment() {
	let recoment = document.querySelector('#recoment').value
	let rewriter = document.querySelector('#rewriter').value
	$.ajax({
		url: "/Submitassignments/member/recoment",
		data: { "recoment": recoment, "rewriter": rewriter },
		success: function(re) {

			if (re === 'true') { alert('댓글등록 성공') }
			else { alert('중복된 내용은 작성할수 없습니다.') }
		}
	})
}

function recomentlist() {
	let recomentlist = document.querySelector('#recoment')
	$.ajax({
		url: "/Submitassignments/member/recomentlist",
		success: function(re) {
			alert(re)
			let result = JSON.parse(re)
			for (let i = 0; i < result.length; i++) {
			let mem = result[i]
				let html = '<tr>' +
					'<h3> =>댓글목록<= </h3>' +
					'<td>' + mem.rNum  + '</td>' +
					'<td>'+mem.rcontent+'</td>' +
					'<td> '+mem.rwriter+' </td>' +
					'<td> '+mem.rdate+'</td>' +
					'</tr>';
			}
			recomentlist.innerHTML=html;
		}//success E
	})
}








