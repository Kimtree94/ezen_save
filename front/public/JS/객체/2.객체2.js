/*



				p.249
				자바스크립트 데이터 를 저장하는 방법
					1. 변수/상수
					2. 배열
					*.함수 : 1.매개변수 2. 미리저의코드 3. 리턴값
						 1. 일반함수 : function 함수명(매개변수~){ 코드 return 리턴값}
						 2. 익명함수 : function( ){ }
						 3.[콜백함수] 화살표 함수 : (매개변수)=>리턴값 
						 4.[객체메소드] : 함수명( ){ }
					3. 객체
					
					let/const 객체명 ={
						 키:값,
						 키2:값2,
						 키3:값3
						 키4: function(){}
						  }





 */
const pet = {
	name: '구름',
	eat: function(food) {
		alert(this.name + '은/는' + food + '을/를 먹습니다')
		//this : 자신이 가진 속성
		//객체내부 this.키 vs 객체외부 객체명.키
	}//함수end
}//객체end

//2.객체내 메소드 호출[객체내 속성/메소드 호출할때 : 객체명.키 ]
pet.eat('밥')


//p.250

const student = {} //비어 있는 객체
//2.기존에 없는 키 접근 -> 새로운 속성 부여
student.이름 = '윤인성'
student.취미 = '악기'
student.장래희망 = '생명공학자'
//3. 객체 확인
console.log(student)

//p.250 속성 제거
//1. 객체내 속성 제거[delete 객체명.키]
delete student.장래희망

console.log(student)

//p.251

const pet2 = {
	name: '구름' ,
	eat(food) {
		alert(this.name + '은/는' + food + '을/를 먹습니다.')
	}
}






















