package exercise2;

import java.io.IOException;

public class Input {
	public EastAsiaCountries Input(EastAsiaCountries eac) throws IOException {
		Validation v = new Validation();
		System.out.println("Enter code of country: ");
		eac.setCountryCode(v.checkString().toUpperCase());
		System.out.println("Enter name of country: ");
		eac.setCountryName(v.checkString());
		System.out.println("Enter total Area: ");
		eac.setTotalArea(v.CheckFloat(0));
		System.out.println("Enter terrain of country: ");
		eac.setCountryTerrain(v.checkString());
		return eac;
	}

	public void Menu() {
		System.out.println("\t\t\tMENU\t\t\t");
		System.out.println("=========================================================");
		System.out.println("1. Input the information of 11 countries in East Asia. ");
		System.out.println("2. Display the information of country you've just input. ");
		System.out.println("3. Search the information of country by user-entered name. ");
		System.out.println("4. Display the information of countries sorted name in ascending order. ");
		System.out.println("5. Exit");
		System.out.println("=========================================================");
		System.out.print("Enter your selection: ");
	}
}
