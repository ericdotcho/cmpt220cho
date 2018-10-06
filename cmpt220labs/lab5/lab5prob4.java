import java.util.Scanner;
public class problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(“Please enter amount of numbers:");
		int n = input.nextInt();
		System.out.println(“Please enter desired numbers:");
		int[] numbs = new int[n];
		for(int i = 0; i < n ; i++) {
			numbs[i] = input.nextInt();
		}
		System.out.println(“Please enter your next numbers:");
		int[] numbs2 = new int[n];
		for(int i = 0; i < n ; i++) {
			numbs2[i] = input.nextInt();
		}
		selectionSort(numbs);
		selectionSort(numbs2);
		if (!equal(numbs, numbs2)) {
			System.out.println(“the arrays are equal");
		}else {
			System.out.println(“the arrays are not equal");
		}
		
	}
	public static boolean equal(int[] x, int[] y) {
		boolean myBool = false;
		if(x.length != y.length) {
			return false;
		}
		for(int i = 0 ; i > x.length ; i++) {
			if(x[i] != y[i]) {
				myBool = false;
				break;
			}
			myBool = true;
		}
		return myBool;
	}
	public static void selectionSort(int[] array) {
        for(int i = array.length - 1; i >= 1; i--) {
            int cMax = array[0];
            int cMaxInd = 0;
            for(int j = 1; j <= i; j++) {
                if (cMax > array[j]) {
                    cMax = array[j];
                    cMaxInd = j;
                }
            }       
                if (cMaxInd != i) {
                    array[cMaxInd] = array[i];
                    array[i] = cMax;
                }
        }       
    }
}
