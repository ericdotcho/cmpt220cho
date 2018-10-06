import java.util.Scanner;

public class lab5problem7 {
    public static void main(String args[]) {
        int rows, cols;
        
	boolean isUpperTriangular = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        rows = input.nextInt();
        System.out.println("Enter number of columns : ");
        cols = input.nextInt();
        int inArray[][] = new int[rows][cols];
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                System.out.println("Enter element for array[" + (x + 1) + "," + (y + 1) + "] : ");
                inArray[x][y] = input.nextInt();
            }
        }
        System.out.println("You have entered : ");
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                System.out.print(inArray[x][y] + "\t");
            }
            System.out.println();
        }
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < i; y++) {
                if (inArray[x][y] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) {
                break;
            }
        }
        if(isUpperTriangular){
            System.out.println("Upper triangular matrix.");
        }else{
            System.out.println("Not an Upper triangular matrix.");
        }
    }
}