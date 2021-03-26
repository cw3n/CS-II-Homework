import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_13_19 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a decimal number
		System.out.print("Enter a decimal number: ");
		String[] decimal = input.nextLine().split("[.]");

		// Create a Rational object of the integer part of the decimal number
		Rational r1 = new Rational();

		// Create a Rational object of the fractional part of the decimal number
		Rational r2 = new Rational();

		// Display fraction number
		System.out.println("The fraction number is " + 
			(decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));
	}
}