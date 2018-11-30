import java.util.*;

public class lab11prob4 {
	public static void main(String[] args) {
//creates a Scanner
		Scanner s = new Scanner(System.in);

//asks the user to enter a list of characters
		System.out.println("Enter a list of characters in with no spaces between each character: ");
		String str = s.nextLine();
		char[] chars = new char[str.length() - 1];
		for (int i = 0; i < chars.length; i++)
			chars[i] = str.charAt(i);
		char ch = str.charAt(str.length() - 1);

//displays to user the number of occurrences of the character
		System.out.println("The character \"" + ch + "\" occurs " 
			+ count(chars, ch) + " times in the list \"" + 
			str.substring(0, str.length() - 1) + "\".");
	}

	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}
//recursive helper method
	public static int count(char[] chars, char ch, int high) {
		if (high < 0) 	//base case
			return 0;
		else if (chars[high] == ch) 
			return 1 + count(chars, ch, high - 1); //recursive call
		else
			return count(chars, ch, high - 1); //recursive call
	}

}
