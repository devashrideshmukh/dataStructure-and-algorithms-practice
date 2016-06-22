package PatternsAndNumbers;

public class StarPatterns {

	public static void printTriangularPattern(int size){
		
		int cols = 1;
		for(int i=0;i<size;i++){
			
			for(int j=0;j<cols;j++){
				System.out.print("*");
			}
			System.out.println("\n");
			cols=cols+1;
		}
	}
	
	public static void printTriangularPatternUpsideDown(int size){
		int cols=size;
		for (int i = 0; i < size; i++) {
			for(int j=0;j<cols;j++){
				System.out.print("*");
			}
			System.out.println("\n");
			cols--;
		}
	
	}
	
	public static void printTriangularRight(int size){
		int cols=size;
		
		for (int i = 0; i < size; i++) {
			
			for(int k=0;k<cols;k++){
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("\n");
			cols--;
		}
	
	}
	
	public static void printHalfDiamond(int size){
		int cols = 1;
		for(int i=0;i<size;i++){
			for(int j=0;j<cols;j++){
				System.out.print("*");
			}
			System.out.println("\n");
		
			if(i<size/2){
				cols++;
			}else{
				cols--;
			}
			
		}
		
	}
	
	public static void printPyramid(int size){
		int noOfSpaces = size-1;
		int noOfStars = 1;
		for(int i=0;i<size;i++){
			for(int j=0;j<noOfSpaces;j++){
				System.out.print(" ");
			}
			for(int k=0;k<noOfStars;k++){
				System.out.print("*");
			}
			noOfSpaces--;
			System.out.print("\n");
			noOfStars=noOfStars+2;
		}
	}
	
	
	public static void printStarDiamond(int size){
		int noOfSpaces = size/2;
		int noOfStars = 1;
		for(int i=0;i<size;i++){
			for(int j=0;j<noOfSpaces;j++){
				System.out.print(" ");
			}
			for(int k=0;k<noOfStars;k++){
				System.out.print("*");
			}
			
			if(i<(size/2)){
				noOfSpaces--;
				noOfStars=noOfStars+2;
			}else{
				noOfSpaces++;
				noOfStars=noOfStars-2;
			}
			
			System.out.print("\n");
			
		}
	}
	
}
