package arraysAndStrings;

public class StringComputations {
	
	public int returnConvertedInteger(String inputString){
		int convertedInteger=0;
		int factor=1;
		boolean isNegative = false;
		inputString=inputString.trim();
		if(inputString.charAt(0)=='-'){
			isNegative = true;
			inputString=inputString.substring(1);
		}
		for (int i = inputString.length()-1; i >=0; i--) {
			convertedInteger += (inputString.charAt(i) - '0')*factor;
			factor=factor*10;
		}
		
		if (isNegative) {
			convertedInteger=convertedInteger*-1;
		}
		return convertedInteger;
	}

}
