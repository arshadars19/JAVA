package exercise;

public class datatypes {
	private int x;
	private int y;

	public datatypes(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getNumberX() {
		return this.x;
	}

	int getNumberY() {
		return this.y;
	}

	int add() {
		return x + y;
	}

	int multiply() {
		return x * y;
	}

	int divide() {
		return x / y;
	}

	void doubleValue() {
		this.x *= 2;
		this.y *= 2;
	}

}
