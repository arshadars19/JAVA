package exercise;

import java.util.Scanner;

public class switch_ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number 0(sun) - 6(sat) to get day:- ");
		int dayNumber = sc.nextInt();

		System.out.println(determineNameofDay(dayNumber));

	}

	public static String determineNameofDay(int dayNumber) {
		String result = " ";
		switch (dayNumber) {
		case 0:
			return "SUN";
		case 1:
			return "MON";
		case 2:
			return "TUE";
		case 3:
			return "WED";
		case 4:
			return "THURS";
		case 5:
			return "FRI";
		case 6:
			return "SAT";
		}
		return "Invalid data";
	}

}
