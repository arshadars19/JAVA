package exercise;

public class Square {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calculatedArea() {
		if (side <= 0) {
			return -1;
		}
		// int area = side * side;
		return side * side;
	}

	public int calculatedPerimeter() {
		if (side <= 0) {
			return -1;
		}
		// int perimeter = 4 * side;
		return 4 * side;
	}

}
