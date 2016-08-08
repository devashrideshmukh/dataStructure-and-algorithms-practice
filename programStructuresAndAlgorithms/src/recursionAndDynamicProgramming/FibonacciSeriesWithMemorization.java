package recursionAndDynamicProgramming;

/**
 * Compute fibonacci number using memoziations
 * 
 * @author Devashri
 *
 */
public class FibonacciSeriesWithMemorization {
	public static int fibonacciNumber(int n) {
		return fib(n, new int[n + 1]);
	}

	public static int fib(int n, int[] memo) {
		if (n == 0) {
			memo[n] = 0;
		} else if (n == 1) {
			memo[n] = 1;
		} else {
			memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
		}
		return memo[n];
	}

	public static void main(String[] args) {
		System.out.println(FibonacciSeriesWithMemorization.fibonacciNumber(8));
	}
}
