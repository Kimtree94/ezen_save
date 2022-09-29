package java1.ch7상속.EX5타이어예제;

import javax.swing.text.TabStop;

public class Car {

	//1.필드 [ 변수 , 객체 ,상수 ,배열 , 리스트 등 = 메모리 ]
	Tire frontLeftTire = new Tire( 6,"앞왼쪽");
	Tire frontRightTire = new Tire(2,"앞오른쪽" );
	Tire backLeftTire = new Tire(3, "뒤왼쪾");	
	Tire backRightTire = new Tire(4, "뒤오른쪽");

	//2.생성자
	
	//3.메소드
	boolean[] run() {
		System.out.println("[ 자동차가 달립니다.]");
		boolean[] tirestate = new boolean[4];
		tirestate[0] = frontLeftTire.roll();
		tirestate[1] = frontRightTire.roll();
		tirestate[2] = backLeftTire.roll();
		tirestate[3] = backRightTire.roll();
		for(boolean b : tirestate) {
			if(b==false) {stop();break;}
		}
		return tirestate;
	}

	
	void stop() {
		System.out.println("[ 자동차가 멈춥니다 ]");
	}
	
}//Class E
