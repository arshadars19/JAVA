package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

	public List<Integer> determineAllFactorial(int number) {
		List<Integer> factors = new ArrayList<Integer>();

		if (number <= 0) {
			return factors;
		}

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

}
