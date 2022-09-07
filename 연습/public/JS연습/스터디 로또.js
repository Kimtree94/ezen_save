

let myn=[]


function creat(){
	let game=''
	for(let i=1;i<=46;i++){
     game+=`<button id=${i} onclick=gameboard(${i})>${i}</button>`
	if(i%5==0){
	game+=`<br>`
	}
  }
  document.getElementById('gameboard').innerHTML=game 
  }
 console.log(myn)
const box=document.querySelector('#money_Number')

function click(i){
	let click=myn.indexOf(i)
	if(click>0){
		alert('이미 선택한 번호입니다.')
	}
		
	
}