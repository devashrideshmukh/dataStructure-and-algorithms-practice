package test;

import sortingTechniques.BubbleSort;
import sortingTechniques.InsertionSort;
import sortingTechniques.SelectionSort;

public class RunnerSortingTechniques {

	public static void main(String[] args) {
		int[] a = {5,7,3,1,8,9,4,3,-2,-8,3};
		BubbleSort.bubbleSort(a);
		System.out.println("Bubble Sort:");
		RunnerSortingTechniques.display(a);
		
		int[] b = {5,7,3,1,8,9,4,3,-2,-8,3};
		SelectionSort.sort(b);
		System.out.println("\nSelection Sort:");
		RunnerSortingTechniques.display(b);
		
		int[] c = {5,7,3,1,8,9,4,3,-2,-8,3};
		InsertionSort.sort(c);
		System.out.println("\nInsertion Sort:");
		RunnerSortingTechniques.display(c);
	}
	
	public static void display(int[] arrayToBePrinted){
		
		for(int i=0;i<arrayToBePrinted.length;i++){
			System.out.print(arrayToBePrinted[i]+"\t");
		}
		
	}
}
