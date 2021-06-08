package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	public static void main(String arg[]) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		len = sc.nextInt();

		int a[] = new int[len];
		System.out.println("enter   " + len + "  element");
		for (int i = 0; i < len; i++) {

			a[i] = sc.nextInt();

			System.out.println("Do you want to continue? Y/y or N/n");
			if (sc.nextLine().equals("N") || sc.nextLine().equals("n")) {
				break;
			}
		}
		System.out.println("enter value");
		int value = sc.nextInt();

		int count = 0;
		System.out.println("Amount of frequence:");
		for (int i = 0; i < len; i++) {
			if (value == a[i]) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println("Indexs:");
		for (int i = 0; i < len; i++) {
			if (value == a[i]) {
				System.out.print(i + " ");
			} else {
				System.out.print("Not found");
			}
		}
	}
}
