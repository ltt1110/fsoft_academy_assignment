package exercise2;

public class SalariedEmployee extends Employee {
	private double commissionRate;
	private double grossSales;
	private double basisSalary;

	public SalariedEmployee() {

	}

	public SalariedEmployee(String ssn, String firstName, String lastName, String birthDate, String phone, String email,
			double commissionRate, double grossSales, double basisSalary) {
		super(ssn, firstName, lastName, birthDate, phone, email);
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
		this.basisSalary = basisSalary;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getBasisSalary() {
		return basisSalary;
	}

	public void setBasisSalary(double basisSalary) {
		this.basisSalary = basisSalary;
	}

	@Override
	public String toString() {
		return super.toString() + " , commissionRate :" + commissionRate + ", grossSales:" + grossSales + ", basisSalary:"
				+ basisSalary;
	}

	public void display() {
		System.out.println(toString());
	}

	public Employee inputSE() {
		Validation v = new Validation();
		super.inputE();
		System.out.println("Enter commissionRate: ");
		this.setCommissionRate(v.checkInputDouble());
		System.out.println("Enter grossSales: ");
		this.setGrossSales(v.checkInputDouble());
		System.out.println("Enter basisSalary: ");
		this.setBasisSalary(v.checkInputDouble());
		return this;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
