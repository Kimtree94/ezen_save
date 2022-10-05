package java1.ch8인터페이스;

public class Television implements RemoteControl {
	// [ implements 인터페이스] : 구현하다 (인터페이스 즉 추상을 구현 )
	// [ extend 클래스] : 연장하다 (상속)
	// RemoteControl 인터페이스의 추상메소드를 구현하자

	// 1. 필드
	private int vloume;

	// 2. 생성자
	// 3. 메소드
	// RemoteControl 인터페이스의 추상메소드를 구현하자
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.vloume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.vloume = RemoteControl.MIN_VOLUME;
		} else {
			this.vloume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.vloume);
	}

}
