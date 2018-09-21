import java.util.Scanner;

public class lab2problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a minimum limit: ");
		int min = input.nextInt();
		System.out.println("Please enter a maximum limit: ");
		int max = input.nextInt();
		int x = (int)(max - min);
		int y = (int) ((Math.random() * x) + min);
		System.out.println(y);
	}

}
