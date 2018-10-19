
public class lab6prob1main {

	public static void main(String[] args) {
		// Testing a square width of 40
		Square square1 = new Square(40);

		// Testing a square width of 35.9
		Square square2 = new Square(35.9);

		// Display the width, area, and perimeter of square1
		System.out.println(" Square 1:");
		System.out.println();
		System.out.println("Width:     " + square1.width);
		System.out.println("Area:      " + square1.getArea());
		System.out.println("Perimeter: " + square1.getPerimeter());

		// Display the width, area, and perimeter of square2
		System.out.println("\n Square 2:");
		System.out.println();
		System.out.println("Width:     " + square2.width);
		System.out.println("Area:      " + square2.getArea());
		System.out.println("Perimeter: " + square2.getPerimeter());
	}
}