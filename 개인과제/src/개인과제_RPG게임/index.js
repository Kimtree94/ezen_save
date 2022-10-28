// 유저 이미지 불러오기
const user = document.querySelector(".u_img")

// 이미지에 앱솔루트 속성주기
user.style.position = 'absolute'

// 캐릭터가 화면에서 나가지 못하도록 좌표 제한
let maxX = [ -35 , 10 ];	// 왼쪽, 오른쪽 

// 캐릭터의 위치를 표시
let [x, y] = [0, 0] ;

const block = 20

let lv = 1;//10/21 경험치 추가
let exp = 0;//10/21 경험치 추가
// 화면에 움직임 출력하는 함수
const print = () => {
	
	user.style.left = `${x * block}px`
	user.style.top = `${y * block}px`
}

print()

	
// 왼쪽 방향 키
let left_key = false;

// 오른쪽 방향 키
let right_key = false;

// 공격 키 A
let attack = false;

// 방어 키 S
let defense = false;

// 키 다운 이벤트
document.addEventListener("keydown", key_down, false );

// 키 업 이벤트
document.addEventListener("keyup", key_up, false );


// 키 다운을 했을 경우 false -> true로 변경
function key_down( event ){
		
	if( event.keyCode == 37 ){		// 왼쪽 방향 키
		left_key = true;			// 왼쪽 방향 키를 누를 경우 상태를 true로 변경
		
		// 위치 제한 왼쪽 -5, 오른쪽 10까지만 움직이도록
		if( maxX[0] >= x  ){		// 만약에 maxX의 0번째 인덱스 [-5]가 x보다 같거나 클경우
			x = maxX[0];				// x에 -5 대입 : -5까지만 갈 수 있도록 제한준 것 
		}else{						// maxX의 0번째 인덱스 [-5]가 x보다 같거나 크지 않다면
			x -= 1					// x에 -1 누적 대입 : 왼쪽으로 움직일 수 있음
		}
	} // 왼쪽 방향 키 이벤트 종료
	else if( event.keyCode == 39 ){ // 오른쪽 방향 키
		right_key = true;			// 왼쪽 방향 키를 누를 경우 상태를 true로 변경

		if ( maxX[1] <= x ){
			x = maxX[1];
		}else{
			x += 1
		}
	} // 오른쪽 방향 키 이벤트 종료
	else if( event.keyCode == 65 ){ // 공격 키 A
		attack = true;				// 공격 키 A를 누를 경우 상태를 true로 변경
		document.querySelector(".u_img").innerHTML = '<img alt="" src="../IMG/user_attack.png" id="use">'	// 공격 자세로 이미지 변경
		a_key()
		console.log("attack : " +attack)
} // A 키 이벤트 종료
	else if( event.keyCode == 83 ){ // 방어 키 S
		defense = true;				// 공격 키 S를 누를 경우 상태를 true로 변경
		document.querySelector(".u_img").innerHTML = '<img alt="" src="../IMG/user_defense.png" id="use">' // 방어 자세로 이미지 변경
		// s_key()
	} // S 키 이벤트 종료
	
	print() // 화면에 움직임 출력
	
} // key_down e


// 키 업을 했을 경우 true -> false로 변경
function key_up( event ){
		
	if( event.keyCode == 37 ){	// 왼쪽 방향 키
		left_key = false;

	}
	else if( event.keyCode == 39 ){ // 오른쪽 방향 키
		right_key = false;
			
	}
	else if( event.keyCode == 65 ){ // 공격 키 A
		attack = false;
		document.querySelector(".u_img").innerHTML = '<img alt="" src="../IMG/user.png" id="use">'
	}
	else if( event.keyCode == 83 ){ // 방어 키 S
		defense = false;
		document.querySelector(".u_img").innerHTML = '<img alt="" src="../IMG/user.png" id="use">'
	}
	
	print() // 화면에 움직임 출력
	
} // key_up e


	

let u_count = 300;	// 유저 체력 변화 주는 변수
let stage = 0; // 몬스터 출력 순서 변수

// a키[공격] 함수 
function a_key(){

	const u_attack = Math.floor(Math.random() *(50 - 20))+20;	// 랜덤으로 공격 숫자를 출력	
	
	console.log('두 거리 계산 : '+ (a-x) )
	
	if( (a-x) >= 23 && (a-x) <= 30 ){ 
		m_count -= u_attack;				// 유저 공격력으로 몬스터 피 누적 빼기
		m_hp.style.width = m_count + 'px';	// 몬스터 체력 게이지 표시
		console.log("m_count11 : "+ m_count)
	}
	

	if( m_count <= 0 ){
		monster_hp(stage);
		stage++;	
		
		exp += 100;	//10/21 경험치 추가
	
		if( exp > 300 ){ // 경험치가 300이상이면
			lv++;		 // 레벨업
			alert("레벨업!!! LV : "+lv);
			exp	= 0;	 // 소유 경험치 초기화
		}//10/21 경험치 추가
			
		let u_exp = document.querySelector("#u_exp"); // 경험치 게이지 표시
		u_exp.style.width = exp + 'px'; // 경험치게이지 출력
		alert("경험치"+exp)//10/21 경험치 추가	
	} // if e	
} // a_key e


