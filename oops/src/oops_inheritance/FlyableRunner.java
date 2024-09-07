package oops_inheritance;

interface flyable {
	void fly();
}

class bird implements flyable {

	@Override
	public void fly() {
		System.out.println("with wings");
	}

}

class aeroplane implements flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");
	}

}

public class FlyableRunner {

	public static void main(String[] args) {
		// flyable flyingObjects = new bird();
		flyable[] flyingObjects = { new bird(), new aeroplane() };
		for (flyable objects : flyingObjects) {
			objects.fly();
		}

	}

}
