package exercise;

public class SquareRunner {

	public static void main(String[] args) {
		Square sq = new Square(12);

		System.out.println("Area: " + sq.calculatedArea());
		System.out.println("Perimeter: " + sq.calculatedPerimeter());
	}

}
