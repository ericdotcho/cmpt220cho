import java.util.Scanner;

public class lab01cho {
	public static void main(String[] args) {
  //Problem 1
	  
		double a = 15.4*6.5-4.3*3; //numerator equation
		double b = 46.3-3.5;		//denomintor equation
		System.out.println(a/b);	//combined in output statement
  
  //Problem 2
		
		double pi = 0;   //"pi" the variable is set to zero to set origin of loop
		double y = 1;   //"y" variable is set to one to act as numerator for all fractions
		int limit = 1000000;
		for (int x = 1; x < limit; x = x+2)   //for loop used to repeat the addition and subtraction
		{
			pi += y/x;	 //the denominator goes up by two each time the loop runs
			y = -y;		//alternates the operator between each fraction
		}
		System.out.println("Pi equals " + pi * 4);   //output of pi
	
  //Problem 3
		
		Scanner input = new Scanner(System.in);             //scanner for user input
		System.out.println("Enter a value for ounces: ");    //asking for input value
		double NumOz = input.nextDouble();       //input read as a double type
		double NumG = NumOz * 28.3495;           //conversion from ounces to grams
		System.out.println(NumOz + " ounces is " + NumG);  //final output of ounces in grams

  //Problem 4
		
		Scanner SpecRel = new Scanner(System.in);
		System.out.println("Please enter a value for mass in kilograms: ");
		double NumKilo = SpecRel.nextDouble();
		double c = 299972458.0;
		double nrg = (NumKilo * (c*c));
		System.out.println("Energy equals " + nrg);
  }
}

