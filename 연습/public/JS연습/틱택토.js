let 게임판=''
function 게임판생성(){
	for(let i=0;i<9;i++){
	
	게임판+=`<button>${i}</button>`
		document.getElementById('버튼생성')
		if(i%3==2){게임판+=`<br>`}
	}
	document.getElementById('game').innerHTML=게임판
}



		