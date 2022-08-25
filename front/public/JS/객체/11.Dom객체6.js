/**


	1.DOM: 문서 객체 모델 [미리 만들어진 객체 / 메소드]
		
		* 식별자 [ju , css 동일]
			tag , class[ . ] ,id [ #]
		
		
		
		1.HTML에 있는 요소를 객체로 호출 
			1. querySeletor('식별자명')
			2. querySeletorAll('식별자명')
		1.문서객체.addEventListener('이벤트명' , () {} 또는 함수 또는 ( ) => { })
			1.'click' : 해당 객체를 클릭했을때 함수 실행 
			2.'keyup' : 해당 객체에서 키[키보드]가 떨어질때 함수 실행
		
 */
 
 //p.331
 	//1. HTML 태그를 문서 객체로 가져와 객체화시킴

	
 const textarea = document.querySelector('textarea')
 const h1 = document.querySelector('h1')
 
 textarea.addEventListener('keyup',(event) =>{
	const length = textarea.value.length
	h1.textContent=`글자수 :${length}`
	
  })

textarea.onkeyup = () => { }



function 글자수(){
	const 길이 =textarea.value.length
	h1.textContent =`글자 수 : ${길이}`
}

//p.333

	//HTML 이벤트 속성 [event]
	//keyup 이벤트 -> 속성 인수 전달[.altKey, .ctrlKey ,.shiftKey 등등]
const h2 = document.querySelector('h2')
const print = (event) => {
	
	let output=''
	output += `alt : ${event.altKey}<br>`
	output += `crtl : ${event.ctrlKey}<br>`
	output += `shift: ${event.shiftKey}<br>`
	output += `code : ${typeof(event.code) != 'undefined'?
	event.code : event.keyCode}<br>`
	
	h2.innerHTML = output
}

document.addEventListener('keyup',print)







































