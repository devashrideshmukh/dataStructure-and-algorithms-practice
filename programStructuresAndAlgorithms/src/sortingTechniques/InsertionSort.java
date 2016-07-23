package sortingTechniques;


/**
 * Worst O(N^2)
 * Best O(N)
 * Avg O(N^2)
 * 
 * Space O(1)
 * @author Devashri
 *
 */
public class InsertionSort {

	public static void sort(int[] arrayToBeSorted){
		
		for(int i=1;i<arrayToBeSorted.length;i++){
			
			int val = arrayToBeSorted[i];
			int hole = i;
			
			while(hole>0 && val<arrayToBeSorted[hole-1]){
				arrayToBeSorted[hole] = arrayToBeSorted[hole-1];
				hole--;
			}
			
			arrayToBeSorted[hole] = val;
		}
		
	}
	
	
}
