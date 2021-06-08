package exercise1;

import java.io.IOException;
import java.util.Scanner;

public class Manage {
	static Scanner in = new Scanner(System.in);

	public int mennu() throws IOException {
		System.out.println("1. Normal Calculator");
		System.out.println("2. BMI Calculator");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
		int choice = checkInputIntLimit(1, 3);
		return choice;
	}

	public int checkInputIntLimit(int min, int max) throws IOException {
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine().trim());
				if (result < min || result > max) {
					throw new NumberFormatException();

				}
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please input number in rage [" + min + ", " + max + "]");

			}
		}
	}

	public double checkInputDouble(String str) throws IOException {
		while (true) {
			try {
				System.out.print(str);
				double result = Double.parseDouble(in.nextLine());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Must be input double");

			}
		}
	}

	public String checkInputOperator(String str) throws IOException {
		while (true) {
			System.out.print(str);
			String result = in.nextLine().trim();
			if (result.isEmpty()) {
				System.err.println("Not empty");
			} else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-") || result.equalsIgnoreCase("*")
					|| result.equalsIgnoreCase("/") || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
				return result;
			} else {
				System.out.println("Please input (+, -, *, /, ^)");
			}

		}
	}

	public double checkInputDoubledigferrent0(String str) throws IOException {
		while (true) {
			try {
				System.out.print(str);
				double result = Double.parseDouble(in.nextLine());
				if (result == 0) {

					System.out.println("wrong format");
				} else
					return result;
			} catch (NumberFormatException e) {
				System.err.println("Must be input double");

			}
		}
	}

	public void normalCalculator() throws IOException {
		double memory;
		memory = checkInputDouble("Enter number: ");
		while (true) {

			String operator = checkInputOperator("Enter operator: ");
			if (operator.equalsIgnoreCase("+")) {
				memory += checkInputDouble("Enter number: ");
				System.out.println("Memory: " + memory);
			} else if (operator.equalsIgnoreCase("-")) {
				memory -= checkInputDouble("Enter number");
				System.out.println("Memory: " + memory);
			} else if (operator.equalsIgnoreCase("*")) {
				memory *= checkInputDouble("Enter number: ");
				System.out.println("Memory: " + memory);
			} else if (operator.equalsIgnoreCase("/")) {
				memory /= checkInputDoubledigferrent0("Enter number: ");
				System.out.println("Memory: " + memory);
			} else if (operator.equalsIgnoreCase("^")) {
				memory = Math.pow(memory, checkInputDouble("Enter number: "));
				System.out.println("Memory: " + memory);
			} else if (operator.equalsIgnoreCase("=")) {
				System.out.println("Result: " + memory);
				return;
			}
		}

	}

	public String BMIStatus(double bmi) {
		if (bmi < 19) {
			return "Under-standard.";
		} else if (bmi >= 19 && bmi < 25) {
			return "Standard.";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight.";
		} else if (bmi >= 30 && bmi < 40) {
			return "Fat-should lose weight";
		} else {
			return "Very fat - should lose weight immediately";
		}
	}

	public void BMICalculator() throws IOException {
		double weight = checkInputDouble("Enter Weight(kg): ");
		double height = checkInputDouble("Enter Height(cm): ");
		double bmi = weight * 10000 / (height * height);
		System.out.printf("BMI number: %.2f\n", bmi);
		System.out.println("BMI Status: " + BMIStatus(bmi));
	}
}
