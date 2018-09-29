import java.util.Scanner;

public class lab4prob7 {    
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter how many numbers in array");
       int numInArray = input.nextInt();
       
       String nums[] = new String[numInArray];
       for (int x = 0; x < nums.length; x++) {
    	   System.out.println("Enter each number individually: ");
    	   nums[x] = input.nextLine();
       }
       System.out.println("Original array length: "+nums.length);
       System.out.print("Array elements are: ");
       for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
		System.out.println("\nThe new length of the array is: "+array_sort(nums));
			
    }
    
    public static int array_sort(String[] nums) {
         int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1])
                nums[index++] = nums[i];
        }
	  return index;
    }
}