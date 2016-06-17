package arraysAndStrings;

import java.util.BitSet;

public class PrintMissingNumbers {

	/**
	 * Print missing numbers If more than one number is missing
	 * @param numbers
	 * @param count
	 */
	public static void printMissingNumbers(int[] numbers,int count){
		BitSet set = new BitSet(count);
		for(int number:numbers){
			// - 1 as the bit set starts from index 0
			set.set(number-1);
		}
		
		int numberOfMissing = count-numbers.length;
		int index = 0;
		for(int i=0;i<numberOfMissing;i++){
			index = set.nextClearBit(index);
			System.out.print(++index+"\t");
		}
	}
	
	/**
	 * Print missing numbers If only one number is missing
	 * @param numbers
	 * @param count
	 */
	public static void printMissingNumber(int[] numbers,int count){
		int expectedSum = (count * (count+1))/2;
		int actualSum = 0;
		for(int i=0;i<numbers.length;i++){
			actualSum = numbers[i]+actualSum;
		}
		System.out.println(expectedSum-actualSum);
	}
	
	
}
