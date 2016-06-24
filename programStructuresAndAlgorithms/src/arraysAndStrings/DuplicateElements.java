package arraysAndStrings;
import java.util.*;
/**
 * Write a method duplicate to find the repeated or duplicate elements in an
 * array. This method should return a list of repeated integers in a string with
 * the elements sorted in ascending order
 * 
 * duplicate({1,3,4,2,1}) --> "[1]"
 * duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
 * 
 * @author Devashri
 *
 */
public class DuplicateElements {

	
	public static String duplicate(int[] numbers){
	    

	    int[] frequency = new int[256];
	    for(int i=0;i<numbers.length;i++){
	        frequency[numbers[i]]++;
	    }

	    ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i=0;i<frequency.length;i++){
	    
	        if(frequency[i]>1){
	            list.add(i);
	        }
	    }
	    
	    Collections.sort(list);
	    return list.toString();
	}
}
