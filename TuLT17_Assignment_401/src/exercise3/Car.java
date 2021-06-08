package exercise3;

import java.util.Scanner;

public class Car {

	private int speed;
	private double regularPrice;
	private String color;

	public double getSalePrice() {
		return 0.0;
	}

	public Car() {

	}

	public Car(int speed, double regularPrice, String color) {

		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color;
	}

	Scanner sc = new Scanner(System.in);

	public void inputCar() {
		System.out.println("Enter speed: ");
		setSpeed(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter regularPrice: ");
		setRegularPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter color: ");
		setColor(sc.nextLine());
	}

}
