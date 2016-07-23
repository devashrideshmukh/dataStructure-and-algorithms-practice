package comparableComparator;

import java.util.Comparator;
import java.util.HashMap;

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
