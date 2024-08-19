package oops_abstract;

public class Receipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get vegetables and cut ");
	}

	@Override
	void doTheDish() {
		System.out.println("cook the vegetables ");

	}

	@Override
	void cleanup() {
		System.out.println("clean the plate ");

	}

}
