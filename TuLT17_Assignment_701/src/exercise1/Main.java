package exercise1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final String PHONE_VALID = "^[0-9]{10}$";
	static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

	static String checkInputString() {
		while (true) {
			String result = in.nextLine().trim();
			if (result.isEmpty()) {
				System.out.println("Not empty.");
			} else {
				return result;
			}
		}
	}

	static int checkInputIntLimit(int min, int max) {
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

	static String checkPhone(String phone) {
		while (true) {
			try {
				phone = in.nextLine();
				int phoneCheck = Integer.parseInt(phone);
				String resultCheck = String.valueOf(phoneCheck);
				if (!resultCheck.matches(PHONE_VALID)) {
					System.out.println("Phone number must be 10 digits");
					System.out.print("Phone number: ");

				} else {
					return resultCheck;
				}
			} catch (NumberFormatException ex) {

				System.out.println("Phone number must be number");
				System.out.print("Phone number: ");
			}
		}
	}

	static String checkEmail(String email) {
		while (true) {

			email = checkInputString();
			if (!email.matches(EMAIL_VALID)) {
				System.out.println("Email must is correct format");
				System.out.print("Email: ");
			} else {
				return email;
			}
		}
	}

	static String checkDate(String date) {
		while (true) {
			try {

				date = checkInputString();
				Date datef = new SimpleDateFormat("dd/MM/yyyy").parse(date);
				return date;
			} catch (ParseException ex) {
				System.out.println("Date to correct format(dd/MM/yyyy)");
				System.out.print("Date: ");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("====== Validate Program ======");
		System.out.print("Phone number: ");
		String phone = checkPhone("");
		System.out.print("Email: ");
		String email = checkEmail("");
		System.out.print("Date: ");
		String date = checkDate("");

	}
}
