public class Square {
	double width;	// Width of square

	// A no-arg constructor that makes a default square 
	Square() {
		width = 1;
	} 

	// Constructor that creates a square with the specified width
	Square(double newWidth) {
		width = newWidth;
	}

	// Returns the area of this square 
	double getArea() {
		return width * width; 
	}

	// Returns the perimeter of this square 
	double getPerimeter() {
		return 4 * width;
	}
}
