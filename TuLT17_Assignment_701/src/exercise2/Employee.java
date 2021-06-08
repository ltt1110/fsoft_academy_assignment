package exercise2;



public abstract class Employee implements Payable {
	private String ssn;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String phone;
	private String email;

	public Employee() {

	}

	public Employee(String ssn, String firstName, String lastName, String birthDate, String phone, String email) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ssn:" + ssn + ", firstName:" + firstName + ", lastName:" + lastName + ", birthDate:" + birthDate
				+ ", phone:" + phone + ", email:" + email;
	}

	public void display() {
		System.out.println(toString());
	}

	public Employee inputE() {
		Validation v = new Validation();

		System.out.println("Enter ssn: ");
		this.setSsn(v.checkInputString());
		System.out.println("Enter firstName: ");
		this.setFirstName(v.checkInputString());
		System.out.println("Enter lastName: ");
		this.setLastName(v.checkInputString());
		System.out.println("Enter birthDate: ");
		this.setBirthDate(v.checkDate());
		System.out.println("Enter phone: ");
		this.setPhone(v.checkPhone());
		System.out.println("Enter email: ");
		this.setEmail(v.checkEmail());
		return this;

	}
	

}
