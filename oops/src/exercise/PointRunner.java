package exercise;

public class PointRunner {
	public static void main(String[] args) {

		Point p1 = new Point(3, 4);
		Point p2 = new Point(6, 8);

		p1.move(1, 1);

		double distance = p1.distanceTo(p2);

		System.out.println(distance);

	}
}
