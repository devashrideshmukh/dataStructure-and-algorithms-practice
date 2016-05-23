package test;

import java.util.Scanner;

import problemsOnRecursion.PrintArrayRecursively;
import problemsOnRecursion.SumOfNaturalNumbers;

public class RunnerRecursion {

	public static void main(String[] args) {
		
		int[] array = {4,5,3,1,9,7,8};
		PrintArrayRecursively pra = new PrintArrayRecursively();
		pra.printArrayRecursively(array,array.length);
		System.out.println("\n");
		pra.printArrayRecursivelyInReverseOrder(array, array.length);
		
		SumOfNaturalNumbers sum = new SumOfNaturalNumbers();
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Sum of "+number+"natural numbers is "+sum.getSumOfnNaturalNumbers(number));
		
		
		
	}
}
