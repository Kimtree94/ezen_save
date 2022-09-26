package java1.ch12스레드;

public class EX3_동기화 {
	public static void main(String[] args) {
		계산기 my계산기 = new 계산기(); // 계산기 클래스로 객체 설정 
		
		사람1 user1 = new 사람1();
		user1.set계산기(my계산기);
		user1.start();
		
		사람2 user2 = new 사람2();
		user2.set계산기(my계산기);
		user2.start();
		
		//* 사람1 과 사람2 동일한 계산기 [객체]= 공유객체를 사용한다
		
	}
	
	
	
	
	
}
/*



 */
