package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String departmentName;
	private List<Employee> listOfEmployee;

	public Department() {

	}

	public Department(String departmentName, List<Employee> listOfEmployee) {
		super();
		this.departmentName = departmentName;
		this.listOfEmployee = listOfEmployee;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Employee> getListOfEmployee() {
		return listOfEmployee;
	}

	public void setListOfEmployee(List<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}

	public void inputD() {
		Validation v = new Validation();
		System.out.println("Enter departmentName: ");
		setDepartmentName(v.checkInputString());
		String x;
		listOfEmployee = new ArrayList<>();
		do {
			System.out.println("Enter Employee\n1. SalariedEmployee\n2. HourlyEmployee\n");
			int a = v.checkInputIntLimit(1, 2);

			
			Employee e;
			switch (a) {
			case 1:

				SalariedEmployee se = new SalariedEmployee();
				e = se.inputSE();
				listOfEmployee.add(e);

				break;
			case 2:

				HourlyEmployee he = new HourlyEmployee();
				e = he.inputHE();
				listOfEmployee.add(e);

				break;

			}
			System.out.println("Do you want continue to input employee (Y/N)?: ");
			x = v.checkInputString();
		} while (x.charAt(0) == 'Y' || x.charAt(0) == 'y');
	}

	public void display() {
		int count = 1;
		for (Employee e : listOfEmployee) {
			System.out.println("Employee " + count + " : " + e);
			count++;
		}
	}

	public void displaySE() {
		int count = 1;
		for (Employee e : listOfEmployee) {
			if (e.toString().contains("commissionRate")) {
				System.out.println("Employee " + count + " : " + e);
				count++;
			}
		}
	}

	public void displayHE() {
		int count = 1;
		for (Employee e : listOfEmployee) {
			if (e.toString().contains("wage")) {
				System.out.println("Employee " + count + " : " + e);
				count++;
			}
		}
	}

}
