/*
		자료 	: 데이터 ( 정보/값 )
		자료형 : 데이터 타입
			1. 숫자 number 2. 문자열 string 3. 불 boolean
  	
			1. 
				숫자 : 소수점이 있는 숫자와 없는 숫자를 모두 같은 자료형
		  		숫자 연산자 : +더하기 -빼기 *곱하기 /나누기 %나누기(나머지)
			
			2. 
				문자열 : ' ' 혹은 " "
				문자열 연결 연산자 : + 
				문자열 길이 : 문자열.length
			3.
				불 : boolean = true/false 만 저장 가능 
				불 연산자  : == 같다 != 같지않다 >초과 <미만 >=이상 <=이하
				논리 연산자 :&& ||
			자료형 검사 : typeof( 데이터 ) : 해당 데이터의 자료형 확인 
			
			- 연산자
				1. 산술연산자 + - * /나누기 %나누기(나머지)
				2. 비교연산자 > < >= <= === !=
				3. 논리연산자 && || !부정
				4. 대입연산자 = 대입 += 더한후 대입 -=빼기후 대입 *= 곱한후 대입 /=나누고 대입 %=나누고 나머지 대입
				5. 증감연산자 
			
			
			-자료형 변환
			Number(데이터) : 숫자형 변환
			String(데이터) : 문자열형 변환
			Boolean(데이터) : 불 형 변환 
			
			- 입력     	메시지 : prompt ('메시지');
			- 확인/취소  	메시지 : confirm('메시지')
			
			
 */
console.log("가나다라");	// " " 자바와 동일 
console.log('가나다라');
console.log("가나" + "다라");// + 자바와 동일 
console.log("가나다라".length);// + 자바와 동일
console.log(273);
console.log(273.726);
/*
	상수 : 고정된 값 [ 항상 같은 수 ] const
	변수 : 변하는 값 [ 변할 수 있는 수 ] let
	undefined VS null
*/
const pi=3.141592 // 상수 선언
console.log(pi);
//pi=4.14 ;// 상수는 변경 불가 [ java : final static ]

 	/*변수를 생성할 수 있는 키워드로 var 키워드도 있다 . 과거의 자바스크립트에서 사용하던 키워드 var키워드는 변수를 
	중박해서 선언할수 있다는 위험성 , 변수가 속하는 범위가 애매하다는 이유로 let 키워드가 등장하면서 대체 p.107 */
	
let pi2 = 3.141592;
console.log(pi2);
pi2 = 4.14;


/*
문제1 : 지폐 세기
	조건 :금액 입력받아 
	출력 :출력에 십만원 3장 만원2장  천춴 1장  백원 개
*/

let money =Number(prompt("금액을 입력하세요"))

console.log("입력받은 금액 :" +money);
let 십만원 = parseInt(money/100000); //parseInt( 숫자 ) : 정수로 반환 
console.log('십만원 :'+십만원+"장");
money-= 십만원*10000;
let 만원 = parseInt(money/10000);
console.log("만원 :"+만원+"장");
money-=만원*10000;
let 천원 = parseInt(money/1000);
console.log("천원 :"+천원+"장");
money-=천원*1000
let 백원 = parseInt(money/100);
console.log("백원 :"+백원+"개")


//
let 정수1 = Number(prompt("정수1 :"))
console.log("홀수 여부 :"+(정수1%2==1))
//
let 정수2 = Number(prompt("정수2 :"))
console.log("홀수 여부 :"+(정수2%7==0)) 







