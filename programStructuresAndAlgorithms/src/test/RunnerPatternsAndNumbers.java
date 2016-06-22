package test;

import PatternsAndNumbers.NumericalPatterns;
import PatternsAndNumbers.StarPatterns;

public class RunnerPatternsAndNumbers {

	
	public static void main(String[] args) {
		
		StarPatterns.printTriangularPattern(7);
		System.out.println("------------------------\n");
		StarPatterns.printHalfDiamond(7);
		System.out.println("------------------------\n");
		StarPatterns.printTriangularPatternUpsideDown(7);
		System.out.println("------------------------\n");
		StarPatterns.printTriangularRight(7);
		System.out.println("------------------------\n");
		StarPatterns.printPyramid(7);
		System.out.println("------------------------\n");
		StarPatterns.printStarDiamond(7);
		System.out.println("------------------------\n");
		NumericalPatterns.printNumericalDiamond(11);
	}
	
}
