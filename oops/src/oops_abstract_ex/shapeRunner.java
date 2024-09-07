package oops_abstract_ex;

abstract class shape {
	protected String name;

	public shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public void displayInfo() {
		System.out.println("shape: " + name);
		System.out.println("Area: " + calculateArea());
	}
}

class Circle extends shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}

class Rectangle extends shape {
	private double length;
	private double width;

	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

}

public class shapeRunner {

	public static void main(String[] args) {
		shape[] sh = { new Circle("circle", 10), new Rectangle("Rectangle", 4, 2) };
		for (shape object : sh) {
			object.displayInfo();
		}
	}

}
