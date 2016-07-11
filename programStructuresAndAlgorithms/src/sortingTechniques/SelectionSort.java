package sortingTechniques;


/**
 * Worst O(N^2)
 * Best O(N^2)
 * Avg O(N^2)
 * 
 * Space O(1)
 * @author Devashri
 *
 */
public class SelectionSort {

	
	public static void sort(int[] array){
		
		int size = array.length;
		
		//need to run it only for n-2 times
		for(int i=0;i<size-1;i++){
			
			int indexMin = i;
			
			for(int j=i+1;j<size;j++){
				if(array[indexMin]>array[j]){
					indexMin = j;
				}
			}
			
			int temp = array[i];
			array[i]=array[indexMin];
			array[indexMin]=temp;
			
		}
		
		
	}
	
	
}
