package java1.ch1변수;		// 패키지 명

/*----------------------------------------------------------*/
//1. 클래스 선언 [모든 코드는 클래스에서 작성된다]
public class EX1_변수 {	//class start

	//자동완성 [ ctrl + 스페이스바]
	//2.main메소드 작성 [main+자동완성]
		//main함수 : 코드를 읽어주는 함수
	public static void main(String[] args) {//main start
		
		//p.48
		//변수 : 변하는 수 [ 데이터 1 개 저장 가능한 메모리 ]
		//p.52
		int value; //변수의 선언 [자료형 변수명;] **끝에 ; 붙이기!!**
		//System.out.println(value);  //console 출력 함수 [js의 consol.log와 같다]
		//변수에 값이 없기에 오류가 발생 즉 (초기화 초기값이 없기때문)
		value =10; //변수에 값 대입
		System.out.println(value);
		
		int result = value+10;
		System.out.println(result);
		
		//p.53
		 int hour= 3; //변서 선언과 동시에 값 대입 [초기화 = 처음 초기값을 넣어준다.]
		 int minute = 5;
		 System.out.println(hour+"시간"+minute+"분");	//js : console.log (`${변수명}`)
		 		//+ 연산자
		 			//1. 연결 연산자 : 변수+ "문자열"+변수+"문자열"
		 			//2. 더하기 연산자 : 변수[숫자]+변수[숫자]
		 
		 int totalMinyte = (hour*60)+minute;		//+ 더하기 연산자
		 System.out.println("총 :" + totalMinyte);	//+ 연결 연산자
		
		 //p.53 변수값 교환 
		 int x =3;
		 int y =5;
		 System.out.println("x :"+x+" ,y :"+y);
		 		//컴퓨터는 동시처리 X 코드는 순서대로[순서도 /알고리즘]하나씩 처리한다.
		 	//[문제발생]
		 	//x = y;//x=5 y=5
		 	//y = x;//x=5 y=5
		 //임시보관[문제 해결 = 임시 변수 생성]
		 int temp = x;
		 x = y;
		 y = temp;
		 System.out.println("x :"+x+" ,y :"+y);
		 
		 
		 
	}//main end
}//class end

/*----------------------------------------------------------*/

/*		
 	변수 선언
 		1.자료형 [ 변수의 크기]	create역할 만들때 쓰는것
		2.변수명 [ 변수의 이름]   --------번역--------->메모리 주소 찾아가기
		3.값[변수에 들어있는 데이터]
		
		int value =10
		[1]  [2]   [3]
  	  자료형   변수명  = 데이터
  	 
  	변수 호출
  		변수명
  	
컴퓨터 [ 0 , 1 ]밖에 모름				본체 
										1.cpu			 	:제어 , 감독 , 제어 ,번역등
										2.주기억장치[ram]   	:저장[변수] :프로그램 실행시 [ 휘발성메모리 ]             
										3.보조기억장치[rom]	 	:.class 코드파일 [ 비휘발성 메모리] : DB
 																	
 																	메모리[Ram]
 																		[16진수 메모리 주소]
  
  
  
 */
 