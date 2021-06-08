package exercise2;

import java.util.Scanner;

public class Validation {
	 Scanner in = new Scanner(System.in);

	public int checkInputInt() {
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please input a number.");
				System.out.print("Enter again: ");
			}
		}
	}
}
