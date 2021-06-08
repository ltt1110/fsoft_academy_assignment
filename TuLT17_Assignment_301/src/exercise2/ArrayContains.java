package exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayContains {
	public static void main(String arg[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element:");
		n = sc.nextInt();

		String a[] = new String[n+1];
		System.out.println("enter   " + n + "  element");
		for (int i = 0; i <= n; i++) {
			a[i] = sc.nextLine();
		}
		System.out.println("enter sValue:");
		String sValue = sc.nextLine();

		List<String> list = Arrays.asList(a);
		if (list.contains(sValue)) {
			System.out.println(" Check '" + sValue + "' in Array: Contained!");
		} else {
			System.out.println(" Check '" + sValue + "' in Array: No Contain!");
		}

	}
}
