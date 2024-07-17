package Arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		// int[] marks = { 97, 98, 100 };
		// using inline from refactor
		// Student student = new Student("Arshad", new int[] { 97, 98, 100 });

		Student student = new Student("Arshad", 97, 98, 100);

		int number = student.getNumberOfMarks();
		System.out.println(number);
		int sum = student.getTotalSumOfMarks();
		System.out.println(sum);
		int maximumMark = student.getMaximumMark();
		System.out.println(maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println(minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println(average);

		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(1);
		System.out.println(student);

	}

}
