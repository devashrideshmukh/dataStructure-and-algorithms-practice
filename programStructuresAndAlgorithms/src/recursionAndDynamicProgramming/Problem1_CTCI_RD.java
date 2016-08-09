package recursionAndDynamicProgramming;

import java.util.Arrays;

/**
 * Triple Step : A child is running up a staircase with n steps and can hop
 * either 1 step, 2 steps or 3 steps at a time. Implement a method to count how
 * many possible ways the child can run up the stairs.
 * 
 * @author Devashri
 *
 */
public class Problem1_CTCI_RD {
	
	public static int tripleStepCount(int n) {

		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return countWays(n, memo);

	}
	
	public static int countWays(int n,int[] memo){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if(memo[n]>-1){
			return memo[n];
		}else{
			memo[n] = countWays(n-1, memo) + countWays(n-2, memo) + countWays(n-3, memo);
			return memo[n];
		}
	}
	
	public static void main(String[] args) {
		System.out.println("For 2nd step"+Problem1_CTCI_RD.tripleStepCount(2));
		System.out.println("For 3nd step"+Problem1_CTCI_RD.tripleStepCount(3));
	}

}
