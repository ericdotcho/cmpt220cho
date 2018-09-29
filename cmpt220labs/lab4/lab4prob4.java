import java.util.Scanner;

public class lab4prob4 { 
    static final int Max_Chars = 122; 
  
    static void getAlpha(String str) 
    { 
        // Create an array of size 256
        int count[] = new int[Max_Chars]; 
  
        int len = str.length(); 
  
        // Initialize count array index 
        for (int x = 0; x < len; x++) 
            count[str.charAt(x)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int x = 0; x < len; x++) { 
            ch[x] = str.charAt(x); 
            int find = 0; 
            for (int y = 0; y <= x; y++) { 
  
                // If any matches are found 
                if (str.charAt(x) == ch[y])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of appearances of " + str.charAt(x) + " is:" + count[str.charAt(x)]);             
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner strInput = new Scanner(System.in); 
        System.out.println("Please enter a desired string: ");
        String str = strInput.nextLine(); 
        getAlpha(str); 
    } 
} 