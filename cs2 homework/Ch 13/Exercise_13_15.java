import java.math.BigInteger;

public class Exercise_13_15 {
	/** Main method */
	public static void main(String[] args) {
		// Create and initialize two rational numbers r1 and r2
		Rational r1 = new Rational();
		Rational r2 = new Rational();

		// Display results
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}