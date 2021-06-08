package exercise1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Validation {
	Scanner in = new Scanner(System.in);

	public double checkInputDouble() throws IOException {
		while (true) {
			try {
				double result = Double.parseDouble(in.nextLine());
				if (result < 0) {
					System.out.println("Enter positive number:");
					continue;
				}
				return result;
			} catch (NumberFormatException e) {
				System.err.println("Re-input");
			}
		}

	}
}
