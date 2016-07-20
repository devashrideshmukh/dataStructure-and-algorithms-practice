package arraysAndStrings;

/**
 * Implement the merge() method that takes in two sorted arrays and returns a
 * third sorted array that contains elements of both the input arrays.
 * 
 * @author Devashri
 *
 */
public class MergeSortedArray {
	public static int[] merge(int[] arrLeft, int[] arrRight) {

		int[] third = new int[arrLeft.length + arrRight.length];
		int m = arrLeft.length;
		int n = arrRight.length;
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (arrLeft[i] > arrRight[j]) {
				third[k] = arrRight[j];
				j++;
				k++;
			} else {
				third[k] = arrLeft[i];
				k++;
				i++;
			}
		}

		if (j < n) {
			for (int l = j; l < n; l++) {
				third[k] = arrRight[l];
				k++;
			}
		} else {
			for (int l = i; l < m; l++) {
				third[k] = arrLeft[l];
				k++;
			}
		}

		return third;

	}
}
