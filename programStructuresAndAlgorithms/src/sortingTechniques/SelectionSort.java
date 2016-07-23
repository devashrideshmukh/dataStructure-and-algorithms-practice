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
		
		for(int i=0;i<size-1;i++){
			int minIndex = i;
			for(int j=i+1;j<size;j++){
				if(array[j]<array[minIndex]){
					minIndex = j;
				}
			}
			
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i]=temp;
		}
		
		
	}
	
	
}
