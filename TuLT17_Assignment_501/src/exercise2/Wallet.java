package exercise2;

public class Wallet extends Person {
	private int wallet;

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}



	public  void inputWallet() {
		Validation v = new Validation();
		System.out.print("Input value of wallet: ");
		
		setWallet(v.checkInputInt());
	}

	
	public  int calcTotal(int[] bills) {
		int total = 0;
		for (int i = 0; i < bills.length; i++) {
			total += bills[i];
		}
		return total;
	}

	
	public  boolean payMoney(int total, int wallet) {
		if (total > wallet) {
			return false;
		} else {
			return true;
		}
	}

	
	public  void printTotalAndResult(int[] bills, int wallet) {
		int total = calcTotal(bills);
		System.out.println("This is total of bill: " + total);
		if (payMoney(total, wallet)) {
			System.out.println("You can buy it");
		} else {
			System.out.println("You can't buy it.");
		}
	}
}
