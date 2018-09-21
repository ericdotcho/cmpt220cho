import java.util.Scanner;

public class lab3problem6 {
  
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the desired string: ");
        String vowString = input.nextLine();
        System.out.println("Number of  Vowels in given string: " + countVowels(vowString));
    }
 
	public static int countVowels(String vowString)
    {
        int count = 0;
        for (int i = 0; i < vowString.length(); i++)
        {
            if (vowString.charAt(i) == 'a' || vowString.charAt(i) == 'e' || vowString.charAt(i) == 'i'
                    || vowString.charAt(i) == 'o' || vowString.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}