package Arrays;

public class ArrayMagic {

	public boolean doesHaveElementGreaterThan(int[] array, int number) {

		for (int num : array) {
			if (num > number) {
				return true;
			}
		}
		return false;

	}

}
