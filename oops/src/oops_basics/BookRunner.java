package oops_basics;

public class BookRunner {

	public static void main(String[] args) {

		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNoOfCopies(10);
		effectiveJava.setNoOfCopies(30);
		cleanCode.setNoOfCopies(5);

		artOfComputerProgramming.incCopies(10);
		effectiveJava.incCopies(10);
		cleanCode.incCopies(10);

		artOfComputerProgramming.decCopies(5);
		effectiveJava.decCopies(5);
		cleanCode.decCopies(5);

		System.out.println("Art of Programming copies:- " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("EffectiveJava copies:- " + effectiveJava.getNoOfCopies());
		System.out.println("CleanCode copies:- " + cleanCode.getNoOfCopies());

	}
}
