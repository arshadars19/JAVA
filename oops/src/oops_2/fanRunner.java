package oops_2;

public class fanRunner {

	public static void main(String[] args) {
		fan fan = new fan("crompton", 10, "blue");
		System.out.println(fan);

		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

		// fan.printDetails();
	}

}
