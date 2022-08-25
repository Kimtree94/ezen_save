
/*
 	왼쪽 방향키 = 37 위쪽 방향키 = 38 	오른쪽 방향키 = 39	아래쪽 방향키 = 40
*/




/* 별의 초기 설정 */
const star = document.querySelector('h1') /*문서 객체 가져오기 */
star.style.position = 'absolute'   /*css조작 = 포지션 : 절대위치*/

//별의 이동을 출력하는 기능
let[ x, y ]=[ 0 , 0 ]	//키보드 이동 값
const block = 20  		// 이동단위

const print = ( ) =>{
	star.style.left = `${x*block}px`
	star.style.top = `${y*block}px`
}
print()

const  [left , up , right , down ] = [37 , 38 , 39 ,40]

document.body.addEventListener('keydown' , (event) => {
			//if : 논리제어 [ 경우의수가 정해져 있지 않는경우]
			//switch ( break ): 값 제어 [ 정해진 경우의 수]
	
		
		switch (event.keyCode){ // 대소문자 주의!
			case left :
				x-=1
				break
			case up :
				y-=1
				break
			case right :
				x +=1
				break
			case down : 
				y += 1
				break
			
		}//switch end
	print() // x와y변경후 함수 호출
	
})//키보드 이벤트 함수 end


//만약에 이벤트 키코드가 레트프일때 x-=실행

