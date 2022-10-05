package java1.ch8인터페이스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class EX4_실행 {

	public static void main(String[] args) {

		// 1. 인터페이스 객체에 구현객체 대입
		Vehicle vehicle = new Bus();

		vehicle.run();

		// 2. 인터페이스에 없는 메소드는 사용불가
		// vehicle.checkFare();

		// 3. 강제형변환 [ 인터페이스 - > 객체 ] 구현이나 상속을 했을경우에만 강제형변환 가능

		// 객체명/변수명 instanceof 클래스명
		System.out.println("관계확인 :" + (vehicle instanceof Television));
		System.out.println("관계확인 :" + (vehicle instanceof Bus));

		Bus bus = (Bus) vehicle;

		bus.run();
		bus.checkFare();
	
		//***컬렉션프레임워크
		
		List<String> list;// 인터페이스 변수 선언
			
			//1.인터페이스 변수에 arrayList 객체 탑재
		list= new ArrayList<>();
			list.add("sss");
			//2.인터페이스 변수에 Vector 객체 탑재
		list= new Vector<>();
			list.add("eee");
			//3.인터페이스 변수에 Linkedlist 객체 탑재
		list= new LinkedList<>();
			list.add("ccc");
		
		System.out.println(list.toString());
		
	
	}
}
