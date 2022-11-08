
//1.모든 제품 호출 메소드
getproduct();
function getproduct() {
	$.ajax({
		url: "/jspweb/admin/regist",
		data: { "type": 1 ,"option":"all"}, //type 이 1이면 모든 제품호출 
		type: "get",
		success: function(re) {
			let json = JSON.parse(re)
			let html = '';
			for (let i = 0; i < json.length; i++) {
				let list = json[i];
				html +=
					'<tr>' +
					'<td><img alt="" src="/jspweb/admin/pimg/' + list.pimg + '"></td>' +
					'<td>' + list.pno + '</td>' +
					'<td>' + list.pcno + '</td>' +
					`<td>${list.pname}</td>` +
					'<td>' + list.pprice + '</td>' +
					'<td>' + list.pdiscount + '</td>' +
					'<td>' + list.pprice * list.pdiscount + '</td>' +
					'<td>' + list.pactive + '</td>' +
					'<td>' + list.pdate + '</td>' +
					`<td>` +
					`<button type="button" onclick="updatemodel(${list.pno})">수정</button>` +
					`<button type="button" onclick="deleteproduct(${list.pno})">삭제</button>` +
					`</td>` +
					'</tr>';
				// `${}`도 가능함 
			}
			document.querySelector('.table').innerHTML += html;
		}
	})
}
//2-1. 수정 모달 실행 메소드 
function updatemodel(pno) {
	//1.해당 모달을 열어주는 버튼에 강제클릭 이벤트 실행 
	document.querySelector(".updatemodelbtn").click()//해당버튼을 누를때 
	$.ajax({
		url: "/jspweb/admin/regist",
		data: { "type": 2, "pno": pno }, //type 이 2이면 개별 제품호출 
		type: "get",
		success: function(re) {
	
			let json = JSON.parse(re)
			document.querySelector('.pno').value = json.pno
			document.querySelector('.pname').value = json.pname
			document.querySelector('.pcomment').value = json.pcomment
			document.querySelector('.pprice').value = json.pprice
			document.querySelector('.pdiscount').value = json.pdiscount
			document.querySelector('.valuebox').value = json.pactive
		}

	})

}
//2-2. 수정 처리 메소드 
function updateproduct() {

	//1.수정할 정보
	let form = document.querySelector('.updateform')
	let formdata = new FormData(form)
	//formdata 속성 추가가 가능하다 
	//formdata.set('속성명':데이터)// formdata.set('pno':pno)
	//2.수정할 대상 
	$.ajax({
		url: "/jspweb/admin/regist",
		type: "put",
		data: formdata,
		processData: false,
		contentType: false,
		success: function(re) {
			if (re == 'true') {
				alert('수정완료')
				document.querySelector(".modelclosebtn").click()
				//2.새로고침
				 pagechange('list.jsp')
			}
		}

	})
}




//3. 삭제메소드
function deleteproduct(pno) {
	if (confirm("정말 삭제하시겠습니까?"+pno)) {//확인 버튼을 눌렀을때 
		$.ajax({
			url: "/jspweb/admin/regist",
			data: { "pno": pno }, // 톰캣 서버의 기본설정값은 get,post 방식만 data속성 사용 즉 객체[Body]전송 
			//server프로젝트 폴더 클릭 ->server.xml ->63라인 정도
			//<Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443" parseBodyMethods="POST,GET,DELETE,PUT"/> 
			type: "delete",
			success: function(re) {
				alert(re)
				if (re == 'true') { alert('삭제성공'); pagechange('list.jsp') }//pagechange() = dashboard.jsp내에 dashboard.js 가 포함되어 있기 때문에 호출이 가능하다 
				else { alert('삭제실패') }
			}
		})//ajax E
	}// if E
}//f E































