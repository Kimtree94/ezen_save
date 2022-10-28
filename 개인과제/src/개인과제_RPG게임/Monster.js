
// 몬스터 객체 생성_221024   
let mon0 = {
   name: "",
   hp: 300,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon02.png" id="mon">',
   grade: 1   // 등급
}
let mon1 = {
   name: "독수리",
   hp: 350,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon03.png" id="mon">',
   grade: 1   // 등급
}
let mon2 = {
   name: "독수리",
   hp: 400,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon04.png" id="mon">',
   grade: 1   // 등급
}

let mon3 = {
   name: "독수리",
   hp: 450,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon05.png" id="mon">',
   grade: 2   // 등급
}

let mon4 = {
   name: "독수리",
   hp: 500,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon06.png" id="mon">',
   grade: 2   // 등급
}

let mon5 = {
   name: "독수리",
   hp: 550,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon07.png" id="mon">',
   grade: 2   // 등급
}

let mon6 = {
   name: "독수리",
   hp: 600,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon08.png" id="mon">',
   grade: 3   // 등급
}

let mon7 = {
   name: "독수리",
   hp: 650,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon09.png" id="mon">',
   grade: 3   // 등급
}

let mon8 = {
   name: "독수리",
   hp: 700,
   power: 20,
   imgHTML: '<img alt="" src="../IMG/mon10.png" id="mon">',
   grade: 3   // 등급
}



// 몬스터 객체를 배열에 담기_221024
let monster_list = [];
monster_list.push(mon0, mon1, mon2, mon3, mon4, mon5, mon6, mon7, mon8);


let max_X = [10, 5];

function m_attack() {   // 유저를 때리는 함수

   const print = () => {

      // 좌표 랜덤 변수 생성
      const rand = Math.floor(Math.random() * 20);
      // console.log("rand : " + rand)
      // console.log("rand1 : " + rand1)

   }
   print()
} // monster e


let a = 0;

let mon_move = setInterval(() => { // 몬스터 0.5초마다 움직이기

   // 몬스터 이미지 불러오기
   let mon = document.querySelector("#mon")

   // 이미지에 앱솔루트 속성주기
   mon.style.position = 'absolute'

	// 좌표 랜덤 변수 생성
	const rand = Math.floor(Math.random() * 20)
   	
	// 좌표 배열을 만들고 랜덤 변수를 담아주기
	
	a = rand;
   
   const print = () => {
      
      mon.style.left = `${a * rand}px`
      if (a >= 17 && a <= 20) {
         document.querySelector('#alarm').innerHTML = "떄린다???"
      }
      else { document.querySelector('#alarm').innerHTML = ' ';}

      if (a == 17) {// rand 의 값이 19나 13이 나올 경우
         let u_hp_now = u_count;                     // s 버튼 누르기 전 현재 피를 변수에 대입해서 저장

         if (defense == true) {                     // s 버튼을 누르고 있을 경우 [ true ]
            let u_hp = document.querySelector("#u_hp");   // 유저 체력바 불러오기

            u_count = u_hp_now;                   // s 버튼을 누르기 전 피 상태를 현재 피에 대입
            u_hp.style.width = u_count + 'px';         // 출력

         }
         else {                                 // s 버튼을 누르지 않을 경우
            u_count -= rand;                      // 랜덤으로 유저 체력 깍기
            u_hp.style.width = u_count + 'px';         // 출력
         }
      } // if e
   }

   m_attack() // 몬스터 공격
   print()


},0.7 * 1000); // setInterval e


let m_count = 300;



function monster_hp(stage) {
   document.querySelector(".m_img").innerHTML = monster_list[stage].imgHTML // i번째 몬스터로 이미지 변경
   m_count = 300; // 피 초기화
   m_hp.style.width = m_count + 'px'; // 초기화된 피 게이지로 표시




} // monster_hp e
