package exercise;

public class RGBColorRunner {

	public static void main(String[] args) {
		RGBColor rgb = new RGBColor(255, 0, 0);

		System.out.println("RED :- " + rgb.getRed());

		System.out.println("GREEN :- " + rgb.getGreen());

		System.out.println("BLUE :- " + rgb.getBlue());

		rgb.invert();

		System.out.println("RED :- " + rgb.getRed());

		System.out.println("GREEN :- " + rgb.getGreen());

		System.out.println("BLUE :- " + rgb.getBlue());

	}

}
