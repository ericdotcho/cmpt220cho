import java.util.Scanner;

public class lab3problem5 {

 public static void main(String[] args)
    {
        Scanner avgInput = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = avgInput.nextDouble();
        System.out.print("Input the second number: ");
        double y = avgInput.nextDouble();
        System.out.print("Input the third number: ");
        double z = avgInput.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
