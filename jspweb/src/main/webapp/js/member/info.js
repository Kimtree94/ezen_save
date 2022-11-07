/* 회원정보 호출 */
getmember()
function getmember() {
	$.ajax({
		url: "/jspweb/member/info",
		success: function(result) {
			//HTTP 스트림 (바이트단위) 통신된 json형식의 문자타입을 JSON 타입으로 형변환 
			let member = JSON.parse(result)

			document.querySelector("#mno").innerHTML = member.mno
			document.querySelector("#mid").innerHTML = member.mid
			document.querySelector("#mdate").innerHTML = member.mdate
			document.querySelector("#mpoint").innerHTML = member.mpoint

			document.querySelector("#mname").value = member.mname
			document.querySelector("#mphone").value = member.mphone
			document.querySelector("#memail").value = member.memail
			//document.querySelector("#maddress").value = member.maddress



			document.querySelector("#sample4_postcode").value = member.maddress.split(',')[0]
			document.querySelector("#sample4_execDaumPostcode").value = member.maddress.split(",")[1]
			document.querySelector("#sample4_roadAddress").value = member.maddress.split(",")[2]
			document.querySelector("#sample4_jibunAddress").value = member.maddress.split(",")[3]
		}
	})
}
/*---------모든 회원 호출-------*/
function getmemberlist() {
	$.ajax({
		url: "/jspweb/member/infolist", // 서블릿 호출 
		success: function(result) {
			let memberlist = JSON.parse(result);

			//1. tag 가져오깅
			let table = document.querySelector("#memberlisttable")

			//2.table 에 넣을 html 문자열 
			let tag = '<tr>' +
				'<td> 번호 </td>' +
				'<td> 아이디 </td>' +
				'<td> 이름 </td>' +
				'<td> 연락처 </td>' +
				'<td> 이메일 </td>' +
				'<td> 주소 </td>' +
				'<td> 날짜 </td>' +
				'<td> 포인트 </td>' +
				'</tr>';

			//3.해당 tag 값 넣기 
			for (let i = 0; i < memberlist.length; i++) {
				//4. 해당 인덱스의 객체 호출
				let m = memberlist[i]
				//5. 해당 객체의 정보를 html출력
				tag += '<tr>' +
					'<td> ' + m.mno + '</td>' +
					'<td> ' + m.mid + ' </td>' +
					'<td> ' + m.mname + ' </td>' +
					'<td>' + m.mphone + ' </td>' +
					'<td> ' + m.memail + ' </td>' +
					'<td> ' + m.maddress + '</td>' +
					'<td>' + m.mdate + ' </td>' +
					'<td>' + m.mpoint + ' </td>' +
					'</tr>';
			}//for e
			//6.
			table.innerHTML = tag;
		}//success E
	});

}
/*---------회원 탈퇴-------*/

function viewdelete() {
	//1. tag를 가져온다
	let deletebox = document.querySelector("#deletebox");
	//2. tag에 넣을 html 구상
	let tag = '<span>! 탈퇴 하시겠습니까? !</span><br>' +
		'<input type="password" id="mpassword">' +
		'<button onclick="mdelete()">확인</button>';
	//3. tag 에 html 넣기
	deletebox.innerHTML = tag
}
function mdelete() {
	//1.tag에 입력된 비밀번호 가져오기
	let mpassword = document.querySelector("#mpassword").value
	//2. ajax를 이용한 회원탈퇴 처리 
	$.ajax({
		url: "/jspweb/member/delete",
		data: { "mpassword": mpassword },
		success: function(result) {
			if (result == 'true') {
				alert('탈퇴성공');
				location.href = "/jspweb/member/logout.jsp";
			} else {
				alert('동일하지 않는 비밀번호 입니다.')
			}
		}
	})
}

let buttons = document.querySelectorAll('button') // 현재페이지의 모든 버튼 

function updateaction() {
	let mname = document.querySelector('#mname')
	
	if (buttons[1].innerHTML == '확인') {

		$.ajax({
			url: "/jspweb/member/update",
			data: { "mname": mname.value },
			success: function(result) {
				if (result === 'true') {
					 alert("수정성공")
					  }else {
				 alert('수정실패 ') 
				 }

			}
		})
		buttons[1].innerHTML = '수정'
		mname.readOnly = false;
		//location.href = 'URL '//페이지이동
		location.reload();//현재 페이지 새로고침
	} else {
		alert('수정후 확인 버튼 클릭시 수정이 완료됩니다.')
		mname.readOnly = false;
		buttons[1].innerHTML = '확인'
	}

}








/*
	선언	:let  객체명 = { 속성명 : 값 , 속성명 : 값 , 속성명 : 값 }
	호출 : 객체명.속성명
*/