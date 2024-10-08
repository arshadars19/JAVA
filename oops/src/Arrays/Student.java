package Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] marks;
	// arraylist
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		// this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
//		for (int i = 0; i <= marks.length - 1; i++) {
//			count++;
//		}
//		return count;
		// return marks.length;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int maximum = Integer.MIN_VALUE;
//
//		for (int mark : marks) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE;
//
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;
		return Collections.min(marks);

	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
