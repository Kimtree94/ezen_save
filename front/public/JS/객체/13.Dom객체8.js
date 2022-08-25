

/** [호출]
 	객체명.textContent
 	객체명.innerHTML
 	객체명.value : 입력상자 , 선택상자에 사용가능


	[저장=대입]
	
	객체명.textContent :값
 	객체명.innerHTML :값
 	객체명.value 	 :값




*/







//1.HTML요소 가져오기

const input =  document.querySelector('#inchbox')
const button =document.querySelector('#inchbtn')
const p = document.querySelector('#inchp')

//2. 버튼을 눌렀을때

button.addEventListener('click' , ()=>{
	
	
const inch =  Number(input.value)  // Number(문자) : 문자열을 숫자열로

//isNaN(데이터) : 인치가 숫자가 아니면  true / 숫자이면 false  <유효성 검사>
if(isNaN(inch)){// 입력값이 숫자가 아니면
	p.textContent = '숫자를 입력해 주세요'
	return
}
	//입력값이 숫자이면
	const cm = inch * 2.54
	p.textContent = `${cm}cm`
	
})

//p.341
//1. HTML 요소 가져오기
const emailbox = document.querySelector('#emailbox')
const emailp =document.querySelector('#emailp')

// 이메일 검증 확인 함수 생성[익명함수]
const isemail = (value) =>{
	return(value.indexOf('@') > 1) &&(value.split('@')[1].indexOf('.') > 1)
		   //입력데이터의 @가 있는지   이면서  입력데이터의 @ 뒤 문장에 
		   //								qweqwe@.naver.com
		   //									 @기준으로 자름 naver.com 잘림 ->naver.com뒤에 . 이있는지
	
}

//2.
function 함수(value){
	return(value.indexOf('@') > 1) &&(value.split('@')[1].indexOf('.') > 1)
}


//이메일 입력상자에서 키보드를 입력할때마다 이벤트 발생 
emailbox.addEventListener('keyup' ,(event) =>{
	//이메일 상자에서 입력된 데이터를 변수에 저장
	const value = event.currentTarget.value //event.currentTarget : 현재 이벤트 중인 객체 
	
	if( isemail(value)){
		p.style.color ='green'
		p.textContent =`이메일 형식입니다 : ${value}`
	}else{
		p.style.color = 'red'
		p.textContent =`이메일 형식이 아닙니다 : ${value}`
	}
	
	
})

/*
	배열명.indexOf('검색단어 나 찾고자 하는 검색 데이터 ') : 배열내 해당 데이터의 인덱스 번호 찾기
	뮨자열.indexOf('@') : 문저열내 @ 의 인덱스 번호 찾기
		만약에 0 보다 작으면 못찾았음 [인덱스란 : 저장 순서 번호 = 0번부터 시작]
	문자열.split('기준문자') : 문자열내 기준문자 기준으로 분리[자르기] -> 분리후 배열처럼 저장함
		예)
				문자열 = 유재석 / 강호동 / 신동엽 / 하하
				문자열.split(" / ")
				문자열.split("/")[0]  : 유재석 <자른거에 0 번째 인덱스>
				문자열.split("/")[3]  : 하하 <자른거에 3번째 인덱스>
 */



//p.343
const selectbox = document.querySelector('#selectbox')
const selectp = document.querySelector('#selectp')

//2. selectbox 의 데이터가 변경 될때마다 실행되는 이벤트 [ change ]
selectbox.addEventListener('change' , ( event ) => {
	
	//select 의  모든 option을 호출하는 방법 =[select객체.options] =배열
	const options = event.currentTarget.options
	//선택한목록번호 = options 중에서 [사용자] 선택된 번호 호출
	const index = event.currentTarget.options.selectedIndex
	//
	selectp.textContent=`선택 : ${options[index].textContent}`
	//						    옵션목록에서[ 선택한목록번호 ].텍스트 호출
})


//p.344
//selectbox2 의 데이터가 변경 되었을때 이벤트 발생
const selectbox2 = document.querySelector('#selectbox2')
const selectp2 = document.querySelector('#selectp2')

selectbox2.addEventListener('change', (event)=>{
		//옵션 목록 =selectbox2 의 모든 옵션들을 호출 
		const options = event.currentTarget.options
		const list =[]		//선택된 옵션들의 저장하는 배열 선언
		
		for(const option of options){
			//배열[옵션목록]중 하나씩 option대입 반복
			if(option.selected){//만약에 해당 옵션에 selected 속성[선택]
				//배열에 선택된 옵션의 텍스트를 추가
				list.push(option.textContent)
			}//if e
		}//for e
		
	selectp2.textContent=`선택 : ${list.join(',')}`
	//배열명.join('연결문자')
		//예시)  배열명.join('연결문자') : 배열내 모든 요소들을 연결문자 기준으로 하느ㅏ의 문자열로 변환
		//학생명 = ['유재석','강호동','신동엽']
		//학생명.join('<->')
		//유재석<->강호동<->신동엽
})
let 현재값 		// input에 입력된 데이터를 저장하는 변수
let 변환상수 = 10	// select 에서 선택된 단위별 값 저장하는 변수

//p.345
//0.HTML요소 가져오기
const inchbox2 =document.querySelector('#inputbox2')
const spanbox1 =document.querySelector('#spanbox1')
const selectbox3 =document.querySelector('#selectbox3')
//2.
const calculate = () => {
	// span에 계산된 결과를 출력 [ toFixed(2) : 소수점 표시 (소수점개수)]
	spanbox1.textContent=(현재값*변환상수).toFixed(2)
}

//3.select 상자의 데이터를 변경했을때 이벤트발생
selectbox3.addEventListener('change' , (event)=>{
	//1. 목록상자[currentTarget]에서 모든 option을 호출
	const options = event.currentTarget.options
	//2. 목록상자[currentTarget]에서 선택된 인덱스 번호를 호출
	const index = event.currentTarget.options.selectedIndex
	//3. 목록상자에서 선택된 인덱스 번호의 value값을 호출해서 변환상수에 대입
	변환상수 = Number(options[index].value)
	calculate() // 함수 ㅌㅇㄹㅊㄷㄱㄿㅎ쇼ㅠㅎ 실행
})
//1. input 입력할때마다 현재값 변수를 입력된 값으로 변환해주는 이벤트 실행
inputbox2.addEventListener('keyup',(event) =>{
	// * input 상자에 입력된 데이터 (value) 를 숫자형으로 변환후 현재값을 변수에 저장
	현재값 = Number(event.currentTarget.value)
	calculate()
})

//p.347
let timer = 0  // 타이머 시간(초) 저장하는 변수
let timerId = 0 //타이머 함수를 저장하는 변수/객체 [ setInterval 함수 ]

const timerinput = document.querySelector('#timerinput')
const timerspan=document.querySelector('#timerspan')
const itmerh1=document.querySelector('#itmerh1')
//1.체크박스의 상태가 변경되었을때 이벤트 실행
timerinput.addEventListener('change',(event) =>{
		//1. 체크박스의 checked 인지 확인
	 if(event.currentTarget.checked){ //체크되어있는상태
	 //setInterval (함수명 , 초 [밀리초=1000/1초])
		timerId = setInterval( ()=>{
			timer +=1 // 타이머 시간 변수 1씩 증가
			itmerh1.textContent=`${timer}초` //span태그에 변수 출력
		} , 1000)
	}else{//체크 안되어 있는 상태
		clearInterval(timerId) // 타이머 함수 종료[clearInterval(타이머객체)]
	}
	
})


//p.348~349
/* 
	tag  => 'tag'		 [복수] 	querySeletor('h1')
	class => '.class명'   [복수]	querySeletor('.h1class')
	id => '#id명'		 [단일] 	querySeletor('#h1id'
	name => '[name=name명]'[복수] querySeletor('[name=h1name]' java로 보낼때 많이 사용함
	
	<h1 id=" " class="" name "">
	*js
	querySeletor('h1')
	
*/
//1. HTML요소 가져오기

const radios = document.querySelectorAll('[name=pet]')
const output = document.querySelector('#output')

//2. radios[배열]반복문
	//배열명.forEach( (반복변수) => { } )
		//예) 배열명 동물목록 =[ 강아지 , 고양이 , 햄스터 , 기타 ]
		/*
			1.for(let i in 배열명) {}
				i =0 i =1 i=2 i=3
			2.for(let i of 동물목록){}
				i =강아지 i =고양이 i=햄스터 i=기타
			3.배열명.foreach( (i ,j ) = > { })
				i = 강이지  i=고양이  i=햄스터 i=기타
				j = 0     j= 1     j=2    j=3 
			
		*/
radios.forEach((radio)=>{
	
	radio.addEventListener('change',(event)=>{
		const current = event.currentTarget
		if(current.checked){
			output.textContent =`좋아하는 애완동물은 ${current.value}이시군요!`
		}// if end
	})//event end
})// foreach end




































































































