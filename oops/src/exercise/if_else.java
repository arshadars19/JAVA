package exercise;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;

		System.out.println("Enter number 1:- ");
		int num1 = sc.nextInt();

		System.out.println("Enter number 2:- ");
		int num2 = sc.nextInt();

		System.out.println("Enter 1 for Add:-  ");
		System.out.println("Enter 2 for subtract:- ");
		System.out.println("Enter 3 for Divide:- ");
		System.out.println("Enter 4 for MUltiply:-  ");
		int op = sc.nextInt();

		// if_else
//		if (op == 1) {
//			res = num1 + num2;
//		}
//		else if (op == 2) {
//			res = num1 - num2;
//		}
//		else if (op == 3) {
//			res = num1 / num2;
//		}
//		else if (op == 4) {
//			res = num1 * num2;
//		}

		// switch case
		switch (op) {
		case 1:
			res = num1 + num2;
			break;
		case 2:
			res = num1 - num2;
			break;
		case 3:
			res = num1 / num2;
			break;
		case 4:
			res = num1 * num2;
			break;
		default:
			System.out.println("Invalid operation !!!");
		}

		System.out.println("Result is :- " + res);
	}

}
