package comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ars"), new Student(200, "Ranga"), new Student(3, "Adam"));

		ArrayList<Student> studAl = new ArrayList<>(students);
		System.out.println(studAl);

		Collections.sort(studAl);
		System.out.println(studAl);
	}

}
