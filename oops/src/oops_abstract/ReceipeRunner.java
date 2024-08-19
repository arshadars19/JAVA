package oops_abstract;

public class ReceipeRunner {

	public static void main(String[] args) {
		Receipe receipe = new Receipe();
		receipe.excute();

		receipe.getReady();
		receipe.doTheDish();
		receipe.cleanup();

		System.out.println("________________________________________________");
		ReceipeWithOven receipewithOven = new ReceipeWithOven();
		receipewithOven.excute();
	}

}
