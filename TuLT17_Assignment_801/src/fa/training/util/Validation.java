package fa.training.util;

import java.util.ArrayList;
import java.util.Scanner;

import fa.training.entity.Airport;

public class Validation {
	final Scanner in = new Scanner(System.in);
	final String FW = "^[FW].[0-9]{5}$";
	final String RW = "^[RW].[0-9]{5}$";

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

	public float checkInputFloat() {
		while (true) {
			try {

				float result = Float.parseFloat(in.nextLine());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Must be input int");

			}
		}
	}

	public int checkInputInt() {
		while (true) {
			try {

				int result = Integer.parseInt(in.nextLine());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Must be input float");

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

	public String checkID(String s, String mess) {
		while (true) {

			String id = checkInputString();
			if (!id.matches(s)) {
				System.out.println(mess);
				System.out.print("ID: ");
			} else {

				return id;
			}
		}
	}

	public String checkModel() {
		while (true) {

			String s = checkInputString();

			if (s.length() > 40) {
				System.out.println("The model size is maximum 40 characters.");
				System.out.print("Model: ");
			} else {

				return s;
			}
		}
	}

	public String checkType() {
		while (true) {

			String s = checkInputString();

			if (!(s.equals("CAG") || s.equals("LGR") || s.equals("PRV"))) {
				System.out.println("Type must is CAG or LGR or PRV");
				System.out.print("Plane type: ");
			} else {

				return s;
			}
		}
	}

	public boolean checkIdExist(ArrayList<Airport> la, String id) {
		for (Airport a : la) {
			if (id.equalsIgnoreCase(a.getID())) {
				return false;
			}
		}
		return true;
	}

}
