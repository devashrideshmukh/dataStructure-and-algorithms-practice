package test;

import sortingTechniques.BubbleSort;

public class RunnerSortingTechniques {

	public static void main(String[] args) {
		int[] a = {5,7,3,1,8,9,4,3,-2,-8,3};
		BubbleSort.bubbleSort(a);
		System.out.println("Bubble Sort:");
		RunnerSortingTechniques.display(a);
	}
	
	public static void display(int[] arrayToBePrinted){
		
		for(int i=0;i<arrayToBePrinted.length;i++){
			System.out.print(arrayToBePrinted[i]+"\t");
		}
		
	}
}
