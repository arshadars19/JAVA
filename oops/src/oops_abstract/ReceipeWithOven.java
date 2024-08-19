package oops_abstract;

public class ReceipeWithOven extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get vegetables and cut ");
		System.out.println("Turn on the oven");
	}

	@Override
	void doTheDish() {
		System.out.println("cook the vegetables ");

	}

	@Override
	void cleanup() {
		System.out.println("clean the plate ");
		System.out.println("Turn off the oven");
	}

}
