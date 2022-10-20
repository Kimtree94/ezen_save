//2. 로그인 id 호출 [ jsp vs ajax 세션 호출 ]
let mid = document.querySelector('.mid').value
//1. 전역변수 
let clientsocket = null;// 웹소켓 선언 
console.log(mid)
//2.만약에 로그인이 되어 있는경우에만 소켓 사용 
if (mid !== 'null') { // 로그인이 되어있으면 
	// JS  지원하는 웹소켓 클래스 [ new WebSocket ("ws://ip:potr/프로젝트/서버소켓엔드포인트/"+변수) ] 
	clientsocket = new WebSocket("ws://localhost:8080/jspweb/chatting/" + mid);
	//3. 2번에서 구현된 메소드를 클라이언트소켓이 대입 
	clientsocket.onopen = function(e) { onopen(e) }
	clientsocket.onclose = function(e) { onclose(e) }
	clientsocket.onmessage = function(e) { onmessage(e) }
	clientsocket.onerror = function(e){onerrer(e)}
}else{// 로그인이 안되어있으면  
	alert('로그인이 필요합니다.');location.href ="../member/login.jsp";
}

// 자바스크립트 : F5 할때마다 [ 새로 열릴때마다 ] 메모리 초기화 

// 전송방식 : 1 .메시지 입력 상자에서 엔터를 눌렀을때  2. 메시지 입력 상자에서 엔터를 눌렀을때
//4.메시지 받을때
function onmessage(e) { //e : 서버소켓으로 부터 받은 정보가 담져있다
	//  e.data : 받은 정보의 메시지 
	let msg = JSON.parse(e.data) //JSON 형식만 가능 
	//1. 출력구역 호출
	//2.받은 메시지를 html 꾸미기
	let html =  '<div>'+
					'<span>'+mid+'   :   </span>'+
					'<span>'+msg.content+'</span>'+
					'<span> [ '+msg.date+' ] </span>'+
				'</div>';
document.querySelector('.contentbox').innerHTML+=html;
	//받은메시지를  html 에 저장 
}//받았을때	
function send() {

	//1. 보낼 데이터 객체 구성 
	let msg = {
		content :document.querySelector('.msgbox').value , //보낸 메시지 
		from : mid , // 보낸 사람 아이디
		date : new Date().toLocaleTimeString() // 보낸시간 
	}
						//JSON ---->문자열 변환  JSON.stringify()
						//문자열 ---->JSON 변환 JSON.parse( )
	clientsocket.send(JSON.stringify(msg)) // 해당 객체를 JSON형식으로 변환 ---->메시지 전송
	//전송후 입력상자 초기화
	document.querySelector('.msgbox').value='' // 전송 후 입력상자 초기화 
}//보내기할때

function enterkey( ){
	//엔터키를 눌렀을때
	if( window.event.keyCode == 13 ){ // window.event.keyCode : 키보드의 입력된 데이터를 숫자표현 [ 엔터 = 13 ]
		send()
	}
} 

 


//2. 메소드 구현 [ 1. 접속했을때 ,  2. 나갔을때 3.메시지보내기 4.메시지 받았을때]
function onopen(e) { alert('채팅방에 들어왔습니다.' + e) }
function onclose(e) { alert('채팅방을 나갔습니다.' + e) }
function onerror(e) { alert(e )}

