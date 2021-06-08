package exercise2;

import java.util.ArrayList;
import java.util.Collections;

public class ManageEastAsiaCountries {
	public ArrayList<EastAsiaCountries> eastAsiaList;

	public ManageEastAsiaCountries() {
		this.eastAsiaList = new ArrayList();
	}

	public void addCountryInformation(EastAsiaCountries eac) throws Exception {
		if (eac == null) {
			throw new Exception("Country can not be null");
		}
		eastAsiaList.add(eac);
	}

	public ArrayList<EastAsiaCountries> getRecentlyEnteredInformation() {
		return eastAsiaList;
	}

	public ArrayList searchInformationByName(String name) {
		ArrayList<EastAsiaCountries> reportList = new ArrayList();
		for (EastAsiaCountries eastAsiaCountries : eastAsiaList) {
			if (eastAsiaCountries.getCountryName().trim().equalsIgnoreCase(name.trim())) {
				reportList.add(eastAsiaCountries);
			}
		}
		for (EastAsiaCountries eastAsiaCountries : reportList) {
			System.out.println(eastAsiaCountries);
		}
		return reportList;
	}

	public ArrayList<EastAsiaCountries> sortInformationByAscendingOrder() {
		Collections.sort(eastAsiaList);
		return eastAsiaList;
	}

	public void display() {
		for (EastAsiaCountries eac : eastAsiaList) {
			System.out.println(eac);
		}
	}
}
