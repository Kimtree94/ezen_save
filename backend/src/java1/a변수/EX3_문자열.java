package java1.a변수;

public class EX3_문자열 { //class시작
	public static void main(String[] args) {//main s
		
		//p.64 String 타입 [String 클래스]
		//char 문자 ="자바"; //오류발생 : char은 문자 한개만 저장할수 있다
		String 문자열 ="자바";
		
		//p65
		String name ="\"홍길동";  System.out.println(name);
		String job ="프로그래머"; System.out.println(job);
		
		//p66
		System.out.println("안녕하세요"); //println : 출력후 줄바꿈 처리 O
		System.out.print("자바입니다."); //print : 출력후 줄바꿈 처리 X
		System.out.println("하하하하하");
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는\"개발자\"입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
		System.out.println("\n-------------JAVA연습--------------------------------");
		//예제1 console 에 고양이모양 출력
		System.out.println("\n\\    /\\ \n )  ( ')\n(  /   ) \n \\(__) |");
		//예제2	강아지console출력
		System.out.println("\n |\\_/| \n |q p|   /} \n ( 0 )\"\"\"\\  \n |\"^\"`    |  \n ||_/=\\\\__|");
		//예제3 출석부 출력
		System.out.println("\n\t[[ 출석부 ]]\n-----------------------------"
				+ "\n이름\t1교시   \t2교시   \t3교시\n"
				+ "강호동\t출석    \t결석    \t출석\n"
				+ "유재석\t출석   \t결석    \t출석"
				+ "\n-----------------------------");
		System.out.println("\n-----------------------------------------------------------------");
	}//main e
}//class end
/*
	문자 [ 한글자]		:char 		: '자'
	문자열 [두글자 이상]	:String		: "자바 입니다"
	
	- console 화면에 출력하는  함수 
		print()		: 출력만 함
		println()	: 출력하고 줄바꿈[\n] 처리까지 포함됨
		printf()	: 형식문자 출력이 됨
	- 제어[이스케이프] 문자
		1.\n : 줄바꿈 2. \t :들여쓰기[tab5칸]	
		3.\특수문자 : 특수문자 출력
			"홍길동"--->홍길동
			"\"홍길동\""--->"홍길동"
*/