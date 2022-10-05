package java1.ch8인터페이스;

public class EX3_실행 {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run();
		//구현객체 교체
		car.fronLeftrTire=new KumhoTire();
		car.fronRightTire=new KumhoTire();
		
		car.run(); 
	}
}
