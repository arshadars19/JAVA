package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic2 {

	public List<Integer> determineMultiples(int number, int limit) {
		List<Integer> multiples = new ArrayList<Integer>();
		if (number <= 0 || limit <= 0) {
			return multiples;
		}

		for (int i = 1; number * i <= limit; i++) {
			multiples.add(number * i);
		}
		return multiples;
	}
}
