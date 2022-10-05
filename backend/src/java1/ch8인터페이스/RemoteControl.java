package java1.ch8인터페이스;

// 클래스 선언 : 접근제한자 class 클래스명 { }
// 인터페이스 선언 : 접근제한자 interface 인터페이스명 { }
public interface RemoteControl {

		// 변수 ( 변하는수 ) vs 상수( 고정된 수 )
		//1. [ static final ] : <- 상수 키워드 생략시 자동으로 상수 선언 
		//2. 초기값 ( 선언시 대입되는 값 ) 필수 
		public static final int MAX_VOLUME = 10;
		public int MIN_VOLUME = 0;
		
		// 추상 : 
		// 1. [ abstract ] : 추상 키워드 생략시 자동으로 추상 선언 
		// 2. 선언만 한다!!!! ------> 각 클래스에서 정의하자 [ 구현 객체 ]
		public abstract void turnOn();
		public void turnOff();
		public void setVolume(int volume);
		
		
}
