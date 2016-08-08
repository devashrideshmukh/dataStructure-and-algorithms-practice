package arraysAndStrings;

/**
 * Given an array of integers, write a method - maxGain - that returns the
 * maximum gain. Maximum Gain is defined as the maximum difference between 2
 * elements in a list such that the larger element appears after the smaller
 * element. If no gain is possible, return 0.
 * 
 * @author Devashri
 *
 */
public class MaxDiff {

	public static int maxGain(int[] a) {
		
		int n = a.length;
		int[] diff = new int[n];

		for (int i = 0; i < n - 1; i++) {
			diff[i] = a[i + 1] - a[i];
		}

		int maxDiff = diff[0];
		for (int i = 1; i < n - 1; i++) {
			
			//add
			if (diff[i - 1] > 0) {
				diff[i] += diff[i - 1];
			}
			
			if (maxDiff < diff[i]) {
				maxDiff = diff[i];
			}
		}

		if (maxDiff < 0) {
			return 0;
		}

		return maxDiff;

	}

}
