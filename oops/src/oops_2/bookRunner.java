package oops_2;

public class bookRunner {

	public static void main(String[] args) {
		book book = new book(123, "oops", "Dinga");
		System.out.println(book);
		book.addReview(new Review(1, "good", 5));
		book.addReview(new Review(2, "wow", 4));
		System.out.println(book);

	}

}
