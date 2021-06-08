package fa.training.bussiness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import fa.training.entity.Airport;
import fa.training.entity.Fixedwing;
import fa.training.entity.Helicopter;
import fa.training.util.Validation;

public class Management {

	Airport ap = new Airport(4);
	Validation v = new Validation();
	List<Airport> listAP = new ArrayList<>();
	Fixedwing f = new Fixedwing();
	Helicopter h = new Helicopter();
	HashMap<String, Fixedwing> listOfFixedWingId = new HashMap<>();
	HashMap<String, Helicopter> listOfHelicopterId = new HashMap<>();
	HashMap<String, Fixedwing> listOfFixedWingId1 = new HashMap<>();
	HashMap<String, Helicopter> listOfHelicopterId1 = new HashMap<>();

	public void doManagement() {
		listOfFixedWingId.put("FW22222", new Fixedwing("FW22222", "a", 4, 4, 4, "CAG", 4));
		listOfFixedWingId.put("FW11111", new Fixedwing("FW11111", "a", 4, 4, 4, "CAG", 4));
		listOfHelicopterId.put("RW44444", new Helicopter("RW44444", "a", 4, 4, 4, 4));
		listOfHelicopterId.put("RW33333", new Helicopter("RW33333", "a", 4, 4, 4, 4));

		listOfFixedWingId1.put("FW55555", new Fixedwing("FW55555", "a", 6, 6, 6, "CAG", 5));
		listOfHelicopterId1.put("RW66666", new Helicopter("RW66666", "a", 6, 6, 6, 6));
		listAP.add(new Airport("AP22222", "hihi", 4, 4, 4, 4, listOfFixedWingId, listOfHelicopterId));
		listAP.add(new Airport("AP11111", "alo", 6, 6, 6, 6, listOfFixedWingId1, listOfHelicopterId1));

		while (true) {
			System.out.println("1. Input data from keyboard\n" + "2. Airport management\n"
					+ "3. Fixed wing airplane management\n" + "4. Helicopter management group\n" + "5. Close program");
			System.out.print("Enter your choice:");
			int a = v.checkInputIntLimit(1, 5);
			switch (a) {
			case 1:
				ap.input();
				listAP.add(ap);
				break;
			case 2:
				doAirportManagement();
				break;
			case 3:
				doFixedwingManagement();
				break;
			case 4:
				doHelicopterManagement();
				break;
			case 5:
				System.out.println("goodbye");
				return;

			}

		}

	}

	public void doAirportManagement() {
		System.out.println(
				"1. Display list of all airport information, sorted by airport ID\n2. Display the status of one airport, selected by airport ID\n3. Remove airport");
		int a = v.checkInputIntLimit(1, 3);

		switch (a) {
		case 1:
			Collections.sort(listAP);
			for (Airport ap1 : listAP) {
				System.out.println(ap1.toString());
				ap1.displayLW();
				ap1.displayRW();
				System.out.println();
			}

			break;
		case 2:

			System.out.println("Enter airport id:");
			String id = v.checkInputString();
			for (Airport ap1 : listAP) {
				if (ap1.getID().equals(id)) {
					System.out.println(ap1.toString());

					System.out.println();
				}
			}

			break;
		case 3:
			System.out.println("Enter airport id you want remove:");
			String id1 = v.checkInputString();
			for (Airport ap1 : listAP) {
				if (ap1.getID().equals(id1)) {
					int index = listAP.indexOf(ap1);
					listAP.remove(index);
					System.out.println("remove success");
					break;
				}
			}
			break;
		}
	}

	public void doFixedwingManagement() {

		System.out.println(
				"1. Display list of all fixed wing\n2. Remove fixed wing\n3. Change plane type and min needed runway size of fixed wing");
		int a = v.checkInputIntLimit(1, 3);

		switch (a) {
		case 1:
			for (Airport ap1 : listAP) {
				System.out.println("Airport id:" + ap1.getID() + "-Airport name:" + ap1.getName() + " :");
				ap1.displayLW();
				System.out.println();
			}
			break;
		case 2:

			System.out.println("Enter fixedwing id you want to delete:");
			String id = v.checkInputString();
			for (Airport ap1 : listAP) {
				ap1.deteleLW(id);
			}
			System.out.println("remove successful");
			break;
		case 3:
			System.out.println("Enter fixedwing id you want to update:");
			String id1 = v.checkInputString();
			System.out.println("Enter planeType (CAG or LGR or PRV):");
			String a1 = v.checkType();
			System.out.println("Enter minRunwaySize:");
			float a2 = v.checkInputFloat();

			for (Airport ap1 : listAP) {

				ap1.updateLW(id1, a1, a2);

				break;
			}
			System.out.println("update successful");
			break;
		}
	}

	public void doHelicopterManagement() {

		System.out.println("1. Display list of all helicopters \n2. Remove helicopter\n");
		int a = v.checkInputIntLimit(1, 2);

		switch (a) {
		case 1:
			for (Airport ap1 : listAP) {
				System.out.println("Airport id:" + ap1.getID() + "-Airport name:" + ap1.getName() + " :");
				ap1.displayRW();
				System.out.println();
			}
			break;
		case 2:

			System.out.println("Enter helicopter id you want to delete:");
			String id = v.checkInputString();
			for (Airport ap1 : listAP) {

				ap1.deteleRW(id);
			}
			System.out.println("remove successful");
			break;

		}
	}

}