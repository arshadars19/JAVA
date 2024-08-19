package oops_inheritance;

public class Project {

	public static void main(String[] args) {
		ComplexAlgorithm algo = new RealAlgorithm();
		System.out.println(algo.complexAlgorithm(10, 20));
	}

}
