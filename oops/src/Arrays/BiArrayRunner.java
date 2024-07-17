package Arrays;

public class BiArrayRunner {

	public static void main(String[] args) {
		int[] array1 = { -1, -1, -1 };
		int[] array2 = { -2, 1 };
		BiArray bi = new BiArray(array1, array2);
		System.out.println(bi.areSumEqual());
	}

}
