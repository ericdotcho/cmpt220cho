import java.util.Scanner;

public class lab2problem1 {
	public static void main( String args[] )    
    {
        // create Scanner to obtain input from command window       
        Scanner input = new Scanner(System.in);
        int number1; // first number to compare       
        int number2; // second number to compare  
      
        System.out.print( "Input first integer: " ); // prompt        
        number1 = input.nextInt(); // read first number from user   
 
        System.out.print( "Input second integer: " ); // prompt        
        number2 = input.nextInt(); // read second number from user               
        
        if ( number1 == number2 )           
            System.out.println(number1 + " is equal to " + number2 +"? True"); 
        else {
            System.out.println(number1 + " is equal to " + number2 +"? False"); 
        }   
        if ( number1 != number2 )
        	System.out.println(number1 + " is not equal to " + number2 + "? True");
        else {
        	System.out.println(number1 +" is not equal to " + number2 + "? False");
        }
        if ( number1 < number2 )          
            System.out.println(number1 + " is less than " + number2 + "? True"); 
        else {
        	System.out.println(number1 + " is less than " + number2 + "? False");
        }
        if ( number1 > number2 )          
            System.out.println(number1 + " is greater than " + number2 + "? True"); 
        else {
        	System.out.println(number1 + " is greater than " + number2 + "? False");
        }
        if ( number1 <= number2 )          
            System.out.println(number1 + " is less than or equal to " + number2 + "? True");  
        else {
        	System.out.println(number1 + " is less than or equal to " + number2 + "? False");  
        }
        if ( number1 >= number2 )          
            System.out.println(number1 + " is greater than or equal to " + number2 + "? True");
        else {
        	System.out.println(number1 + " is greater than or equal to " + number2 + "? False");
        }
	}
}