package oops_2;

public class fan {

	private String make;
	private int radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public fan(String make, int radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public String toString() {
		return String.format("make - %s, radius - %d, color - %s, isOn - %b, speed - %d ", make, radius, color, isOn,
				speed);
	}

	public void printDetails() {
		System.out.println("make - " + make + ", radius - " + radius + ", color - " + color + ", isOn - " + isOn
				+ ", speed - " + speed);
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

}
