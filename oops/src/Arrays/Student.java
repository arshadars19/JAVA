package Arrays;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;
	int count = 0;
	int total = 0;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
//		for (int i = 0; i <= marks.length - 1; i++) {
//			count++;
//		}
//		return count;
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		for (int sum : marks) {
			total += sum;
		}
		return total;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;

		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;

		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum / number);
	}

}
