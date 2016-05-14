package arraysAndStrings;

import java.util.Arrays;

public class Problem2_CTCI {
	
	/**
	 * To check if two input strings are permutations of each other
	 */
	
	//solution1 
	//time complexity = O(n)
	//the input strings should have same number of characters and each character must
	//be present same number of times
	public boolean checkPermutations1(String first,String second){
		
		if(first.trim().length()!=second.trim().length()){
			System.out.println("Lengths do not match");
			return false;
		}
		
		//this array consists of count of characters at their respective ascii index
		//eg. ascii of a is 97, then countArray[97] = 1
		int[] countArray = new int[256];
		
		//fill in the array with counts of first string
		for(int i = 0; i < first.length();i++){
			int index = first.charAt(i);
			countArray[index]++;
		}
		
		//subtract count whenever character occurs
		for(int i = 0; i < second.length();i++){
			
			int index = second.charAt(i);
			countArray[index]--;
			if(countArray[index]<0){
				return false;
			}
		}
		
		return true;
		
	}
	
	
	//solution2 sorting
	public boolean checkPermutations2(String first,String second){
		
		if(first.trim().length()!=second.trim().length()){
			System.out.println("Lengths do not match");
			return false;
		}
		
		char[] firstArray = first.toCharArray();
		Arrays.sort(firstArray);
		String firstSorted = new String(firstArray);
		
		char[] secondArray = second.toCharArray();
		Arrays.sort(secondArray);
		String secontSorted = new String(secondArray);
		
		if(!secontSorted.equals(firstSorted)){
		return false;	
		}
		
		return true;
	}
	

}
