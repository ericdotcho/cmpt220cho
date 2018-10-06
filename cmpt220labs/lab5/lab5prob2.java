import java.util.Scanner;

public class lab5problem2 {
	public static void main(String[] args) {
		Scanner amount = new Scanner(System.in);
		System.out.println("enter amount of numbers:");
		int x = amount.nextInt();
		System.out.println("enter your numbers:");
		double[] numbs = new double[x];
		for(int y = 0; y < x ; y++) {
			numbs[y] = amount.nextDouble();
		}
		System.out.println(mean(numbs));
		System.out.println(deviation(numbs));
	}
	public static double deviation(double[] array) {
		double m = mean(array);
		double sdev = 0;
		double sum = 0;
		for(int y = 0 ; y < array.length ; y++) {
			sum += Math.pow(array[y] - m, 2);
			sdev = Math.sqrt(sum/array.length);
		}
		return sdev;		
	}	
	public static double mean(double[] array) {
		double m = 0;
		double sum = 0;
		for(int y = 0 ; y < array.length ; y++) {
			sum += array[y];
			m = sum/array.length;
		}
			
		return m;
	}				
}
