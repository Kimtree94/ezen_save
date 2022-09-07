

let myn=[]


function creat(){
	let game=''
	for(let i=1;i<=45;i++){
     game+=`<button id=${i} onclick=gameboard(${i})>${i}</button>`
	if(i%5==0){
	game+=`<br>`
	}
  }
  document.getElementById('gameboard').innerHTML=game 
  }
 