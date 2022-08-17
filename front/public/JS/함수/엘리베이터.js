/*
let my_floors =[]
let el_floors =[]


function my_floors(){
	//난수생성[1~45]
	while(true) {// 무한루프[ 추첨번호가 6개 되면 종료]
	 											//	Math.random() 0~1사이의 실수 생성
	 let index= my_floors.indexOf(rand)
	 let rand =	Math.floor((Math.random()*10)+1)// (Math.random()*끝값)
	 if(index == -1){//존재하지 않으면
		if(lotto_numbers.length==1){//배열내 수가 6개 이면 반복문 종료
			break//반복문 탈출
		} end
		}//if end
	}//while end
	//html 태그에 배열 출력
	document.getElementById('E/lbox').innerHTML=my_floors
	//결과 함수 출력
	
}

 let my_floors=[]// 내가 있는 층
 let el_floors=[]//엘리베이터가 있는 층 
 //1. 버튼 만들기 함수
 function btn_print(){
	let btnlist='' //1개의 버튼을 저장하는 수
	for(let i=1; i=10;i++){
		//i는 1부터 10까지 1씩증가 반복
		btnlist+= `<button id=${i} onclick=btn_click(${i})>${i}</button>`
		//i 가 5배수이면 줄바꿈
		if(i%5==0){btnlist+='<br>'}
	}//for end
	//현재문서의 btnbox 라는 id 갖는 태그 호출해서 html변수 대입
	document.getElementById('btnbox').innerHTML = btnlist;
}
*/














/*function my_floor(){
	for(let i=1;i=10;i++){
		if()
	}
}*/