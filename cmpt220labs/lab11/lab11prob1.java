import java.util.Scanner;

public class lab11prob1 {
//main method
	public static void main(String[] args) {
		//makes a Scanner
		Scanner s = new Scanner(System.in);

		//calls upon user to enter an integer
		System.out.print("Enter an integer: ");
		long n = s.nextLong();

		//shows the sum
		System.out.println("The sum of " + n + " = " + sumDigits(n));
	}

	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	private static int sumDigits(long n, int sum) {
		if (n == 0) 	//base case
			return sum;
		else 		//recursive call
			return sumDigits(n / 10, sum + (int)(n % 10));
	}
}
