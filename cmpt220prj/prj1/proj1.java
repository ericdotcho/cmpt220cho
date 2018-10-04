import java.util.Scanner;

public class proj1 {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);

		int h = input.nextInt();
		int w  = input.nextInt();
		int numBricks = input.nextInt();

		int ind = 0;  //initialize or set index and layer to zero
		int lay = 0;
		int bricks;  //input for bricks will be taken
		boolean canFinish = true;  

		for (int x = 0; x < numBricks; x++) {  //for loop in order to see if combination works
			bricks = input.nextInt();
			ind += bricks;
			if (ind > w) {
				canFinish = false;
				break;
			} else if (ind == w) {
				ind = 0;
				lay++;
				if (lay == h) {
					break;
				}
			}
		}
		System.out.println(canFinish ? "YES" : "NO");  //yes or no comes out
		input.close();		//close the input scanner			
	}

}