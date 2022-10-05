package java1.ch8인터페이스;

public class EX1_실행 {
	public static void main(String[] args) {
		// 인터페이스는 반드시 구현객체가 있어야함
		// 1. 객체 [ 인터페이스가 아님 ]
		Television tv = new Television();
		// 1. 인터페이스 변수 선언
		RemoteControl rc;

		// 2. 인터페이스 변수에 구현객체 대임
		rc = new Television(); // 리모콘에 텔레비전 기능 탑재

		// 3. 메소드 실행
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		// 2. 인터페이스 변수에 구현객체 변경
		rc = new Audio(); // 리모콘에 오디오 기능으로 변경대입

		// 3.메소드 실행
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();

		System.out.println(" audio ---> 스마트tv로 변경");

		//구현객체를 미리 만들고 불러서 사용 
		SmartTelevision stv = new SmartTelevision();

		// 변경

		rc = stv;

		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		Searchable sc = stv;
		sc.search("11번");

	}// main E
}// class E
