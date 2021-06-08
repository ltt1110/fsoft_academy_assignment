package exercise3;

public class Sedan extends Car {
	private int length;

	public Sedan() {

	}

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double getSalePrice() {
		if (length > 20) {
			return super.getRegularPrice() - super.getRegularPrice() * 5 / 100;
		} else {
			return super.getRegularPrice() - super.getRegularPrice() * 10 / 100;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " ,length=" + length + " ,sale price =" + getSalePrice();
	}

	public void inputSedan() {
		super.inputCar();
		System.out.println("Enter length: ");
		setLength(Integer.parseInt(sc.nextLine()));

	}
}
