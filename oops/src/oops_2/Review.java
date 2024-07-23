package oops_2;

public class Review {

	private int id;
	private String comment;
	private int rating;

	public Review(int id, String comment, int rating) {
		super();
		this.id = id;
		this.comment = comment;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + comment + ", rating=" + rating + "]";
	}

}
