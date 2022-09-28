package java1.ch7상속;

public class EX1_상속 {

	public static void main(String[] args) {
		
		//1. 객체생성 [ 클래스명 객체명 = new 생성자 () ]
		DmbCellPhone dmbCellPhone 
		= new DmbCellPhone("자바폰", "검정", 10);
		
		//2. 객체[ 클래스 ]가 상속받은 필드 호출 
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 :" + dmbCellPhone.color);
		
		//3. 본인 클래스
		System.out.println("채널 :"+dmbCellPhone.channel);
		
		//4. 객체 [ 클래스 ] 가 상속받은 메소드 호출 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receoveVoice("안녕하세요 저는 뚱이인데요.");
		dmbCellPhone.sendVoice("아~~예 반갑습니다");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		
		
		
		
		
	}//main E
	
}//class E
