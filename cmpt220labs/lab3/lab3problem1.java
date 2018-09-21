import java.util.Scanner;

public class lab3problem1 {
        
   public static void main(String[] args) {
      
      int inputNumber;   // One of the integers input by the user.
      int sum;           // The sum of the positive integers.
      int count; 	// The number of positive integers.
      int evenCount; //The number of even integers.
      double avg;    // The average of the positive integers.
      
      sum = 0;
      count = 0;
      evenCount = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your first positive integer: ");
      inputNumber = input.nextInt();
      
      while (inputNumber != 0) {
         sum += inputNumber;   // Add inputNumber to running sum.
         count = count + 1;    // Count the input by adding 1 to count.
         if (inputNumber % 2 == 0) {
        	 evenCount++;      //Count the even numbers by adding 1 to even count
         }            
         System.out.print("Enter your next positive integer, or 0 to end: ");
         inputNumber = input.nextInt();
      }
      
      /* Display the result. */
      
      if (count == 0) {
         System.out.println("You didn't enter any data!");
      }
      else {
         avg = ((double)sum) / count;
         System.out.println();
         System.out.println("Number of even integers: " + evenCount);
         System.out.println("Total sum: " + sum);
         System.out.printf("Their average is %1.3f.\n", avg);
      }
 
   } // end main()
   
} // end class ComputeAverage