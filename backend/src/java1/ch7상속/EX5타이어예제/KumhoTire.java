package java1.ch7상속.EX5타이어예제;

public class KumhoTire extends Tire{
	//1.필드
	//2.생성자
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean roll() {
		++accumulaterRotation; // 누적 회전수 1씩 증가
		if (accumulaterRotation < maxRotation) { // 최대회전수 보다 누적회전수가 더 작으면 [ 수명 남음 ]
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulaterRotation) + "회");
			return true; // 수명이 남았을경우 true
		}else {
			System.out.println("***"+location+"KumhoTire펑크 ***");
			return false;// 수명이 없으면 false 펑크
		}
}
	
}
