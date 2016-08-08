package arraysAndStrings;

/**
 * Given an Array of integers, write a method that will return the integer with
 * the maximum number of repetitions. Your code is expected to run with O(n)
 * time complexity and O(1) space complexity. The elements in the array are
 * between 0 to size(array) - 1 and the array will not be empty.
 * f({3,1,2,2,3,4,4,4}) --> 4
 * @author Devashri
 *
 */
public class MaxRepitition {

	public static int getMaxRepetition(int[] a) {

		int k = a.length;

		for (int i = 0; i < k; i++) {
			a[a[i] % k] = a[a[i] % k] + k;
		}

		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
			if (a[j] > max) {
				max = a[j];
				maxIndex = j;
			}
		}

		return maxIndex;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,2,2,3,4,4,4};
		System.out.println("\n"+getMaxRepetition(arr));
		
	}
}
