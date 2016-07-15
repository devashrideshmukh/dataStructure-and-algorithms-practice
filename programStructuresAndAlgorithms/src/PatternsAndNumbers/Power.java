package PatternsAndNumbers;

/**
 * Write a method - pow(x,n) that returns the value of x raised to the power of
 * n (xn). n can be negative!
 * 
 * @author Devashri
 *
 */
public class Power {

	public static double pow(double x, int n) {

		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 1 / pow(x, -n);
		} else {
			return x * pow(x, n - 1);
		}

	}
}
