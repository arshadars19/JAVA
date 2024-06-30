package oops_basics;

public class MotorBike {

	private int speed;

	MotorBike() {
		// this.speed = 3500;
		this(5);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	int getSpeed() {
		return this.speed;
	}

	void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	void decreaseSpeed(int howMuch) {
		// if(this.speed -howMuch > 0)
		setSpeed(this.speed -= howMuch);
	}

	void start() {
		System.out.println(speed);
	}

}
