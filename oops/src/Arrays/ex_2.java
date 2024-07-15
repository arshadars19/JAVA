package Arrays;

import java.util.Arrays;

public class ex_2 {

	public static void main(String[] args) {
		int[] runs = new int[5];
		for (int run : runs) {
			System.out.println(run);
		}

		Arrays.fill(runs, 100);

		for (int run : runs) {
			System.out.println(run);
		}

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		int[] array3 = { 3, 2, 1 };

		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		System.out.println(Arrays.toString(array3));
		Arrays.sort(array3);
		System.out.println(Arrays.toString(array3));
	}

}
