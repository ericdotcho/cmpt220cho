import java.util.*;

public class lab9prob1 {

	public static void main(String[] args) {
		// makes a scanner
				Scanner x = new Scanner(System.in);

				// invoke getArray() method
				int[] array = getArray();

				// Prompts the user to input an index of the array
				System.out.print("Enter the index of the array: ");
				try {
					// outputs the corresponding array element value
					System.out.println("The corresponding element value is " + 
						array[x.nextInt()]);
				}
				catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Out of Bounds.");
				}
			}

			public static int[] getArray() {
				int[] array = new int[100];
				for (int i = 0; i < array.length; i++) {
					array[i] = (int)(Math.random() * 100) + 1;
				}
				return array;
			}
		}