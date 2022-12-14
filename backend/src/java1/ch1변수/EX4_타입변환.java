package java1.ch1변수;

public class EX4_타입변환 {//class s
	public static void main(String[] args) {//main s
		
		//p.72
		byte 바이트변수= 10;
		int 인트변수=바이트변수; //int변수에 byte 대입 가능 => 자동 타입 변환
		//byte 바이트변수2=인트변수; // byte를 int에 대입 불가능  ==> 강제로 라도 변화해보자!!:강제타입변환
		byte 바이트변수3 = (byte)인트변수;//강제 타입 변환 [(자료형/클래스)변수/객체]
		
	}//main e
}//class e

/*
	
	타입변환 = 자료형 변환 = 변수의 상자 [크기] 변환
		1.자동 타입 변환 [ 작은 자료형에서 큰 자료형으로는 자동으로 문제없이 대입]ex)4byte->8byte 가능!
			**byte -> short -> int -> long -> float -> double  
			- 
		2.강제 타입 변환 [ 큰 자료형에서 작은 자료형으로 옮기는건 가능하나]ex)8byte -> 4byte 가능하나 손실이 발생!
 			**데이터 손실이 발생				
 			- (자료형)변수명  => 강제 타입 변환 변수명 앞에 소괄호()넣고 그안에 (byte)넣어줌
 			
 		3.연산시 타입 변환
 			1.[정수]int 보다 작은 수 끼리 연산시 -> 연산결과 int형
 			2.[실수] 끼리 연산시 => 연산결과는 double형으로 나옴
 			
 		4.문자열을 기본타입으로 변환시키는애들
 			Integer.parseInt(문자열)을 사용하면 -> 숫자로로 바뀜
 				//주의할점은 a 같은 것을 바꾸는것은 불가능 //"10[문자열]"->10[정수열]으로 가능
 		
 */	
