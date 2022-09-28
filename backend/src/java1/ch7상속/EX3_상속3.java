package java1.ch7상속;

public class EX3_상속3 {
	public static void main(String[] args) {

		int r=10;
		
		Calculater calculater = new  Calculater();
		//부모클래스가 객체를 직접 선언
		System.out.println("원면적 : " +calculater.areaCircle(r));
		
		//자식클래스가 객체 선언
		Computer computer = new Computer();
		System.out.println("원면적 :"+ computer.areaCircle(r));
	}
}
