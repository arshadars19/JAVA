package Arrays;

public class ArrayMagic2 {

	public int findSecondLargestElement(int[] array) {

		if (array.length == 0) {
			return -1;
		}
		int largestNumber = Integer.MIN_VALUE; // or 0
		int secondlargestNumber = Integer.MIN_VALUE; // or 0
		for (int value : array) {
			if (value > largestNumber) {
				secondlargestNumber = largestNumber;// same value
				largestNumber = value;
			} else if (value > secondlargestNumber && value != largestNumber) {
				secondlargestNumber = value;
			}
		}
		if (secondlargestNumber == Integer.MIN_VALUE) {
			return -1;
		}
		return secondlargestNumber;
	}

}
