package oops_inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Arshad");
		emp.setPhone("9876543210");
		emp.setEmail("ars@gmail.com");
		emp.setEmployer("Onward");
		emp.setEmployeeGrade(1);
		emp.setTitle("Software Engineer");
		emp.setSalary(25000);
		System.out.println(emp);
	}

}
