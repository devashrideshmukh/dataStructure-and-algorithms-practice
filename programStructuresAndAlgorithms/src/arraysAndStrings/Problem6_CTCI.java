package arraysAndStrings;

public class Problem6_CTCI {
	
	/**
	 * Creates compressed string
	 * aabbbcccccaa => a2b3c5a2
	 * abc => a1b1c1 => abc
 	 */
	public static String returnCompressedString(String inputString){
		
		char current=inputString.charAt(0);
		char prev = inputString.charAt(0);
		StringBuffer sb = new StringBuffer();
		int count=0;
		for(int i=0;i<inputString.length();i++){
			
			current=inputString.charAt(i);
			
			if(current==prev){
				count++;
			}else{
				//this does not get called in case of last set
				sb.append(prev);
				sb.append(count);
				prev = current;
				count = 1;
			}
		}
		
		//for last set
		sb.append(prev);
		sb.append(count);
		
		if(sb.toString().length()>inputString.length()){
			return inputString;
		}else{
			return sb.toString();
		}
	}

}
