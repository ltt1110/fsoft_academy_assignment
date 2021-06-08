package exercise1;

public class SumAverageRunningInt {

	public static void main(String arg[]) {
		int n = 100;
		int lowerbound = 1;
		int upperbound = 100;
		double res = 0;
		int a[] = new int[n];
		for (int i = lowerbound - 1; i < upperbound; i++) {
			a[i] = i + 1;
		}
		for (int i = lowerbound - 1; i < upperbound; i++) {
			res = res + a[i];
		}
		
		System.out.println("Average of all 100 first numbers: " + res / n);
	}

}
