package exercise2;

public class Main {
	public static void main(String[] args) throws Exception {
		ManageEastAsiaCountries meac = new ManageEastAsiaCountries();
		Validation v = new Validation();
		Input i = new Input();
		while (true) {
			EastAsiaCountries eac = new EastAsiaCountries();
			i.Menu();
			int choice = 0;
			choice = v.CheckRange(1, 5);
			switch (choice) {
			case 1:
				meac.addCountryInformation(i.Input(eac));
				break;
			case 2:
				System.out.println("ID\t\tName\t\tTotal Area\t\tTerrain");
				meac.getRecentlyEnteredInformation();
				meac.display();
				break;
			case 3:
				System.out.println("Enter the name you want to search for: ");
				String name = v.checkString();
				System.out.println("ID\t\tName\t\tTotal Area\t\tTerrain");
				meac.searchInformationByName(name);
				break;
			case 4:
				System.out.println("ID\t\tName\t\tTotal Area\t\tTerrain");
				meac.sortInformationByAscendingOrder();
				meac.display();
				break;
			case 5:
				return;
			}
		}
	}
}
