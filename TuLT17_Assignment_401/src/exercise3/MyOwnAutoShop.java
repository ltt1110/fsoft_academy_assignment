package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyOwnAutoShop {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Car> listCar = new ArrayList<>();

		listCar.add(new Sedan(200, 3000, "green", 25));
		listCar.add(new Ford(220, 2800, "black", 2018, 100));
		listCar.add(new Ford(210, 2900, "red", 2019, 80));
		while (true) {
			System.out.println("CAR\n" + "1.	Enter Truck\n" + "2.	Enter Ford\n" + "3.	Enter Sedan\n"
					+ "4.	Display all\n" + "5.	Exit");
			int a = Integer.parseInt(sc.nextLine());
			switch (a) {
			case 1:
				Truck t = new Truck();
				t.inputTruck();
				listCar.add(t);
				break;
			case 2:
				Ford f = new Ford();
				f.inputFord();
				listCar.add(f);
				break;
			case 3:
				Sedan s = new Sedan();
				s.inputSedan();
				listCar.add(s);
				break;
			case 4:
				int count = 1;
				for (Car c : listCar) {
					System.out.println("Car " + count + " : ");
					System.out.println(c);
					count++;
				}
				break;
			case 5:
				System.exit(0);
			}
		}

	}

}
