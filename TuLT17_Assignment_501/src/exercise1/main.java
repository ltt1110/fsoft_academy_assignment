package exercise1;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
		System.out.println("=====Calculator Shape Program=====");
		Validation ch = new Validation();
		System.out.print("Please input side width of Rectangle: ");
		double width = ch.checkInputDouble();
		System.out.print("Please input length of Rectangle: ");
		double length = ch.checkInputDouble();
		System.out.print("Please input radius of Circle: ");
		double radius = ch.checkInputDouble();
		Triangle t;
		while (true) {
			System.out.print("Please input side A of Triangle: ");
			double a = ch.checkInputDouble();
			System.out.print("Please input side B of Triangle: ");
			double b = ch.checkInputDouble();
			System.out.print("Please input side C of Triangle: ");
			double c = ch.checkInputDouble();
			if (a + b > c && b + c > a && a + c > b) {
				t = new Triangle(a, b, c);
				break;
			} else {
				System.out.println("Re-input");
			}
		}
		Rectangle r = new Rectangle(width, length);
		Circle ci = new Circle(radius);
		r.printResult();
		ci.printResult();
		t.printResult();
	}
}
