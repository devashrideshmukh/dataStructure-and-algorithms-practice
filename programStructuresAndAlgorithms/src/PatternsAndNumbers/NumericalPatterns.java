package PatternsAndNumbers;

public class NumericalPatterns {

	public static void printNumericalDiamond(int size) {
		int noOfSpaces = size / 2;
		int noOfStars = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < noOfSpaces; j++) {
				System.out.print(" ");
			}
			int count =0;
			if(i<=size/2){
				count = i+1;
			}else{
				count = size-i;
			}
			
			for (int k = 0; k < noOfStars; k++) {
				
				System.out.print(count);
				if (k < noOfStars / 2) {
					count--;
				} else {
					count++;
				}

			}

			if (i < (size / 2)) {
				noOfSpaces--;
				noOfStars = noOfStars + 2;
			} else {
				noOfSpaces++;
				noOfStars = noOfStars - 2;
			}

			System.out.print("\n");

		}
	}

}
