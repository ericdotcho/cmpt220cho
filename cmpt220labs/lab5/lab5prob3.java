import java.util.*;
 
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(“Please input number of students: ");
        int numbofstudents = input.nextInt();
        String[] names = new String[numobfstu];
        int[] array = new int[numbofstu];
        for(int x = 0; x < numbofstu; x++) {
            System.out.print("Enter the student's name: ");
            names[x] = input.next();
            System.out.print("Enter the student's score: ");
            array[x] = input.nextInt();
        }
        selectionSort(names, array);
        for (int x = 0; x < numofstu; x++)
        {
            System.out.println("Student: " + names [x] + " | " + "score: " + array [x]);

        }
    }
    public static void selectionSort(String[] names, int[] array) {
        for(int x = array.length - 1; x >= 1; x—) {
            String temp;
            int currentMax = array[0];
            int currentMaxIndex = 0;
            for(int y = 1; y <= x; y++) {
                if (currentMax > array[y]) {
                    currentMax = array[y];
                    currentMaxIndex = y;
                }
            }       
                if (currentMaxIndex != x) {
                    temp = names[currentMaxIndex];
                    names[currentMaxIndex] = names[x];
                    names[x] = temp;
                    array[currentMaxIndex] = array[x];
                    array[x] = currentMax;
                }
        }       
    }
}