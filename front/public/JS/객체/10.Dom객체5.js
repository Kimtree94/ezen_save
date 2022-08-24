/**
 * 
 */

let counter = 0 //클릭수를 저장하는 변수
let isConnect = false // 연결 상태 저장하는 변수 

//요소 객체들
const h1 = document.querySelector('h1') //태그 요소를 스크립트로 가져오기
const p = document.querySelector('p') //태그 요소를 스크립트로 가져오기
const connectBtn = document.querySelector('#connect') //태그 요소를 스크립트로 가져오기
const disconnectBtn = document.querySelector('#disconnect') //태그 요소를 스크립트로 가져오기
const up_connect = document.querySelector('#up_connect')
const down_connect = document.querySelector('#down_connect')
// 카운터를 출력하는 함수 
const listener = () => {
	++counter
	h1.textContent = `클릭횟수 : ${counter}`
}

const down = () => {
	--counter
	h1.textContent = `클릭횟수 : ${counter}`
}
//1.연결 버튼을 클릭 했을때
connectBtn.addEventListener('click',() =>{ 
if(isConnect===false){
	//만약에 연결이 안되어 있으면
	h1.addEventListener('click' , listener)//h1태그에 클릭 이벤트 추가
	p.textContent='이벤트 연결 상태: 연결'//p태그에 내용 넣기
	isConnect = true //연결 했다는 의미로 연결상태 변수에 true값으로 변환시킴
}
	
})


//2.연결해제 버튼을 클릭 했을때
disconnectBtn.addEventListener('click',() =>{
	if(isConnect== true){//만약 연결이 되어있으면
		h1.removeEventListener('click', listener)//h1태그에 클릭 이벤트 제거	
		p.textContent='이벤트 연결 상태 : 해제'
		isConnect = false
	}
 })
//증가 눌렀을때 증가
up_connect.addEventListener('click',() =>{
	if(isConnect==true){
		
		up_connect.addEventListener('click' ,listener)
	}
	
})

//감소 눌렀을때
down_connect.addEventListener('click',() =>{
	if(isConnect==true){
		
		down_connect.addEventListener('click', down)
	}
	
})


//객체명.addEventListener('이벤트명',콜백함수)
//해당 객체의 이벤트 발생했을때 콜백함수 실행
/*
h1.addEventListener('click', (event) => {
//변수에1증가
	h1.textContent = `클릭횟수 : ${counter++}`
})//이벤트 함수 end



/*
//.2번째 함수사용방법
h1.addEventListener('click', 함수)

function 함수(){
   counter++
   h1.textContent = `클릭횟수 : ${counter}`
}


//2.html에서 클릭이벤트 속성을 이용한다. (onclick)
function 함수(){
   counter++
   h1.textContent = `클릭횟수 : ${counter}`
}
*/