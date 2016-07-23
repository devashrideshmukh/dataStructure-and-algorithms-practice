package test;

import java.util.Scanner;

import PatternsAndNumbers.Power;
import sequenceAndSeries.FactorialCalculations;
import sequenceAndSeries.FibonacciSeries;
import sequenceAndSeries.TriangularNumbers;

public class RunnerSequenceAndSeries {

	public static void main(String[] args) {
		
		TriangularNumbers tn = new TriangularNumbers();
		System.out.println("Triangular Number : " + tn.getTriangularNumber(6));
		System.out.println("Triangular Number (using recursion) : " + tn.getTriangularNumberUsingRecursion(6));

		FactorialCalculations fact = new FactorialCalculations();
		System.out.println("Factorial : "+fact.findFactorial(6));
		System.out.println("Factorial : "+fact.findFactorialUsingRecursion(6));
		System.out.println("Power:" + Power.pow(2, 3));
		FibonacciSeries fbs=new FibonacciSeries();
		fbs.printFibonacciSeries(6);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int number = scanner.nextInt();
		
		fbs.printFibonacciSeriesWithRecursion(number);
		
		
	}

}
