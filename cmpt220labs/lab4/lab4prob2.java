
public class lab4prob2 {
public static char getRandomChar (char alpha1, char alpha2) {
	return (char)(alpha1 + Math.random() * (alpha2 - alpha1 + 1));
}
public static char getRandomLowerCaseAlpha() {
	return getRandomChar ('a', 'z');
}
public static void main(String[] args) {
	final int NumbLowCase = 25; // Number of lower case letters
	final int NumbLines = 5; // To print 5 characters per line

	// Print 100 lower case letters
	for (int i = 1; i <= NumbLowCase; i++) {
		System.out.print(getRandomLowerCaseAlpha());
		System.out.print(i % NumbLines == 0 ? "\n" : " ");
	}
}
}