package exercise2;

public class Employee {

	private String firstName;
	private String lastName;
	private double salary;

	public Employee() {

	}

	public Employee(String firstName, String lastName, double salary) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		if (salary > 0) {
			return salary;
		} else {
			return 0.0;
		}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", year salary=" + getYearSalary();
	}

	public double getYearSalary() {
		return salary * 12;
	}

	public double getRaiseSalary() {
		return getYearSalary() + (getYearSalary() * 10 / 100);
	}

	public String displayRaiseSalary() {
		return "Name: " + firstName + " " + lastName + " , Year salary: " + getRaiseSalary();
	}

}
