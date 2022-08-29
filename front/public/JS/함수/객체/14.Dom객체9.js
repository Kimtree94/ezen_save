/*
	contextmenu : 오른쪽 마우스[메뉴]를 클릭했을때 이벤트


 */



/*------------------------------------------------------------------------- */


//p.350
//1.모든 사진들의 요소 호출
const imgs = document.querySelectorAll('img')
		//배열[객체] = ??????? ALL --> 여러개를 저장하는것? =>배열 (인덱스)
//2.
for(let i =0;i<imgs.length;i++){
	imgs[i].addEventListener('contextmenu' , (event) => {
		event.preventDefault()
		
	})
}
//3.
for(let i in imgs){	//마지막 인덱스를 제외해줘야 오류 안남 
	if(i.length-1==i){break}
	imgs[i].addEventListener('contextmenu' , (event) => {
		event.preventDefault()
		
	})
}
//4.
for(let i of imgs){
	i.addEventListener('contextmenu' , (event) => {
		event.preventDefault()
	})
}
//5.
imgs.forEach( (img) => {
	img.addEventListener('contextmenu' , (event) => {
		event.preventDefault()
})
})

/*------------------------------------------------------------------------- */

//p.351
let 상태 = false  //체크박스의 체크 여부 확인 변수 [만약에 체크이면 true ,아니면 false]
//html요소 가져오기
const checkbox = document.querySelector('input')
// 체크박스 에서 체크가 변경이 있을때 이벤트 실행
checkbox.addEventListener('change' , (event) => {
		상태=event.currentTarget.checked
		//status = checkbox.checked  이것도 가능
})

const link = document.querySelector('a')
link.addEventListener('click' ,(event) =>{
	if( !상태 ){// !논리반대:true ->false //false - > true
//	if(status==false)
// 	if(status!=true)
		//만약에 상태가 false 이면 [체크가 안되어 있으면]
		event.preventDefault()	
		
	}
	
})






































