package exercise2;

import java.io.IOException;
import java.util.Scanner;

public class Validation {
	static Scanner in = new Scanner(System.in);

	public int CheckRange(int min, int max) throws IOException {
		do {
			try {
				int number = Integer.parseInt(in.nextLine().trim());
				if (number < min || number > max) {
					throw new NumberFormatException();
				}
				return number;
			} catch (NumberFormatException e) {
				System.out.println("Please input number in rage [" + min + " - " + max + "]");
				System.out.println("Enter again: ");
			}
		} while (true);
	}

	public String checkString() throws IOException {
		do {
			String value = in.nextLine();
			if (value.isEmpty()) {
				System.out.println("Empty String");
				System.out.println("Enter again:");
			} else {
				return value;
			}
		} while (true);
	}

	public float CheckFloat(float min) throws IOException {
		do {
			try {
				float number = Float.parseFloat(in.nextLine().trim());
				if (number < min) {
					throw new NumberFormatException();
				}
				return number;
			} catch (NumberFormatException e) {
				System.out.println("input value has to be bigger than " + min);
				System.out.println("Enter again: ");
			}
		} while (true);
	}
}
