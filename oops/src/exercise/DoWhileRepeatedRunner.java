package exercise;

import java.util.Scanner;

public class DoWhileRepeatedRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Cubeis:- " + num * num * num);
			System.out.println("Enter the number to cube:- ");
			num = sc.nextInt();
		} while (num >= 0);
		System.out.println("Thankyou ");
	}

}
