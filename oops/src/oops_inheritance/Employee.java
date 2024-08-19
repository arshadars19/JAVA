package oops_inheritance;

public class Employee extends person {

	private String title;
	private String employer;
	private int employeeGrade;
	private int salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [title=" + title + ", employer=" + employer + ", employeeGrade=" + employeeGrade + ", salary="
				+ salary + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

}
