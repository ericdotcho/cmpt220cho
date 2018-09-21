public class lab3problem2 {
	public static void main(String[] args) {
		int numbLine = 10;	  // Number of numbers in each line displayed
		int count = 0;        // Count the number divisible by 5 or 7, but not both

		for (int x = 100; x <= 500; x++) {
			if (x % 5 == 0 ^ x % 7 == 0)    //divisible by 5 or 7 but not both
			{
				count++;
				if (count % numbLine == 0)
					System.out.println(x);
				else
					System.out.print(x + " ");	//divided by a single space		
			}
		}
		System.out.println();
	}
}
