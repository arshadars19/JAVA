package oops_basics;

public class Book {

	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void incCopies(int noOfCopies) {
		this.noOfCopies += noOfCopies;
	}

	void decCopies(int noOfCopies) {
		this.noOfCopies -= noOfCopies;
	}

	void start() {
		System.out.println(noOfCopies);
	}
}
