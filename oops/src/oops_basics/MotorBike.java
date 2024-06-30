package oops_basics;

public class MotorBike {

	private int speed;

	void setSpeed(int speed) {
		this.speed = speed;
	}

	int getSpeed() {
		return this.speed;
	}

	void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	void decreaseSpeed(int howMuch) {
		this.speed -= howMuch;
	}

	void start() {
		System.out.println(speed);
	}

}
