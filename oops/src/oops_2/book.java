package oops_2;

import java.util.ArrayList;

public class book {

	private int id;
	private String name;
	private String author;
	private ArrayList<Review> review = new ArrayList<>();

	public book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

//	public void addReview(int id, String description, String author) {
//		this.id = id;
//		this.description = description;
//		this.author = author;
//	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", author=" + author + ", review=" + review + "]";
	}
}
