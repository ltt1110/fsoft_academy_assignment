package exercise2;

import java.util.Scanner;

public class main {

	public static int[] inputBills() {
		Validation v = new Validation();
		System.out.println("======= Shopping program =======");
		System.out.print("Input number of bill: ");
		int size = v.checkInputInt();
		int[] bills = new int[size];

		for (int i = 0; i < bills.length; i++) {
			System.out.print("Input value of bill " + (i + 1) + ": ");
			bills[i] = v.checkInputInt();
		}
		return bills;
	}

	public static void main(String[] args) {
		Wallet w = new Wallet();

		int[] bills = inputBills();

		w.inputWallet();
		int wallet = w.getWallet();

		w.printTotalAndResult(bills, wallet);
	}
}
