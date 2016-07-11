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
			
			//==N-1==//
			int value = arrayToBeSorted[i];
			int hole = i;
			//======//
			
			//depends on inputs
			while(hole>0 && arrayToBeSorted[hole-1]>value){
				arrayToBeSorted[hole] = arrayToBeSorted[hole-1];
				hole--;
			}
			
			//==N-1==//
			arrayToBeSorted[hole] = value;
		}
		
	}
	
	
}
