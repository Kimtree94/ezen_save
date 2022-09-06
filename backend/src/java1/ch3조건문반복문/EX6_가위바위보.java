package java1.ch3조건문반복문;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/*
	가위바위보 게임 
		[ 조건 ]
		1. 플레이어 에게 가위[0], 바위[1] , 보[2] 중에 입력 받기
		2. 컴퓨터에게 난수[0~2]생성 (random.nextInt(3))
			 *Random 클래스
			 *Random 변수명 = new Random()
			 		*변수명.nextInt(수) : 0~수 -1 까지의 난수 발생
		3. 승리자 판단[경우의수]
		4.게임종료시 최종 승리자를 출력 
			1.게임판수 출력
			2. 최종승리자 
		[ 메뉴 ]
		1.가위(0) 바위가(1) 보(2) 종료(3)
*/
public class EX6_가위바위보 {//class s
	
	public static void main(String[] args) {//main s
		//0. 모든 코드에서 사용될 변수 [메모리] 선언
		int 플레이어; int 컴퓨터; int 게임판수=0; int 승리수 = 0; //0이면 무승부//양수 플레이어승리//음수 컴퓨터 승리
		Scanner scanner=new Scanner(System.in);
		while(true) {//무한루프[종료조건:3입력했을때]
			//1.플레이어에게 입력 받는다
			System.out.println("가위(0) 바위(1) 보(2) :"); 플레이어=scanner.nextInt();
			
				//6.입력 경우의수 [ 1. 0~2 :정상입력 /2.3 :종료 /3.그외 :비정상입력]
				if(플레이어>=0 && 플레이어<=2) {
						///////////////////////////////////게임진행///////////////////////////////////////////
			//2.컴퓨터가 난수를 생성한다.
			Random random = new Random();//1.랜덤 객체 생성한다.
			컴퓨터 = random.nextInt(3);//2. 랜덤객체를 이용한  int형 난수 생성; 객체명.nextInt(수) 0~(수-1)
			System.out.println("컴퓨터는)"+컴퓨터);
			//3. 승리자 판단 [ 경우의수 3개 =1.승리 2.패베 3.무승부 ]
				//3-1.이기는 경우의수 [가위(0)내면 &&컴퓨터는 보(2)를 내야함] or 나 1 && 컴 0 or 나 2 && 컴 1 
			if(( 플레이어==0 && 컴퓨터==2 ) || ( 플레이어==1 && 컴퓨터==0 ) || (플레이어==2 && 컴퓨터==1))
				{System.out.println("결과) 플레이어 승리");승리수++;}
				//3-2. 같을경우 무승부
			else if(( 플레이어==0 && 컴퓨터==0 ) || ( 플레이어==1 && 컴퓨터==1 ) || (플레이어==2 && 컴퓨터==2))
			{System.out.print("결과) 무승부");}
				//3-3. 그외
			else {System.out.println("결과) 컴퓨터 승리"); 승리수--;}
			//5.게임횟수 증가
			게임판수++;
			//////////////////////////////////////////////////////////////////////////////////
				}
				else if(플레이어==3) {//7.게임종료 했을때
					
					System.out.println("게임종료) 게임횟수 :"+게임판수);
					if(승리수==0) {System.out.print("최종결과) 무승부");}
					else if(승리수>1) {System.out.print("최종결과)플레이어승리");}
					else {System.out.print("최종결과)컴퓨터승리");}
					break;
				}
				else {System.out.println("안내) 알수 없는 번호 입니다.[다시 입력해주세요]");}//비정상적으로 입력 했을때
		}//while end
	}//main e
}//class e
























