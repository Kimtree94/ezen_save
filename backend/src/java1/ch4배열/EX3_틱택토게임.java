package java1.ch4배열;

import java.util.Random;
import java.util.Scanner;

public class EX3_틱택토게임 {//class S

		public static void main(String[] args) {//main S
			
			//*String(문자) 9개를 저장할수 있는 배열 선언과 초기값[처음값]
		String[ ]게임판 = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		Scanner scanner=new Scanner(System.in);
		
		int con=0;
			while(true){//무한루프 [종료조건 : 승리판단이 있을때]
			//1.게임판 출력 = 배열내 모든 데이터 출력
			for(int i=0;i<게임판.length;i++) {//i는 01부터 마지막 인덱스(배열의길이-1)까지 1씩 증가
				System.out.print(게임판[i]);
				//1-2 3줄마다[3배수 ]줄바꿈
			if(i%3==2) {System.out.println();}
			}//for e
			

	
			//2.사용자에게 위치 입력받 기
			while(true) {//무한루프[ 종료조건 : 알을 두었을때 종료 break]
				System.out.print("원하는 위치를 입력하세요 :");		int 위치=scanner.nextInt();
				if(위치<0||위치>8) {System.out.println("안내) 선택할수 없는 번호입니다.");}
				if(게임판[위치].equals("[ ]")) { 게임판[위치] ="[O]";con++;break;}//알을 두면 무한루프 종료
				else {System.out.println("안내 ) 이미 알이 존재하는 위치 입니다.");}
			}//while 2 E       
			
			
			
			if(con==9) {//마지막 사용자가 알을 둔후 조건 만족 
				System.out.println("무승부입니다.");
			return;
			}
			
			
				
				
			//3.컴퓨터에게 위치 난수 생성
			while(true) {
			Random random=new Random();
			int 컴퓨터=random.nextInt(9);
			if(게임판[컴퓨터].equals("[ ]")) {게임판[컴퓨터]="[X]";con++;break;}//알을 두면 무한루프 종료
			
			
			}
			//4.승리자 판단 [과제]
			//4-1가로 승리 
	
			for( int i = 0 ; i<=6 ; i+=3 ) {
				if(!게임판[i].equals("[ ]")&&게임판[i].equals( 게임판[i+1] )&&게임판[i+1].equals( 게임판[i+2]) ) 
				{
					if( 게임판[i].equals("[O]")  ) { System.err.print("플레이어의승리입니다.");return; }
					if( 게임판[i].equals("[X]")  ) { System.err.print("컴퓨터의승리입니다.");return; }
					
				} 
			}
			
			//4-2세로승리
			for(int i=0;i<=2;i++) {
				if(!게임판[i].equals("[ ]")&&게임판[i].equals( 게임판[i+3] )&&게임판[i+3].equals( 게임판[i+6] )) {
					if(게임판[i].equals("[O]")){System.err.print("플레이어의승리입니다");return;}
					else {System.err.print("컴퓨터의승리입니다.");return;}
					
					
				}
				
			}
		
			//4-3대각선승리
			
			if(!게임판[0].equals("[ ]")&&게임판[0].equals( 게임판[4] )&&게임판[4].equals( 게임판[8] )) {
				if(게임판[0].equals("[O]")){System.err.print("플레이어의승리입니다");return;}
				else {System.err.print("컴퓨터의승리입니다.");return;}
			}
				
			if(!게임판[2].equals("[ ]")&&게임판[2].equals( 게임판[4] )&&게임판[4].equals( 게임판[6] )) {
				if(게임판[2].equals("[O]")){System.err.print("플레이어의승리입니다");return;}
				else {System.err.print("컴퓨터의승리입니다.");return;}
			}
	

	
		

			

			}//while 1 E
		}//main E
}//class E




/*
	틱택토 게임
		[ 조건 ]
		1.게임판 9칸 사용 -> 배열[0~8]
			1.String 배열 	클래스는 비교연산자 불가능 -------->
			== <--> 문자열.equals(문자열2)
			!= <--> !문자열.equals(문자열2)
		2.사용자가 알(o)을 두고자 하는 위치[인덱스] 입력[0~8]
			1. 선택된 위치가 이미 다른 알이 존재하면 재입력[중복제거]
		3. 컴퓨터가(x) 난수 생성[0~8]
			1. 난수의 위치에 이미 다른 알이 존재하면 재생성 [중복제거]
		4. 승리자 판단[1.가로로 이기는수 2.세로로 이기는수 3.대각선으로 이기는수 4.무승부]
			
			
		
		[출력]
			1.게임판 출력 예시
			[ ] [ ] [ ] 
			[ ] [ ] [ ] 
			[ ] [ ] [ ] 

*/