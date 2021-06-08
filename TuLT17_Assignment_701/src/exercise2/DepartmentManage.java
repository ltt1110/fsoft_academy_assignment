package exercise2;

import java.util.ArrayList;
import java.util.List;

public class DepartmentManage {

	static List<Department> listD = new ArrayList<>();
	static List<Employee> listE = new ArrayList<>();
	static List<Employee> listE1 = new ArrayList<>();
	static Validation v = new Validation();
	static Department d = new Department();

	public static void main(String[] args) {

		listE.add(new SalariedEmployee("A1", "nam", "le", "11/11/1999", "11133444", "avv@aaa.com", 5, 300, 400));
		listE.add(new SalariedEmployee("A2", "minh", "nguyen", "02/11/1991", "11122444", "abb@aaa.com", 10, 500, 500));
		listE.add(new HourlyEmployee("A3", "son", "tran", "11/03/1998", "11133444", "acc@aaa.com", 100, 4));
		listE1.add(new SalariedEmployee("A4", "lan", "bui", "09/11/2000", "11144444", "ara@aaa.com", 4, 400, 600));
		listE1.add(new HourlyEmployee("A5", "long", "le", "11/11/1999", "11133444", "aaa@aaa.com", 150, 5));
		listD.add(new Department("java", listE));
		listD.add(new Department("dev", listE1));
		
		while (true) {
			System.out.println("1. Enter Employee\n" + "2. Display Employee\n" + "3. Classify employees\n"
					+ "4. Employee Search\n" + "5. Report");
			System.out.print("Enter your choice:");
			int a = v.checkInputIntLimit(1, 5);
			switch (a) {
			case 1:
				d.inputD();
				listD.add(d);
				break;
			case 2:
				for (Department de : listD) {
					System.out.println("Department : " + de.getDepartmentName());
					de.display();

				}
				break;
			case 3:
				for (Department de : listD) {
					System.out.println("Department: " + de.getDepartmentName());
					System.out.println("List Salaried Employee:");
					de.displaySE();
					System.out.println("List Hourly Employee:");
					de.displayHE();
					System.out.println();
				}
				break;
			case 4:
				searchEmployee();
				break;
			case 5:
				for (Department de : listD) {
					System.out.println("Department's name:" + de.getDepartmentName() + " , Number of employees: "
							+ de.getListOfEmployee().size());
				}
				break;
			}
		}
	}

	static void searchEmployee() {

		System.out.println("1. Search employees by department name\n2. Search detailed information about the employee");
		int a = v.checkInputIntLimit(1, 2);
		switch (a) {
		case 1:
			System.out.println("Enter department's name:");
			String s = v.checkInputString();
			for (Department de : listD) {
				if (s.equals(de.getDepartmentName())) {
					System.out.println("list employee of department " + s);
					de.display();

				}
			}
			break;
		case 2:
			System.out.println("Enter employee's name");
			System.out.print("Enter first name:");
			String fn = v.checkInputString();
			System.out.print("Enter last name:");
			String ln = v.checkInputString();
			for (Department de : listD) {
				for (Employee e : de.getListOfEmployee()) {
					if (fn.equals(e.getFirstName()) && ln.equals(e.getLastName())) {
						System.out.println(e);
					}
				}
			}
			break;

		}
	}
}
