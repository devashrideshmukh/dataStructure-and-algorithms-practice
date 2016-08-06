package arraysAndStrings;


public class ArrayGame {
	
	public static void main(String[] args) {
		int[] arr = {1,3,2};
		int[] arr1 = {2,2,2};
		System.out.println(ArrayGame.countMoves(arr));
		System.out.println(ArrayGame.countMoves(arr1));
	}

	public static long countMoves(int[] numbers){
		
		long numberOfMoves = 0;
		
		while(!areAllElementsEqual(numbers)){
			
			int maxIndex = findMax(numbers);
			for(int i=0;i<numbers.length;i++){
				if(i!=maxIndex){
					numbers[i]++;
				}
			}
			numberOfMoves ++;
		}
		
		return numberOfMoves;
		
		
		
	}
	
	public static int findMax(int[] numbers){
		int maxIndex = 0;
		int maxValue = Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++){
			if(maxValue<numbers[i]){
				maxValue = numbers[i];
				maxIndex = i;
			}
			
		}
		
		return maxIndex;
	}
	
	
	
	public static boolean areAllElementsEqual(int[] numbers){
		int value=numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(value!=numbers[i]){
				return false;
			}
			
		}
		
		return true;
	}
}
