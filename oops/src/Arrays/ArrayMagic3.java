package Arrays;

public class ArrayMagic3 {

	public boolean isSorted(int[] array) {
		if (array.length <= 1) {
			return true;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {// 20<100
				return false;
			}
		}
		return true;
	}

}
