package exercise3;

public class Truck extends Car {
	private int weight;

	public Truck() {

	}

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			return super.getRegularPrice() - super.getRegularPrice() * 10 / 100;
		} else {
			return super.getRegularPrice() - super.getRegularPrice() * 20 / 100;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " ,weight=" + weight + " ,sale price =" + getSalePrice();
	}

	public void inputTruck() {
		super.inputCar();
		System.out.println("Enter weight: ");
		setWeight(Integer.parseInt(sc.nextLine()));
	}

}
