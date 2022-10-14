package pc룸;

import java.util.Scanner;

public class 실행 {
	
	Scanner scan = new Scanner(System.in);
	
	private boolean stop = true;
	public void setStop(boolean stop) {  this.stop = stop; }
	private static 실행 e = new 실행();
	private 실행() { }
	public static 실행 getInstance( ) { return e;};
	
	public static void main(String[] args) {
		
		// 로그인성공시 시작메소드 호출
		int result = 실행.getInstance().pc시작();
		if( result == 1 ) { System.out.println("종료되었습니다.");}
		else if( result == 2 ) { System.out.println("시간 모두  사용했습니다.");}
		
	}
	
	int pc시작() {
		Timer timer = new Timer();
		timer.start();
		
		while( stop ) {
			
			System.out.println("1.pc종료 2.자리이동 2.주문 ");
			int ch =  scan.nextInt();
			if( ch == 1 ) {
				timer.setStop(false);
				return 1; // 본인 직접 끈다.
			}
			if( ch == 2 ) {}
			if( ch == 3 ) {}
		}
		timer.setStop(false);
		return 2;
	}
}






