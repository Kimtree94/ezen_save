package java1.ch8인터페이스;

public class Audio implements RemoteControl {
	private int vloume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
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
		System.out.println("현재 TV 볼륨 : " + this.vloume);
	}
	
}
