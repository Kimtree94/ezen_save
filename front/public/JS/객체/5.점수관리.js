/*
	함수 : 1 정의[만들기] 2. 호출
		- 특징
			1. 함수 안에서 할당된 메모리는 함수 종료시 초기화[사라짐]



	* 학생 점수 프로그램
		1. 학생 객체 선언 ! (학생 점수를 저장할 객체)
		2. 점수 등록 버튼을 눌렀을때
			1. 해당 js 함수 호출하기
			button onclick="함수명()"
			
			2.HTML 입력받은 데이터를  js객체에 저장
			*학생 이름 중복 체크
				
			- 함수 등록 함수 사용
			- document.getElementById('id명').value;
			
			3. 여러개의 객체를 저장 ---> 배열
				- 배열은 다른 함수에서도 사용할 예정 [ 함수 밖에서 선언]
				
			4. HTML 초기화
		3. 학생 점수 출력
			1. js 처음 열렸을때 1번 /2. 학생등록 할때마다
 */
let studentlist = [ ]
학생출력()

function 점수등록() {

		//document.getElementById('kor').value :input에 입력된 무조건 문자열로 가져옴
		// Number( document.getElementById('kor').value) :input 에 입력된 문자열을 숫자열 변환해서 가져오기
	const student = {
		name: document.getElementById('name').value ,/* 이름속성 [키 : 값]*/

		kor: Number( document.getElementById('kor').value) , /* 국어 속성*/

		eng:Number( document.getElementById('eng').value) , /* 영어 속성*/

		mat:Number(  document.getElementById('mat').value)  /* 수학 속성*/
	}
	
	
	//*배열에 저장하기전[학생등록 전]에 중복체크!!!
	if (이름중복검사(student.name)) {//이름중복검사 함수에서 결과가[return]가 true 이면
		return// return 함수 종료하는 의미로 return 될 경우에는 아래코드는 실행되지 않는다.
	}
	
	
	//2.객체를 배열에 담기
	studentlist.push(student)//배열명.push(데이터) : 배열에 데이터 추가 
	//3.알림/확인
	alert('학생 점수 등록이 되었습니다')
	console.log(studentlist)
	//4.HTML에 입력된 내용 공백으로 만들기 
	document.getElementById('name').value = ''
	document.getElementById('kor').value = ''
	document.getElementById('eng').value = ''
	document.getElementById('mat').value = ''
	//5.등록 할때마다 테이블내 html 호출 
	학생출력()

}//f end

function 이름중복검사(name) {// 학생 이름 중복체크 함수 정의
	for (let i = 0; i < studentlist.length; i++) {
		// 만약에 배열에 객체가 3개 있을 경우 =>길이 : 1~3 인덱스:0~2
		//i는 0 부터 i는 배열의 길이 [배열내 객체수]미만까지 1씩 증가 반복
		if (studentlist[i].name === name) {
			//배열내 i번째 인덱스의 객체내 이름이 새로 입력받은 이름과 같으면 
			alert('이미 존재한 학생명입니다.')
			return true	//배열내 name과 동일한 이름이 있다.
		}//if end
	}//for end
	return false // 배열내 name과 동일한 이름이 없다.
}//f end

function 학생출력() {
	//1. 변수에 html 태그 [문자열]를 저장하기
	let html =
		'<tr>' +
		'<th>등수</th>' +
		'<th>학생명</th>' +
		'<th>국어</th>' +
		'<th>영어</th>' +
		'<th>수학</th>' +
		'<th>총점</th>' +
		'<th>평균</th>' +
		'<th>비고</th>' +
		'</tr>'
	// *** 배열내 객체들을 데이터를 하나씩 꺼내기 - > 객체 정보를 html 화 
	for (let i = 0; i < studentlist.length; i++) {
		//i 는 0부터 배열내 마지막 인덱스 까지[배열의 길이 -1] 1씩 증가반복
		//객체에 들어잇는 데이터를 html로 출력
		
		//총점 = 국어 + 영어 + 수학
		let sum = studentlist[i].kor+studentlist[i].eng+ studentlist[i].mat
		
		//평균 = 총점 /3 
		let avg = Math.floor( sum / 3 )
		//등수
		
		html += '<tr>' +
			'<th>등수</th>' +
			'<th>' + studentlist[i].name + '</th>' +
			'<th>' + studentlist[i].kor + '</th>' +
			'<th>' + studentlist[i].eng + '</th>' +
			'<th>' + studentlist[i].mat + '</th>' +
			'<th>'+sum+'</th>' +
			'<th>'+avg+'</th>' +
			'<th><button onclick="학생삭제('+i+')">삭제</button></th>'+
			'</tr>'
		//변수는 문자처리 X
		//변수는 앞전에 미리 정의된 단어 [ 키워드 = 컴퓨터가 알고있는 단어]
	}//for end
	//2. 해당 변수를 html에 출력하기
	document.getElementById('listtable').innerHTML = html
}//f end

function 학생삭제(i){// 학생 삭제하는 함수 [ 매개변수 :삭제할 식별번호(배열내 저장된 순서번호 = 인덱스)]
	alert( studentlist[i].name +  '삭제 버튼을 눌렀습니다.')
	studentlist.splice(i , 1)// i 번째 인덱스의 객체 1개 삭제
	학생출력() // 최신화와 같음 js자료를 html에 최신화 
}






























