package exercise5;

public class Rectangle extends Poligon{
	private double side1 = 0;
	private double side2 = 0;
	
	public Rectangle(int sidesAmount) {
		super(sidesAmount);
	}

	public Rectangle(int sidesAmount, double side1, double side2) {
		super(sidesAmount);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double area() {
		double result = 0;
		result = side1 * side2;
		return result;
	}
	
	public String toString() {
		return "Type: Rectangle\nSides: " + side1 + " , " + side2;
	}
	
}
