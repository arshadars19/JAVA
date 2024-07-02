package exercise;

public class datatypesRunner {

	public static void main(String[] args) {
		datatypes data = new datatypes(2, 3);

		System.out.println(data.add());
		System.out.println(data.multiply());
		System.out.println(data.divide());
		data.doubleValue();
		System.out.println(data.getNumberX());
		System.out.println(data.getNumberY());

	}

}
