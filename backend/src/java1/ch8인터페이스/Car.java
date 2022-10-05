package java1.ch8인터페이스;

public class Car {
	Tire fronLeftrTire = new HankookTire();
	Tire fronRightTire = new HankookTire();
	Tire BackLeftrTire = new HankookTire();
	Tire BackRightrTire = new HankookTire();
	void run() {
			fronLeftrTire.roll(); fronRightTire.roll();
			BackLeftrTire.roll(); BackRightrTire.roll();
	}
}
