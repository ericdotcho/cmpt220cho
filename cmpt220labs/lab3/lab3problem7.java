
public class lab3problem7 {
public static void main(String[] args) {
   		int count = 1; 
		for(int x = 1; x <= 50; x++){     //variable x in place of "n" in formula
			System.out.printf("%-6d",getPentagonalNumber(x));
			if(count % 10 == 0) System.out.println();  
			count++;
		}
    }
  public static int getPentagonalNumber(int x) {
		return (x * (3 * x - 1))/2;  //Formula to find pentagonal number
	}
}