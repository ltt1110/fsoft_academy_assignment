package exercise2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {
	final Scanner in = new Scanner(System.in);
	final String PHONE_VALID = "^[0-9]{7,}$";
	final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

	public String checkInputString() {
		while (true) {
			String result = in.nextLine().trim();
			if (result.isEmpty()) {
				System.out.println("Not empty.");
			} else {
				return result;
			}
		}
	}

	public double checkInputDouble()  {
		while (true) {
			try {
				
				double result = Double.parseDouble(in.nextLine());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Must be input double");

			}
		}
	}
 
	public int checkInputIntLimit(int min, int max) {
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

	public String checkPhone() {
		while (true) {
			try {
				String phone = in.nextLine();
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

	public String checkEmail() {
		while (true) {

			String email = checkInputString();
			if (!email.matches(EMAIL_VALID)) {
				System.out.println("Email must is correct format");
				System.out.print("Email: ");
			} else {
				return email;
			}
		}
	}

	public String checkDate() {
		while (true) {
			try {

				String date = checkInputString();
				Date datef = new SimpleDateFormat("dd/MM/yyyy").parse(date);
				return date;
			} catch (ParseException ex) {
				System.out.println("Date to correct format(dd/MM/yyyy)");
				System.out.print("Date: ");
			}
		}
	}
}
