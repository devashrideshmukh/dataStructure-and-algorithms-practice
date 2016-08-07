package arraysAndStrings;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth
 * largest element in the sorted order, not the kth distinct element.
 * 
 * For example, given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 * Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 * @author Devashri
 *
 */
public class KthLargest {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		for (int i : nums) {
			q.offer(i);

			if (q.size() > k) {
				q.poll();
			}
		}

		return q.peek();
	}
	
	public static int findKthSmallest(int[] nums, int k) {
		Comparator<Integer> comp = new PQComparator();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k,comp);
		for (int i : nums) {
			q.offer(i);

			if (q.size() > k) {
				q.poll();
			}
		}

		return q.peek();
	}
	
	public static class PQComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1>o2){
				return -1;
			}else if(o1<o2){
				return 1;
			}
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,6,4};
		System.out.println("2nd largest => "+KthLargest.findKthLargest(arr, 2));
		System.out.println("2nd smallest => "+KthLargest.findKthSmallest(arr, 2));
	}
}
