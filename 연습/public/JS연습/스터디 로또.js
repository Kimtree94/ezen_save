
let game=''


function creat(){
	
	for(let i=1;i<=46;i++){
     game+=`<button id>${i}</button>`
	if(i%5==0){
	game+=`<br>`
	}
  }
  document.getElementById('gameboard').innerHTML=game }

function whle(){
let i=1	
while(i<=46){
	i++
	if(i<=46){
		break
	}

}
  document.getElementById('gameboard').innerHTML=game
}