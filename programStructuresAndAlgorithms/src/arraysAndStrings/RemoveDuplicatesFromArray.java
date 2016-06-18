package arraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	public static int[] removeDuplicatesFromArrayWithoutUsingCollection(int[] inputArray){
		
		//sort the array 
		//{2223344556789}
		Arrays.sort(inputArray);
		for(int i=0;i<inputArray.length;i++){
			System.out.print(inputArray[i]);
		}
		
		int previous;
		
		if(inputArray.length==0){
			return null;
		}else{
			previous=inputArray[0];
		}
		int dupCount =0;
		int numberOfDuplicates = 0;
		for(int i=1;i<inputArray.length;i++){
			int cur = inputArray[i];
			if(!(previous==cur)){
				if(dupCount>0){
					numberOfDuplicates++;
				}
				previous=cur;
				dupCount=0;
			}else{
				dupCount++;
				numberOfDuplicates++;
			}
		}
		int size = inputArray.length-numberOfDuplicates;
		
		int[] result = new int[size];
		int count =0;
		previous=inputArray[0];
		dupCount =0;
		for(int i=1;i<inputArray.length;i++){
			
			int cur = inputArray[i];
			if(previous!=cur){
				if(dupCount==0){
					result[count]=previous;
					count++;
				}
				previous=cur;
				dupCount=0;
				
			}else{
				dupCount++;
			}
			
			result[count]=previous;
		}
		return result;
	}
	
	public static Integer[] removeDuplicatesFromArrayUsingCollection(Integer[] inputArray){
		List<Integer> list =Arrays.asList(inputArray);
		Set<Integer> setWithoutDups = new HashSet<Integer>(list);
		Integer[] result = new Integer[setWithoutDups.size()];
		setWithoutDups.toArray(result);
		return result;
		
	}
}
