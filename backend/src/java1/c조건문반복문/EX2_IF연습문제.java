	package java1.c조건문반복문;
	
	import java.util.Scanner;
	
	public class EX2_IF연습문제 {//class s
		
	public static void main(String[] args) {//main s
		Scanner scanner=new Scanner(System.in);
		// 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 
		//문제1 : 2개의 정수를 입력받아서 더 큰수 출력 [ 경우의수 : 3개(크다,작다,같다==그외)]
		System.out.println("문1 :");int 정수1=scanner.nextInt();
		System.out.println("문1 :");int 정수2=scanner.nextInt();
		if(정수1>정수2) {System.out.println("결과1 :"+ 정수1);}
		else if(정수1<정수2) {System.out.println("결과1 :"+ 정수2);}
		else if(정수1==정수2) {System.out.println("결과1 : 두 수는 같다");}
		// 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
		//문제2
		System.out.print("문2 :");int 정수3=scanner.nextInt();
		System.out.print("문2 :");int 정수4=scanner.nextInt();
		System.out.print("문2 :");int 정수5=scanner.nextInt();
		
		int max = 정수3; // 첫 데이터를 가장 큰수로 지정
		if(max<정수4) {max=정수4;}// 두번째 데이터가 max보다 크면 max에 두번째 데이터를 넣기
		if(max<정수5) {max=정수5;}// 세번째 데이터가 max보다 크면 max에 세번째 데이터를 넣기
		System.out.println("문2 가장큰수는:"+max);
			// 문제3 : 4개의 정수를 입력받아서 가장 큰수 출력
		
		
		
			// 문제4 : 3개의 정수를 입력받아서 오름차순 / 내림차순 	[ 경우의수: 3 7 5 : 3>7 ,3>5 ,7>5]경우의수 총3개 경우의 수는 n-1만큼 비교해야함
		System.out.print("문제4 :"); int 정수6=scanner.nextInt();
		System.out.print("문제4 :"); int 정수7=scanner.nextInt();
		System.out.print("문제4 :"); int 정수8=scanner.nextInt();
		
		if(정수6>정수7) {int temp = 정수6; 정수6=정수7; 정수7=temp; }
		if(정수6>정수8) {int temp = 정수6; 정수6=정수8; 정수8=temp;}
		if(정수7>정수8) {int temp=정수7; 정수7=정수8;정수8=temp;}
		
		System.out.printf("%d %d %d \n",정수6,정수7,정수8);
			// 문제6 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 
		System.out.print("문제6 점수입력:"); int 점수=scanner.nextInt();
		if(점수>=90) {System.out.println("합격");}
		else {System.out.println("불합격");}
			//문제7 경우의수 4개
				// 점수를 입력받아 점수가 90점 이상이면 A등급
				//				점수가 80점 이상이면 B등급
				//				점수가 70점 이상이면 C등급
				//				그외 재시험
		System.out.print("문제7 점수입력:"); int 점수2=scanner.nextInt();
		if(점수2>=90) {System.out.println("A등급");}
		else if(점수2>=80) {System.out.println("B등급");}
		else if(점수2>=70) {System.out.println("C등급");}
		else {System.out.println("재시험");}
			/* 문제8	[경우의수 3개 , 첫번째 경우의수 3개, 두번째 경우의수 3개] 총 경우의수 9개
				[ 입력 ] : 국어,영어,수학 입력받기
				[ 조건 ]
					평균이 90점 이상이면서 
						국어점수 100점 이면 '국어우수' 출력
						영어점수 100점 이면 '영어우수' 출력
						수학점수 100점 이면 '수학우수' 출력
					평균이 80점 이상이면서 
						국어점수 90점이상 이면 '국어장려' 출력
						영어점수 90점이상 이면 '영어정려' 출력
						수학점수 90점이상 이면 '수학장려' 출력
					그외 재시험 
			 */
		System.out.print("문제8 점수입력:"); int 국어=scanner.nextInt(); 
		System.out.print("문제8 점수입력:"); int 영어=scanner.nextInt();
		System.out.print("문제8 점수입력:"); int 수학=scanner.nextInt();
		double 평균=(국어+영어+수학)/3;
		//!!!!1.경우의수 3개
		if(평균>=90) {}
		else if (평균>=80) {}
		else {}
		
		//2. if 중첩 : 하위 경우의수 작성
		if(평균>=90) {
			if(국어==100) {}	// 평균이 90이상이면서 국어 100 이면
			if(영어==100) {} // 평균이 90이상이면서 영어 100 이면
			if(수학==100) {} // 평균이 90이상이면서 수학 100 이면
		}
		else if (평균>=80) {
			if(국어>=90) {}
			if(영어>=90) {}
			if(수학>=90) {}
		}
		else {System.out.println("재시험");}
		
		//3.
		
		if(평균>=90) {
			if(국어==100) { System.out.println("국어우수");}
			if(영어==100) {System.out.println("영어우수");}
			if(수학==100) {System.out.println("수학우수");}
		}
		else if (평균>=80) {
			if(국어>=90) {System.out.println("국어장려");}
			if(영어>=90) {System.out.println("영어장려");}
			if(수학>=90) {System.out.println("수학장려");}
		}
		else {System.out.println("재시험");}
		
		
			//문제9 로그인페이지 경우의수 2개 
				// [ 입력 ] : 아이디와 비밀번호를 입력받기
				// [ 조건 ] : 회원아이디가 admin 이고 
				//           비밀번호가 1234 일 경우에는 
				//          로그인 성공 아니면 로그인 실패 출력
		System.out.println("----------------[로그인페이지]-----------------");
		System.out.print("아이디 :");String 아이디 =scanner.next();
		System.out.print("비밀번호 :");String 비밀번호 =scanner.next();
		
		//if(아이디=="admin"){//아이디가 admin이면	[String==(사용불가)]
			//비교연산자는 기본자료형(int , char , double 등)에서만 사용 가능 // 클래스(객체)는 비교연산자 X
			//클래스(객체=기본자료형 외,Strin)는 비교연산자 불가능---->비교 메소드(함수) 
			//기본자료형은 == 사용가능 vs기본자료형 아니면 -> 객체명.equals( 객체명 )
			//. : 접근 연산자( 내부)
		if(아이디.equals("admin")) {
			if(비밀번호.equals("1234")) {
				System.out.print("로그인성공");
			}else {
				System.out.print("비밀번호가 다릅니다");
			}
		}//if end
		else {//아이디가 admin이 아니면 
			System.out.print("아이디가 다릅니다");
		}//else end
		
		
		
	
	
	
	

}//main e

}//class e
