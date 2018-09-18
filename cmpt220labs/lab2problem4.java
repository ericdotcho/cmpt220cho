import java.util.Scanner;

public class lab2problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter charachter 1: ");
		String firstChar = input.next();
		System.out.println("Please enter character 2: ");
		String secChar = input.next();
		char x = firstChar.charAt(0);
		char y = secChar.charAt(0);
		int z = (int)(x + y);
		System.out.println("The result is: " + z);
	}

}
