import java.util.Scanner;

public class lab8prob1 {
	private static Scanner threeSides;

	public static void main(String[] args) {
		threeSides = new Scanner(System.in);

		// Prompt the user to enter three sides of the triangle
		System.out.print("Enter three side of the triangle: ");
		double side1 = threeSides.nextDouble();		
		double side2 = threeSides.nextDouble();		
		double side3 = threeSides.nextDouble();

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = threeSides.next();

		// Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = threeSides.nextBoolean();

		// Create triangle object with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
}
