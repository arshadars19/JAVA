package Project_ATM;

import java.util.Scanner;

public class Project_Atm {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);

		int balance = 50000;
		int addAmount = 0;
		int withdrawAmount = 0;
		int orgPin = 1122;

		System.out.println("Welcome To AATIF ATM Machine");
		System.out.println("Enter your name:- ");
		String name = sc.nextLine();
		System.out.println("Welcome " + name);
		System.out.println("Enter your Pin :- ");
		int pin = sc.nextInt();
		if (orgPin == pin) {
			while (true) {
				System.out.println("-------------------------------------------------");
				System.out.println("Press Below Number to proceed Futher..");
				System.out.println("Press 1 to check your balance ");
				System.out.println("Press 2 to Add Money ");
				System.out.println("Press 3 to withdraw ");
				System.out.println("Press 4 to Exit ");
				int opt = sc.nextInt();
				switch (opt) {
				case 1:
					System.out.println("Your balance is:- " + balance);
					break;
				case 2:
					System.out.println("Enter amount to add:- ");
					addAmount = sc.nextInt();
					balance += addAmount;
					System.out.println("--Succesfully Added and Balance Updated--");
					System.out.println("Available balance is :- " + balance);
					break;
				case 3:
					System.out.println("Enter amount to withdraw:- ");
					withdrawAmount = sc.nextInt();
					balance -= withdrawAmount;
					System.out.println("--Succesfully Withdrawn and Balance Updated--");
					System.out.println("Available balance is :- " + balance);
					break;
				case 4:
					System.out.println("Thankyou for using AATIF ATM Machine");
					break;
				default:
					System.out.println("Invalid Enter from below option");
					break;
				}
			}

		} else {
			System.out.println("Wrong PIN... Enter correct Pin");
		}
	}
}
