package oops_2;

public class rectangle {

	private int length;
	private int width;

	public rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + ", area=" + area() + ", perimeter=" + perimeter()
				+ "]";
		// return String.format("length - %d width - %d area - %d perimeter - %d",
		// length, width, area(), perimeter());
	}

}
