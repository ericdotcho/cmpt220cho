import java.util.Scanner;

public class lab5problem1 {
	public static void main(String[] args) {
		Scanner 10numbs = new Scanner(System.in);
		System.out.println("enter 10 numbers: ");
		double[] numbs = new double[10];
		for(int x = 0; x < 10 ; x++) {
			numbs[x] = 10numbs.nextDouble();
		}
		System.out.println(max(numbs));
	}
	public static double max(double[] array) {
		double cMax = array[0];
		for(int x = 0; x < array.length ; x++) {
			if( array[x] > cMax ) {
				cMax = array[x];
				}
			}
		return cMax;	
	}
	
}
