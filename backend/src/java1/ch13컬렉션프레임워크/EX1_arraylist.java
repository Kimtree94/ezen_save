package java1.ch13컬렉션프레임워크;

import java.util.ArrayList;

public class EX1_arraylist {

	public static void main(String[] args) {
		
		//1. 객체 [ 클래스명 변수명 = new 생성자() ; ]
		//1. 컬렉션프레임워크 객체 [ 클래스명<타입파라미터> 변수명 = new 클래스명 <>(); ]
			// <> : 클래스안에 클래스를 매개로 넣는 방식 : 제네릭
		
		// 정수 int 여러개를 저장할수 있는 리스트 선언
		ArrayList<Integer> lntlist = new ArrayList<>();
		// 실수 double 여러개를 저장할수 있는 리스트 선언
		ArrayList<Double> doublelist = new ArrayList<>();
		// 내가 만든 자료형(Member)을 여러개를 저장할수 있는 리스트 선언 
		ArrayList<Member> memberlist = new ArrayList<>();
		
		
		
		// String 여러개를 저장할수 있는 리스트 선언
		ArrayList<String> list = new ArrayList<>();
		
		
		//1.add()
		list.add("java");			System.out.println("리스트 현황 : "+list.toString());//"java" : String 타입 
		list.add("jdbc");			System.out.println("리스트 현황 : "+list.toString());
		list.add("Servlet/JSP");	System.out.println("리스트 현황 : "+list.toString());
		list.add(2,"database");		System.out.println("리스트 현황 : "+list.toString());
		list.add("ibatis"); 		System.out.println("리스트 현황 : "+list.toString());
		
		//2. size()
		System.out.println("리스트내 객체수 "+ list.size());
		
		//3. get()
		
		System.out.println("리스트 호출" + list.get(0));
		System.out.println("리스트 호출" + list.get(3));
		
		//4. remove()
		System.out.println("특정 인덱스[0] 삭제 : "+list.remove(0));
		System.out.println("리스트 현황 : "+list.toString());
		System.out.println("동일한 객체로 삭제 : "+list.remove("ibatis"));
		System.out.println("리스트 현황 : "+list.toString());
		
		//5. 리스트 / 배열 <------> 반복문 
			//1.
		for(int i=0 ; i<list.size();i++) {
			System.out.println(list.get(i));
		}
			//2. 향상된 for 문
		for(String s : list) { // for (타입파라미터)
		System.out.println(s);
		}
		
		
		
		//7	.contains(객체) : 해당 객체가 존재하면 true/false
		System.out.println(list.contains("jdbc")); 
		
		//8. indexOf 	: 해당 객체의 인덱스위치를 반환 
		System.out.println(list.indexOf("jdbc"));
		
		//9. list.isEmpty()		: 리스트 객체가 하나도 없으면 true/false
		System.out.println(list.isEmpty());
		
		//10. iterator			: 리스트내 객체 순회 
		System.out.println(list.iterator());
		
		
		
		
		
		
		//6.
		list.clear();
		
		//함수는 관례적 이름 꺼내올때 get , 집어넣을때 set , 확인할때 is 
		
		
		
	}// main E
	
	
	
}// class E
/*
	문자열 10개 저장한다 
	1. String [10] 배열 = new String [ 10 ]				== 참조되는 메모리에 참조를 넣는다??
		1. 선언된 길이는 변경이 안된다 -> 변경을 하게 되면 안에있는 메모리가 손실이 생기거나 문제가 발생할수 있다 
		2. 추가 삭제 삽입  - >  직접 인덱스를 이용해서 넣어주어야한다 
		
	2. ArrayList< String > 배열 = new ArrayList<>();		== 객체안에 객체를 집어넣는다
		1. 길이가 자동 [ 기본값 10 부터 ] 
		2. 추가 삭제 삽입 -> 함수를 제공한다  즉 미리 만들어진 코드를 제공 한다  === 단점 무겁다 즉 속도가 느리다 
		
	제네릭 = 클래스 안에 클래스 즉 클래스도 매개변수로 사용가능 하다 => 광범위한 설계도 설계 가능 




*/
