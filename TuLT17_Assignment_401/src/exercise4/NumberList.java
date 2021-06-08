package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercise3.Car;
import exercise3.Ford;
import exercise3.Sedan;
import exercise3.Truck;

public class NumberList {
	static Scanner sc = new Scanner(System.in);

	public static int checkInputInt() {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine());
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Please input a number.");
				System.out.print("Enter again: ");
			}
		}
	}

	public List<Integer> input() {
		System.out.print("Enter length of array: ");
		List<Integer> listNumber = new ArrayList<Integer>();
		int length = checkInputInt();
		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			listNumber.add(checkInputInt());
		}
		return listNumber;
	}

	public void print(List<Integer> listNumber) {
		for (int i = 0; i < listNumber.size(); i++) {
			System.out.print(listNumber.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n1.	QuickSort\n" + "2.	SelectionSort\n" + "3.	InsertSort\n" + "4.	Exit");
			int a = checkInputInt();
			switch (a) {
			case 1:
				QuickSort quickSort = new QuickSort();
				quickSort.sort();
				break;
			case 2:
				SelectionSort selectionSort = new SelectionSort();
				selectionSort.sort();
				break;
			case 3:
				InsertSort insertSort = new InsertSort();
				insertSort.sort();
				break;
			case 4:
				System.exit(0);
			}
		}
	}

}
