package fa.training.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import fa.training.util.Validation;

public class Airport implements Comparable<Airport> {

	private String ID;
	private String name;
	private float runwaySize;
	private int maxfixedWingParkingPlace;
	private int maxRotatedWingParkingPlace;
//private List<String> listOfFixedWingId;
//private List<String> listOfHelicopterId;
	private final int numberOfAirplane;
	private HashMap<String, Fixedwing> listOfFixedWingId;
	private HashMap<String, Helicopter> listOfHelicopterId;
	private List<Airplane> airplanes;

	public Airport(int numberOfAirplane) {
		super();
		this.numberOfAirplane = numberOfAirplane;
	}

	public Airport(String iD, String name, float runwaySize, int maxfixedWingParkingPlace,
			int maxRotatedWingParkingPlace, int numberOfAirplane, HashMap<String, Fixedwing> listOfFixedWingId,
			HashMap<String, Helicopter> listOfHelicopterId) {
		super();
		ID = iD;
		this.name = name;
		this.runwaySize = runwaySize;
		this.maxfixedWingParkingPlace = maxfixedWingParkingPlace;
		this.maxRotatedWingParkingPlace = maxRotatedWingParkingPlace;
		this.numberOfAirplane = numberOfAirplane;
		this.listOfFixedWingId = listOfFixedWingId;
		this.listOfHelicopterId = listOfHelicopterId;
	}

	Fixedwing f = new Fixedwing();
	Helicopter h = new Helicopter();

	public boolean addFixedWing(final Airplane airplane) {
		listOfFixedWingId.put(f.getID(), (Fixedwing) airplane);

		// airplanes.addAll(Arrays.asList(airplane));
		return true;
	}

	public boolean addHelicopter(final Airplane airplane) {
		listOfHelicopterId.put(h.getID(), (Helicopter) airplane);
		return true;
	}

	public void input() {
		listOfFixedWingId = new HashMap<>();
		listOfHelicopterId = new HashMap<>();
		Validation v = new Validation();
		System.out.println("Enter id (AP + 5 digits):");
		setID(v.checkID("^[AP].[0-9]{5}$", "Airport ID must is correct format"));
		System.out.println("Enter name:");
		setName(v.checkInputString());
		System.out.println("Enter runwaySize:");
		setRunwaySize(v.checkInputFloat());
		System.out.println("Enter maxfixedWingParkingPlace");
		setMaxfixedWingParkingPlace(v.checkInputInt());
		System.out.println("Enter maxRotatedWingParkingPlace");
		setMaxRotatedWingParkingPlace(v.checkInputInt());
		System.out.println("-----Enter 4 airplane-----");
		String x;
		int count = 0;
		do {
			System.out.println("1. Fixedwing\n2. Helicopter\n");
			int a = v.checkInputIntLimit(1, 2);

			switch (a) {
			case 1:
				f.input();
				if (f.getMinRunwaySize() > getRunwaySize()) {
					System.out.println("MinRunwaySize must <= RunwaySize of airport");
					System.out.println("cannot add");
					break;
				}

				if (!addFixedWing(f)) {
					System.out.println("cannot add");

				} else {
					System.out.println("add successfull");
					count++;
				}
				break;
			case 2:

				h.input();
				if (h.getMaxTakeoffWeight() > 1.5 * h.getEmptyWeight()) {
					System.out.println("MaxTakeoffWeight must <= 1.5*EmptyWeight");
					System.out.println("cannot add");
					break;
				}

				if (!addHelicopter(h)) {
					System.out.println("cannot add");
				} else {
					System.out.println("add successfull");
					count++;
				}

				break;

			}
			System.out.println("Do you want continue to input airplane (Y/N)?: ");
			x = v.checkInputString();
		} while (x.charAt(0) == 'Y' || x.charAt(0) == 'y' || count == 4);

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRunwaySize() {
		return runwaySize;
	}

	public void setRunwaySize(float runwaySize) {
		this.runwaySize = runwaySize;
	}

	public List<String> getListOfFixedWingId() {
		return listOfFixedWingId.keySet().stream().collect(Collectors.toList());
	}

	public List<String> getListOfHelicopterId() {
		return listOfHelicopterId.keySet().stream().collect(Collectors.toList());
	}

	public int getNumberOfAirplane() {
		return numberOfAirplane;
	}

	public int getMaxfixedWingParkingPlace() {
		return maxfixedWingParkingPlace;
	}

	public void setMaxfixedWingParkingPlace(int maxfixedWingParkingPlace) {
		this.maxfixedWingParkingPlace = maxfixedWingParkingPlace;
	}

	public int getMaxRotatedWingParkingPlace() {
		return maxRotatedWingParkingPlace;
	}

	public void setMaxRotatedWingParkingPlace(int maxRotatedWingParkingPlace) {
		this.maxRotatedWingParkingPlace = maxRotatedWingParkingPlace;
	}

	@Override
	public String toString() {
		return "Airport ID=" + ID + ", name=" + name + ", runwaySize=" + runwaySize + ", maxfixedWingParkingPlace="
				+ maxfixedWingParkingPlace + ", maxRotatedWingParkingPlace=" + maxRotatedWingParkingPlace
				+ ", numberOfAirplane=" + numberOfAirplane;
	}

	public void displayLW() {

		Collection<Fixedwing> values = listOfFixedWingId.values();
		List<Fixedwing> listOfValues = new ArrayList<Fixedwing>(values);

		for (Fixedwing f : listOfValues) {
			System.out.println(f);
		}

	}

	public void deteleLW(String id) {

		listOfFixedWingId.remove(id);
	}

	public void updateLW(String id, String a1, float a2) {
		Validation v = new Validation();

		Fixedwing f = listOfFixedWingId.get(id);

		listOfFixedWingId.replace(id, new Fixedwing(id, f.getModel(), f.getCruiseSpeed(), f.getEmptyWeight(),
				f.getMaxTakeoffWeight(), a1, a2));

		System.out.println(listOfFixedWingId.get(id));

	}

	public void deteleRW(String id) {

		listOfHelicopterId.remove(id);
	}

	public void displayRW() {

		Collection<Helicopter> values = listOfHelicopterId.values();
		List<Helicopter> listOfValues = new ArrayList<Helicopter>(values);

		for (Helicopter h : listOfValues) {
			System.out.println(h);
		}

	}

	@Override
	public int compareTo(Airport o) {

		return this.getID().compareTo(o.getID());
	}

}
