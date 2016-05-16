package sequenceAndSeries;

/**
 * To calculate factorials of given number
 * 
 * @author Devashri
 *
 */
public class FactorialCalculations {

	// calculating factorial without recursion
	public int findFactorial(int n) {
		int result = 1;
		if (n < 0) {
			System.err.println("Number cannot be negative");
		} else if (n % 1 != 0) {
			System.err.println("Number cannot be negative");
		} else {
			for (int i = 1; i <= n; i++) {
				result = result * i;

			}
		}
		return result;
	}

	public int findFactorialUsingRecursion(int n){
		
		if(n==1){
			return 1;
		}else{
			return n*findFactorialUsingRecursion(n-1);
		}
		
	}
}
