package exercise1;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Manage m = new Manage();
		while (true) {
			int choice = m.mennu();
			switch (choice) {
			case 1:
				m.normalCalculator();
				break;
			case 2:
				m.BMICalculator();
				break;
			case 3:
				System.out.println("exit");
				return;
			}
		}

	}
}
