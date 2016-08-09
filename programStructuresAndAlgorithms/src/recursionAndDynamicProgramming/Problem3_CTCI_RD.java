package recursionAndDynamicProgramming;

/**
 * Magic Index: A magic index in an array A[1..n-1] is defined to be an index
 * such that A[i] i. Given a sorted array of ditinct integers, write a method to
 * find a magic index, if one exists in array A. What if the values are not
 * distinct?
 * 
 * @author Devashri
 *
 */
public class Problem3_CTCI_RD {

	/**
	 * Find magical index when all elements are distinct
	 * 
	 * @param array
	 * @return
	 */
	public static int getMagicalIndexDistinct(int[] array) {
		return getMagicalIndexDistinct(array, 0, array.length - 1);
	}

	public static int getMagicalIndexDistinct(int[] array, int start, int end) {
		if(end<start){
			return -1;
		}
		
		int mid = (start + end) / 2;
		if (array[mid] == mid) {
			return mid;
		} else if (array[mid] < mid) {
			return getMagicalIndexDistinct(array, mid + 1, end);
		} else {
			return getMagicalIndexDistinct(array, start, mid - 1);
		}

	}

	/**
	 * Find magical index when the elements are non-distinct
	 * 
	 * @param array
	 * @return
	 */
	public static int getMagicalIndexNonDistinct(int[] array) {
		return getMagicalIndexNonDistinct(array, 0, array.length - 1);
	}

	public static int getMagicalIndexNonDistinct(int[] array, int start, int end) {

		if(end<start){
			return -1;
		}
		int midIndex = (start+end)/2;
		int midValue = array[midIndex];
		if(midIndex==midValue){
			return midIndex;
		}
		
		//search left taking minimum value between midIndex-1 and midValue
		int leftIndex = Math.min(midIndex-1, midValue);
		int left = getMagicalIndexNonDistinct(array,start,leftIndex);
		if(left>=0){
			return left;
		}
		
		//search right taking maximum value between midIndex+1 and maxValue
		int rightIndex = Math.max(midValue, midIndex+1);
		return getMagicalIndexDistinct(array,rightIndex,end);
		

	}

	public static void main(String[] args) {
		
		int[] array = { -40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13 };
		System.out.println(Problem3_CTCI_RD.getMagicalIndexDistinct(array));
		
		int[] arrayNonDistinct = {-10,-5,2,2,2,3,4,7,9,12,13};
		System.out.println(Problem3_CTCI_RD.getMagicalIndexNonDistinct(arrayNonDistinct));
		
	}
}
