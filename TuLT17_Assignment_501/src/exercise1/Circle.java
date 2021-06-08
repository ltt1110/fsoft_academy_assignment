package exercise1;

public class Circle  extends Shape{
	 private double radius;

	    public Circle() {
	    }

	    public Circle(double Radius) {
	        this.radius = Radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double Radius) {
	        this.radius = Radius;
	    }
	    

	    @Override
	    public double getPerimeter() {
	        return Math.PI*radius*2;
	    }

	    @Override
	    public double getArea() {
	        return Math.PI*radius*radius;
	    }

	    @Override
	    public void printResult() {
	        System.out.println("-----Circle-----");
	        System.out.println("Radius: "+radius);
	        System.out.println("Area: " +getArea());
	        System.out.println("Perimeter: "+getPerimeter());
	    }
}
