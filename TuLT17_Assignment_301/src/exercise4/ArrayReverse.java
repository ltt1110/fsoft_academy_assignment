package exercise4;

import java.util.Scanner;

public class ArrayReverse {

	public static void reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		System.out.print("Reversed Array: ");
		for (int k = 0; k < n; k++) {
			System.out.print(b[k] + " ");
		}
	}

	public static void main(String[] args) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		len = sc.nextInt();

		int a[] = new int[len];
		System.out.println("enter   " + len + "  element");
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Original Array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
		reverse(a, a.length);
	}
}
