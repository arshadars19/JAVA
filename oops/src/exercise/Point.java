package exercise;

public class Point {

	private int x; // 4
	private int y; // 5

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;// 3+1
		this.y = this.y + dy;// 4+1

	}

	public double distanceTo(Point other) { // 6,8
		int diffX = this.x - other.x;
		int diffY = this.y - other.y;
		return Math.sqrt(diffX * diffX + diffY * diffY);
	}
}
