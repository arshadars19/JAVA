package loops;

public class NumberUtils {

	public int getLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		return number % 10;
	}

	public int getNumberofDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}

		int noOfDigits = 0;

		while (number > 0) {
			number = number / 10;
			noOfDigits++;
		}
		return noOfDigits;
	}

	public int getSumofDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}

		int SumOfDigit = 0;

		while (number > 0) {
			int digit = number % 10;
			SumOfDigit += digit;
			number = number / 10;
		}
		return SumOfDigit;
	}

	public int reverseNumber(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 0;
		}

		int reversedNum = 0;

		while (number > 0) {
			int digit = number % 10;
			reversedNum = reversedNum * 10 + digit;
			number = number / 10;
		}
		return reversedNum;
	}

}
