import java.util.*;

public class lab11prob2 {
//main method
	public static void main(String[] args) {
		//makes a Scanner
		Scanner s = new Scanner(System.in);

		// Prompt the user to enter a list of eight integers
		System.out.print("Enter eight integers: ");
		int[] list = new int[8]; // Create array of eight integers
		for (int x = 0; x < list.length; x++) {
			list[x] = s.nextInt();
		}

		//outputs the largest element
		System.out.println("The largest element is " + max(list));
	}

	public static int max(int[] list) {
		int max = list[list.length - 1]; // largest number
		int index = list.length - 1; 
		return max(list, index, max);
	}

	private static int max(int[] list, int index, int max) {
		if (index < 0)     //base case
			return max;
		else if (list[index] > max) { 
			return max(list, index - 1, list[index]);   //recursive call
		}
		else
			return max(list, index - 1, max);    //recursive call
	}
}
