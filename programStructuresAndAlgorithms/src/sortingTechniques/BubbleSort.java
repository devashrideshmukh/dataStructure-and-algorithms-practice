package sortingTechniques;

public class BubbleSort {

	public static void bubbleSort(int[] arrayToBeSorted){
		for(int i=0;i<arrayToBeSorted.length;i++){
			for(int j=1;j<arrayToBeSorted.length-i;j++){
				if(arrayToBeSorted[j]<arrayToBeSorted[j-1]){
					int temp = arrayToBeSorted[j];
					arrayToBeSorted[j]=arrayToBeSorted[j-1];
					arrayToBeSorted[j-1]=temp;
				}
			}
		}
	}
 	
}
