/**
 * 
 */
 
 //p.320
 //1.JS <h1>태그 생성 -> 객체 대입
 const header = document.createElement('h1')
 
 //2.객체 텍스트 조작
 header.textContent = 'js에서 만든 태그'
 header.style.color = 'white'
 header.style.backgroundColor ='black'
 //3.해당 태그에 하위태그로 객체를 추가 
 document.body.appendChild(header)
 
 //p.321
 		//1.해당 id의 태그 객체 가져오기
 const divA = document.querySelector('#first')
 const divB = document.querySelector('#second')
 
 const h1 = document.createElement('h1') //2. 태그(요소)만들기
 h1.textContent='이동하는 h1 태그'//3.js만든 태그(요소)에 텍스트 넣기 
 
 const toFrist = () =>{
	divA.appendChild(h1) //4.첫번째 div에 js만든 태그 추가
	setTimeout(toSecond,2000)//5. 1초뒤에 다른 함수 [toSecond] 실행
}
 
 const toSecond = ( ) =>{
	divB.appendChild(h1)
	setTimeout(toFrist,2000)
}
 
 
toFrist()// 5.함수 실행 
 
/* //1. 기본 함수   **함수의 기본형태
	 function 함수(){
		divB.appendChild(divA)
	}
	 //2. 익명 함수	**
	 const 익명함수 = function(){	divB.appendChild(divA) }
	 
	 //3. 화살표 함수
	 const 화살표함수 = () =>{	divB.appendChild(divA)}
	
	 //4. 콜백 함수
	// 함수(  함수( ),  )
	
	
	
	//3. 타이머함수( 함수( ), 밀리초(1000/1초) )
	setTimeout(함수,3000)  */
	
	
//p.322 객체 제거

const h2 = document.querySelector('h2')

//1. 타이머 함수 :setTimeout (함수,밀리초)
//2. 문서객체.removechild(자식객체)
//3. 부모객체찾기 : 문서객체.parentNode (문서객체 )


//1. 1회용이면서 콜백함수(foreach,setTimeout)를 쓰는 
setTimeout(() => {
	
	h2.parentNode.removeChild(h2)
	
} ,3000 )//3초후 실행되는 코드

//2.  재활용이 가능함 
const 익명함수 = () => {	h2.parentNode.removeChild(h2) }
setTimeout(익명함수,3000)

//3.  재활용이 가능함
function 함수(){
	//h2.parentNode.removeChild(h2)
	document.body.removeChild(h2)
}
setTimeout( 함수 , 3000 )
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	