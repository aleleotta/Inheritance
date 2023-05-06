package exercise5;

public class Triangle extends Poligon{
	private double side1 = 0;
	private double side2 = 0;
	private double side3 = 0;
	
	public Triangle(int sidesAmount) {
		super(sidesAmount);
	}

	public Triangle(int sidesAmount, double side1, double side2, double side3) {
		super(sidesAmount);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double area() {
		int result = 0;
		return result;
	}
	
	public String toString() {
		return "Type: Triangle\nSides: " + side1 + " , " + side2 + " , " + side3;
	}
	
}
