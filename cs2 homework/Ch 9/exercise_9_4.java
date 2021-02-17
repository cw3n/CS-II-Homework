//Write a program that creates a Random object with seed 1000
//and displays the first 5 random integers between 0 and 100 
//using the nextInt(100) method. Repeat the list three times.

public class exercise_9_4 {
	/** Main method */
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
		    // your code goes here
		// Create a Random object with seed 1000
		java.util.Random randomNumber = new java.util.Random(1000);

		// Displays the first 5 random integers between 0 and 100
		for (int i1 = 1; i1 <= 5; i1++) {
			if (i1 % 10 == 0)
				System.out.printf("%5d\n", randomNumber.nextInt(100));
			else
				System.out.printf("%5d", randomNumber.nextInt(100));
		}
	}
}
}