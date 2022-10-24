getdata()
////////////////////////////////////////전역번수////////////////////////////////////////////////
let datalist = null; // 전역번수로 사용하기위해 밖에 선언만 해줌 
//////////////////////////////////////함수호출/////////////////////////////////////////////////
getdata()
///////////////////////////////공공데이터 api 호출////////////////////////////////////////////////
function getdata() {

	$.ajax({
		url: "/jspweb/board/api",
		success: function(re) {
			let json = JSON.parse(re); console.log(json)// json : 전체 객체
			datalist = json.data; console.log(datalist)  // datalist : 객체중 data 속성 [ 키 , 필드 ] 호출 // 약국 리스트
			dataprint() //검색이 없을때 모든 약국 호출 
		}
	})
}
function addrsearch() {
	let addr = document.querySelector('.addrinput').value
	dataprint(addr) // 검색이 있을경우 검색어 전다 ㄹ


}

//2. 검색버튼 눌렀을떄 
function dataprint(search) {// search : 검색어 

	//console.log("타입확인 : " + typeof (search))
	//undefined vs "undefined "  //"null","" 데이터 통신이 들어올때 null이 문자로 들어오기에 제어하기위해
	//typeof 사용해서 확인  ajax는 무조건 문자열만 전송함 
	console.log(search)/* 중요 타입확인 중요함 JS는 자동변환이라 헷갈림 */
	console.log("타입확인 : " + typeof (search))/* 중요 타입확인 중요함  자동변환이라 헷갈림*/
	if (search !== undefined) {//검색이 있을경우 

		let searchlist = []; //[검색된] 약국리스트 선언
		for (let i = 0; i < datalist.length; i++) {
			let addr = datalist[i].주소
			if (addr.indexOf(search) !== -1) {// 입력한 검색어가 포함되어 있으면 
				searchlist.push(datalist[i])//리스트 추가 
			}
		}//for end
		datalist = searchlist; // 약국리스트를 검색된 약국리스트 대입

		if (search == '') { getdata(); } //만약에 검색 키워드에 입력값이 없으면 초기화 
	}//검색 if end
	let html = '';
	for (let i = 0; i < datalist.length; i++) {// 약국 하나씩 호출
		let data = datalist[i];	// i번째 약국 임시 변수 
		html += '<tr onclick="mapview(' + i + ')">' +//해당 행 클릭시 map 메소드 실행 [클릭한 인덱스 매개변수 전달 ]
			'<td>' + data.약국명 + '</td><td>' + data.대표전화 + '</td><td>' + data.주소 + '</td>' +
			'</tr>';
	} //for end
	document.querySelector('.table1').innerHTML = html;
}



////////////////////////////////////카카오지도 api ////////////////////////////////////////////////////
function mapview(i) {
	/* 카카오지도 api */
	//2. 지도 옵션 
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
			level: 3 // 지도의 확대 레벨 [ 숫자가 적으면 적을수록 확대 1[확대]~14[축소] ]
		};

	//3. 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다 (실제 지도 생성)
	var map = new kakao.maps.Map(mapContainer, mapOption);
	// 4.주소-좌표 변환 객체를 생성합니다
	var geocoder = new kakao.maps.services.Geocoder();
	// 5.주소로 좌표를 검색합니다	[ 클릭한 i번째 약국의 주소 ]
	geocoder.addressSearch(datalist[i].주소, function(result, status) {

		//정상적으로 검색이 완료됐으면 
		if (status === kakao.maps.services.Status.OK) {
			// 좌표 : 주소로 검색된 죄표 생성 객체 
			var coords = new kakao.maps.LatLng(result[0].y, result[0].x);


			// 마커 : 결과값으로 받은 위치를 마커로 표시합니다
			var marker = new kakao.maps.Marker({
				map: map, 			// 해당 객체를 표시할 map  객체 대입
				position: coords	// 마커 좌표 대입
			});

			//마커 이벤트 등록 
			// 마커에 클릭이벤트를 등록합니다
			kakao.maps.event.addListener(marker, 'click', function() {
				detailview(i)
			});

			// 인포윈도우 : 마커의 설명[말풍선 ]달기
			var infowindow = new kakao.maps.InfoWindow({
				content: '<div style="width:150px;text-align:center;padding:6px 0;">' + datalist[i].약국명 + '</div>'
			});
			infowindow.open(map, marker);

			// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
			map.setCenter(coords);
		}
	})
}

function detailview(i) {
	html = '<div>' + datalist[i].약국명 + '</div>' +
		'<div>' + datalist[i].주소 + '</div>' +
		'<div>' + datalist[i].대표전화 + '</div>' +
		'<div><button>평점주기</button></div>' +
		'<div><button>문의하기</button></div>'
	document.querySelector('.detailbox').innerHTML = html;
}

/////////////////////////////////////////////////////////////////////////
getdata2()
function getdata2() {
	$.ajax({
		url: "/jspweb/board/api2",
		success: function(re) {
			let json = JSON.parse(re)
			for (let i = 0; i < json.length; i++) {
			let data = json[i];	// i번째 약국 임시 변수 
			let html = '';
			html = '<tr>' +
			'<th>' + data.시군구 + '</th>'+
			'<th>' + data.번지본번부번 + '</th>'+
			'<th>' + data.단지명 + '</th>'+
			'<th>' + data.전용면적 + '</th>'+
			'<th>' + data.계약년월 + '</th>'+
			'<th>' + data.계약일 + '</th>'+
			'<th>' + data.계약금액 + '</th>'+
			'<th>' + data.층 + '</th>'+
			'<th>' + data.건축년도 + '</th>'+
			'<th>' + data.도로명 + '</th>'+
			'<th>' + data.해제사유발생일 + '</th>'+
			'<th>' + data.거래유형 + '</th>'+
			'<th>' + data.중개사소재지 + '</th>'+
			'</tr>';
	
			document.querySelector('.table').innerHTML+=html
			}
		}
	})
}














