
public class lab4prob1 {
	public static void main(String[] args) {
		System.out.println(
			"\nInches    Meters    |     Meters     Inches\n" +
			"----------------------------------------------");
		for (double inches = 1.0, cms = 1.0; inches <= 50 && cms <= 251; inches++, cms += 5) {
			System.out.printf("%4.1f     ", inches);
			System.out.printf("%6.3f", inchToCm(cms));
			System.out.print("     |     ");
			System.out.printf("%-11.1f", cms);
			System.out.printf("%7.3f\n", cmToInch(inches));
		}
	}
	
	public static double inchToCm(double cm) {
		return 2.54 * cm;
	}

	public static double cmToInch(double Inch) {
		return Inch / 2.54;
	}
}