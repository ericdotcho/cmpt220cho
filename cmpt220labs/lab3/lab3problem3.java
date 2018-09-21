
public class lab3problem3 {
	
		public static void main(String[] args) {
			
			int numbLine = 20; //Number of characters per line
			int count = 0;	// Count the number of characters set at 0

			// Printing the ASCII characters from 1 to 100
			for (int i = 1; i <= 100; i++) {
				count++;	
				// Display 10 characters per line
				if (count % 20 == 0)
					System.out.println((char)i);
				else
					System.out.print((char)i + " ");	
			}
			System.out.println();
		}
	}