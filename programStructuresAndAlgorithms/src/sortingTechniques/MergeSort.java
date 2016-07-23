package sortingTechniques;

public class MergeSort {

	public static void sort(int[] array){
		int n = array.length;
		if(n<2){
			return;
		}
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i=0;i<mid-1;i++){
			left[i]=array[i];
		}
		
		for(int j=mid;j<n-1;j++){
			right[j-mid]=array[j];
		}
		
		sort(left);
		sort(right);
		merge(left,right,array);
		
	}
	
	public static void merge(int[] left,int[] right, int[] array){
		int nL = left.length;
		int nR = right.length;
		int i=0,k=0,j=0;
		
		while(i<nL && j<nR){
			if(left[i]<right[j]){
				array[k]=left[i];
				i++;
				k++;
			}else{
				array[k]=right[j];
				j++;
				k++;
			}
		}
		
		while(i<nL){
			array[k]=left[i];
			i++;
			k++;
		}
		
		while(j<nR){
			array[k]=right[j];
			j++;
			k++;
		}
		
		
	}
	
	
}
