package exercise;

import java.util.Scanner;

public class switch_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number 0(sun) - 6(sat):- ");
		int dayNumber = sc.nextInt();

		boolean day = isWeekDay(dayNumber);
		System.out.println();
		System.out.println(day);

	}

	public static boolean isWeekDay(int dayNumber) {
//		return dayNumber >= 1 && dayNumber <= 5;
		switch (dayNumber) {
//		case 0:
//			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
//		case 6:
//			return false;
		}
		return false;

	}

}
