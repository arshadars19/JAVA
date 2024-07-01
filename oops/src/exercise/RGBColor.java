package exercise;

public class RGBColor {

	private int Red;
	private int Green;
	private int Blue;

	public RGBColor(int Red, int Green, int Blue) {
		this.Red = Red;
		this.Blue = Blue;
		this.Green = Green;
	}

	public int getRed() {
		return Red;
	}

	public int getGreen() {
		return Green;
	}

	public int getBlue() {
		return Blue;
	}

	public void invert() {
		this.Red = 255 - this.Red;
		this.Green = 255 - this.Green;
		this.Blue = 255 - this.Blue;
	}
}
