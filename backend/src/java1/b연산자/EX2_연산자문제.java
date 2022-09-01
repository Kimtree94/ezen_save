package java1.b연산자;

import java.util.Scanner;

public class EX2_연산자문제 {//class s
	public static void main(String[] args) {//main s
		/*
		문제1 : 급여 계산 
			[조건] 입력받기 : 기본급 , 수당 
			[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
	 */
	Scanner scanner = new Scanner(System.in);	
		
			
			
			System.out.print("문제1) 기본급 :"); int 기본급 = scanner.nextInt();
			System.out.print("문제1) 수당 :"); int 수당 =scanner.nextInt();
			int 실수령액 =기본급+수당-(int)(기본급*0.1);
								//강제 형 변환 :double ->int
			System.out.println("실수령액:"+실수령액);
			
	/*
	 	문제2 : 지폐 개수 세기 
	 		[조건] 십만원 단위의 금액을 입력받기 
	 		[출력] 입력받은 금액의 지폐수 출력 
	 		[예시]  356789
	 			십만원 : 3장 
				만원 : 5장 
				천원 : 6장
	 */										 
			System.out.print("문제2) 금액:");  
			int 금액; //변수 자료형???1.논리 2.정수 3.실수 4.문자열
			금액=scanner.nextInt();//입력받은 데이터를 정수형으로 가져와서 변수에 대입
			//1.십만원 계산
			System.out.println("십만원 :"+(금액/100000)+"장");
					금액-=(금액/100000)*100000;	//십만원권 단위 제거해야함
			System.out.println("만원 :"+(금액/10000)+"장");
				    금액-=(금액/10000)*10000;
			System.out.println("천원 :"+(금액/1000)+"장");
				
		
	/*
	 	문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
	 */	
		System.out.println("문제3)7의 배수");
		int 배수;
		배수=scanner.nextInt();
		System.out.println("입력하신 수는:"+ (배수%7==0 ? "배수" : "배수아님" ));
		
	 	/*
	 	문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
	 	*/
		System.out.println("문제4)홀짝?");
		int 홀짝;
		홀짝=scanner.nextInt();
		System.out.println("입력하신 수는:"+(홀짝%2==0?"짝수":"홀수"));
		/*
	 	문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓' 
	    */
		System.out.println("문제5)7의 배수 홀/짝?");
		int 배수2;
		배수2=scanner.nextInt();
		System.out.println("입력하신수는 :"+(배수2%7==0&&배수2%2==0?"참":"거짓"));
		/*
	 	문제6 : 두개의 정수를 입력받아 더 큰수 출력
	 	*/
		System.out.println("문제6)더 큰수는");
		int 큰수; int 큰수2;
		큰수=scanner.nextInt();
		큰수2=scanner.nextInt();
		System.out.println("더 큰수는:"+(큰수>큰수2?큰수:큰수2));
	 	 /*
	 	문제7 : 반지름을 입력받아 원 넓이 출력하기 
	 		// 원 넓이 공식 = 반지름 * 반지름 * 원주율[3.14]
	 	*/
		System.out.println("문제7)반지름 입력:");
		int 반지름;
		반지름=scanner.nextInt();
		System.out.println("원넓이는:"+(반지름*반지름*3.14));
		/*
	 	문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
	 		// 예) 54.5     84.3  입력했으면    64.285714% 출력 
	    */
		System.out.println("문제8)몇%");
		double 실수1;   double 실수2;
		실수1=scanner.nextDouble();
		실수2=scanner.nextDouble();
		System.out.println("앞의값의 뒤의값% :"+(실수1%실수2*100)+"%");
				
		/*
	 	문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ] 
	 		// 사다리꼴 계산식 -> ( 윗변 * 밑변 ) * 높이 / 2 
	 	*/
		System.out.println("문제9)사다리꼴의 넓이는");
		int 윗변; int 밑변; int 높이;
		윗변=scanner.nextInt();
		밑변=scanner.nextInt();
		높이=scanner.nextInt();
		System.out.println("넓이는 :"+(윗변*밑변)*높이/2);
		/*
	 	문제10: 키를 정수를 입력받아 표준체중 출력하기
			//표준체중 계산식 = > (키 - 100) * 0.9
	    */
		System.out.println("문제10)표준체중 :");
		double 키; 
		키=scanner.nextDouble();
		System.out.println("표준체중 : "+(키-100)*0.9);		
		
		
		/*
		문제11 : 키와 몸무게를 입력받아 BMI 출력하기
			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		*/
		System.out.println("문제11)Bmi");
		double 키2; double 몸무게;
		키2=scanner.nextDouble();
		몸무게=scanner.nextDouble();
		System.out.println("BMI는 :"+몸무게/((키/100)*(키/100)));
		/*
	 	문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
	 	*/
		System.out.println("문제11)inch->cm");
		double 인치;
		인치=scanner.nextDouble();
		System.out.println("cm :"+인치*2.54);
		/*
	 	문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
		*/
		System.out.println("문제13)점수는");
		float 중간; float 기말; float 수행;
		중간=scanner.nextFloat();
		기말=scanner.nextFloat();
		수행=scanner.nextFloat();
		System.out.println("점수는:"+(중간*0.7)+(기말*0.7)+(수행*0.6));
		
		/*
		문제14 :  연산 순서 나열 하고 x와 y값 예측하기
 				//int x = 10;
				//int y = x-- + 5 + --x;
				//printf(" x의 값 : %d , y의값 :  %d ", x, y)
	     */
		
		
	}//main e
}//class e
