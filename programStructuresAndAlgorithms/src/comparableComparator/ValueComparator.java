package comparableComparator;

import java.util.Comparator;
import java.util.HashMap;

/**
 * Steps to sort HashMap by values
 * 1) Write a ValueComparator which implements Comparator<Key>
 * 2) In ValueComparator
 * 		a) Take local map attribute
 * 		b) Write a contructor which takes map as input, and putAll() map into local
 * 		c) Write compare method, comparing values obtained from Strings given as input
 * 3) In runner, create an object of ValueComparator and pass mapToBeSorted into it
 * 4) Create a sorted map, TreeMap, passing comparator obj to its constructor
 * 5) treemapObj.putAll(mapToBeSorted);
 * 
 * @author Devashri
 *
 */


public class ValueComparator implements Comparator<String>{

	HashMap<String,Integer> map = new HashMap<String,Integer>();
	
	
	public ValueComparator(HashMap<String,Integer> map) {
		this.map.putAll(map);
	}
	
	
	@Override
	public int compare(String o1, String o2) {
		int val1 = map.get(o1);
		int val2 = map.get(o2);
		if(val1>val2){
			return 1;
		}else if(val2>val1){
			return -1;
		}else{
			return 0;
		}
	}

}
