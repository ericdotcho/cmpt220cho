// Implements Triangle class
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	//makes default triangle
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Returns area of the triangle 
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// Returns perimeter of the given triangle 
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	//returns a description in the String type
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}

}