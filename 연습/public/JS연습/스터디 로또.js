
let game=''


function creat(){
	for(let i=1;i<=46;i++){
	document.getElementById('gameboard').innerHTML=game
     game+=`<button id>${i}</button>`
	if(i%5==0){
	game+=`<br>`
	}
  }
}

