package Arrays;

import java.util.Arrays;

public class ex_1 {

	public static void main(String[] args) {

		int[] marks = { 10, 20, 30, 40, 50, 60, 70, 80 };

		System.out.println(marks);

		System.out.println(Arrays.toString(marks));

		// for loop
		for (int i = 0; i <= marks.length - 1; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("-----------------------------------------------");

		// enhanced for loop
		for (int mark : marks) {
			System.out.println(mark);
		}

		ex_1[] ex = new ex_1[5];

		for (ex_1 res : ex) {
			System.out.println(res);
		}

		boolean[] bol = new boolean[5];
		for (boolean res : bol) {
			System.out.println(res);
		}
	}

}
