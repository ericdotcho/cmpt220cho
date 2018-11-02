import java.util.Scanner;
import java.util.ArrayList;

public class lab8prob4 {
	
	//main method
	public static void main(String[] args) {
		
		//creates input scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		//makes an ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		//asks the user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		//sorts numbers
		sort(list);

		// Display list in increasing order
		System.out.println(list.toString());
	}

	//sorts an ArrayList of integers 
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}