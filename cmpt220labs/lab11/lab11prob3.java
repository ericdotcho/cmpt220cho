import java.util.*;

public class lab11prob3 {
//main method
	public static void main(String[] args) {
		// makes a Scanner
		Scanner s = new Scanner(System.in);

		// asks user to enter a string and a character
		System.out.print("Enter a string and a character: ");
		String[] str = s.nextLine().split("[ ]");

		// screen shows the number of times the character occurs in the string
		System.out.println("The character \'" + str[1] + "\' occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}

	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}

	private static int count(String str, char a, int high) {
		if (high < 0) // Base case
			return 0;
		else if (str.charAt(high) ==  a) {
			return 1 + count(str, a, high - 1); // Recursive call
		}
		else
			return count(str, a, high - 1); // Recursive call
	}
}

