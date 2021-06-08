package exercise2;

public class HourlyEmployee extends Employee {
	private double wage;
	private double workingHours;

	public HourlyEmployee() {

	}

	public HourlyEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email,
			double wage, double workingHours) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.wage = wage;
		this.workingHours = workingHours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return super.toString() + " , wage :" + wage + ", workingHours:" + workingHours;
	}

	public void display() {
		System.out.println(toString());
	}

	public Employee inputHE() {
		Validation v = new Validation();
		super.inputE();
		System.out.println("Enter wage: ");
		this.setWage(v.checkInputDouble());
		System.out.println("Enter workingHours: ");
		this.setWorkingHours(v.checkInputDouble());
		return this;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
