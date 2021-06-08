package exercise3;

public class Ford extends Car {
	private int year;
	private int manufacturerDiscount;

	public Ford() {

	}

	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	public double getSalePrice() {
		return super.getRegularPrice() - manufacturerDiscount;
	}

	@Override
	public String toString() {
		return super.toString() + " ,year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + ", sale price ="
				+ getSalePrice();
	}

	public void inputFord() {
		super.inputCar();
		System.out.println("Enter year: ");
		setYear(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter manufacturerDiscount:");
		setManufacturerDiscount(Integer.parseInt(sc.nextLine()));
	}
}
