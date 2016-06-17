package arraysAndStrings;

public class Problem3_CTCI {
	
	/*
	 * urlify
	 * replace all the spaces in given string by %20
	 * using character array
	 */
	
	//solution1
	public static String urlify1(String inputString){
		
		int numberOfSpaces = 0 ;
		
		
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i) == ' '){
				numberOfSpaces++;
			}
		}
		
		int newLength = inputString.length()+(numberOfSpaces*2);
		char[] inputArray = new char[newLength+1];
		inputArray[newLength] = '\0';
		
		//traverse from back
		for(int i=inputString.length()-1; i >= 0; i--){
			if(inputString.charAt(i)==' '){
				inputArray[newLength] = '0';
				inputArray[newLength-1] = '2';
				inputArray[newLength-2] = '%';
				newLength = newLength - 3;
			}else{
				inputArray[newLength] = inputString.charAt(i);
				newLength = newLength -1;
			}
		}
		
		return new String(inputArray);
		
	}
	
	//solution2
	public static String urlify2(String inputString){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i) == ' '){
				sb.append("%20");
			}else{
				sb.append(inputString.charAt(i));
			}
		}
		return sb.toString();
	}

}
