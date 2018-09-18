import java.util.Scanner;

public class lab2problem5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter string 1: ");
		String firstString=input.next();
		System.out.println("Please enter string 2: ");
		String secString=input.next();
		char a = firstString.charAt(0);
		char b = secString.charAt(0);
		if (a<b) {
			System.out.println(firstString);
			System.out.println(secString);
		}else {
			System.out.println(secString);
			System.out.println(firstString);
		}
				
	}

}

