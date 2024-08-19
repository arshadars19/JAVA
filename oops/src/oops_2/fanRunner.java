package oops_2;

public class fanRunner {

	public static void main(String[] args) {
		fan fan = new fan("crompton", 10, "blue");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

		// fan.printDetails();
	}

}
