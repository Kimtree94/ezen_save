package java1.a변수;

import java.util.Scanner;

public class EX5_입출력 {//class s
	public static void main(String[] args) {//main s
		
		//p90 : print format : 출력 형식[서식=모양=폼]
		int 변수 = 123;
		System.out.println(변수+"원");
		System.out.printf("%d원\n" , 변수);
		
		int value =123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);//3칸이 남은곳을 0으로 채움
		
		double area=3.14159 *10*10;//실수
		System.out.printf("반지름이 %d인 원의 넓이 :%10.2f\n",10,area);
		
		String name ="홍길동";
		String job ="도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);
		
		//입력 객체(클래스) 선언
		Scanner 입력객체 = new	Scanner(System.in); //System.in => 키보드
	    //[객체생성]클래스명 객체명  = new 생성자
						//new 객체 선언시 메모리 할등 키워드 역할 
		int 입력정수 = 입력객체.nextInt();
		System.out.println("입력받은 정수 : "+ 입력정수);
		
		String 입력문자열 = 입력객체.next();
		System.out.println("입력받은 문자:"+ 입력문자열);
		
		
		/*------------------------------------------*/
		//입력예제)
		//1.입력받기 [ 준비물:Scanner라는 클래스로 객체 1개가 필요]
		//키보드(System.in)--입력-->객체저장--next()--->변수 저장
		//2.입력받은 데이터를 변수에 저장
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 :");	String 이름 = scanner.next(); //저장하지 않으면 사라짐 //반환된것을 저장한다!
		System.out.print("나이 :");  int 나이 =scanner.nextInt();
		System.out.print("키 :");   double 키=scanner.nextDouble();
		//3. 변수 출력
		System.out.println("--------개인정보--------");
		System.out.printf("%5s\t%5s\t%5s\n" ,"이름","나이","키");
		System.out.printf("%5s\t%5d\t%5.1f",이름,나이,키);
		System.out.println("\n"+이름+"\t"+나이+"\t"+키);
	}//main e
}//class e
/*
	System.out :출력
	System.in  :입력
	
	형식문자
		1.%d : 정수
			%숫자d  :오른쪽부터 자리수만큼 자리를 차지함 (빈공간 여백이 생김)[만약에 숫자가 없을경우 공백 채움]
			%0숫자d :오른쪽부터 자리수만큼 자리를 차지 [ 만약에 숫자가 없을경우 0으로 채움]
			%-숫자d :왼쪽부터 ~~
			
		2.%f : 실수
			%자리수.소수자리f
				:%10.2f:10자리의 자리 차지, 소수점 2자리까지 표시하겠다'
				
		3.%s : 문자열
*/