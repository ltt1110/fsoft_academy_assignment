package exercise2;

import java.util.Scanner;

public class EmployeeTest {

	static Scanner sc = new Scanner(System.in);

	public static void inputEmployee(Employee e) {
		System.out.print("Enter first name: ");
		e.setFirstName(sc.nextLine().trim());
		System.out.print("Enter last name: ");
		e.setLastName(sc.nextLine().trim());
		System.out.print("Enter monthly salary: ");
		e.setSalary(Double.parseDouble(sc.nextLine().trim()));
	}

	public static void main(String[] args) {
		Employee e[] = null;
		int a, n = 0;
		boolean flag = true;

		do {

			System.out.println("1.Enter Employee \n" + "2.Display Employee\n" + "3.Raise 10% year salary\n" + "4.Exit");
			a = Integer.parseInt(sc.nextLine());
			switch (a) {
			case 1:
				System.out.print("Enter number of employee: ");
				n = Integer.parseInt(sc.nextLine());

				e = new Employee[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Employee " + (i + 1));
					e[i] = new Employee();
					inputEmployee(e[i]);
				}
				break;
			case 2:

				for (int i = 0; i < n; i++) {
					System.out.print("Employee " + (i + 1) + " : ");
					System.out.println(e[i].toString());
				}
				break;
			case 3:
				for (int i = 0; i < n; i++) {
					System.out.print("Employee " + (i + 1) + " : ");
					System.out.println(e[i].displayRaiseSalary());
				}
				break;
			case 4:
				System.out.println("bye");
				flag = false;
				break;
			}
		} while (flag);
	}

}
