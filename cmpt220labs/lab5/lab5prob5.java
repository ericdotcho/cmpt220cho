import java.util.Scanner;

public class lab5problem5 {
	public static void main(String[] args) {
		System.out.println("Enter Dimensions of Matrix");
		Scanner input = new Scanner(System.in);
		int y = input.nextInt();
		int array[][] = new int[y][y];
		System.out.println("Enter matrix:");
	 	for(int x = 0; x < n; x++){
	   	    for(int j = 0; j < y; j++) {
	        	array[x][j] = input.nextInt();
	            }
	  	}
	 	System.out.println("The matrix before Transpose is ");
	  	for(int x = 0; x < y; x++){
	      	    for(int j = 0; j < y; j++){
	          	System.out.print(array[x][j]+” ");
	            }
	            System.out.println(" ");
	        }
	 	System.out.println("The matrix after Transpose is ");
	  	for(int x = 0; x < y; x++){
	      	    for(int j = 0; j < y; j++){
	                System.out.print(array[j][x]+” ");
	            }
	            System.out.println(" ");
	        }
	}
	public static double[][] transposeMatrix(double [][] m){
        double[][] temp = new double[m[0].length][m.length];
        for (int x = 0; x < m.length; x++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][x] = m[x][j];
        return temp;
    }
}
