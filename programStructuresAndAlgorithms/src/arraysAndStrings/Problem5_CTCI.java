package arraysAndStrings;

public class Problem5_CTCI {
	
	/**
	 * function to check if two strings are one or zero edits away
	 * replace()
	 * insert()
	 * remove()
	 */

	public boolean checkIfStringIfOneEditAway(String mainString,String editedString){
		
		//if length differs by more than one then return false straight away.
		int lengthDifference = Math.abs(mainString.length()-editedString.length());
		
		if(!(lengthDifference<=1)){
			return false;
		}
		
		
		if(mainString.length()==editedString.length()){
			//checking for replace()
			return sameLengthEdit(mainString, editedString);
		}else if(mainString.length()<editedString.length()){
			//checking for remove()
			return insertOrRemoove(mainString, editedString);
		}else if(mainString.length()>editedString.length()){
			//checking for insert()
			return insertOrRemoove(editedString,mainString);
		}
	    
		return true;
	}
	
	//for replaced string
	public boolean sameLengthEdit(String string1,String string2){
		boolean foundDifference=false;
		
		for(int i = 0; i<string1.length();i++){
			if(string1.charAt(i)!=string2.charAt(i)){
				if(foundDifference){
					return false;
				}
				foundDifference=true;
			}
		}
		
		return true;
	}
	
	public boolean insertOrRemoove(String string1,String string2){
		int index1=0;
		int index2=0;
		
		while(index1<string1.length() && index2<string2.length()){
			if(string1.charAt(index1)!=string2.charAt(index2)){
				
				if(index1!=index2){
					return false;
				}
				index2++;
				
			}else{
				index1++;
				index2++;
			}
			
		}
		
		return true;
		
	}
	
	
/**	public boolean insertOrRemoove(String string1,String string2){
		int index1=0;
		int index2=0;
		while(index1<string1.length() && index2<string2.length()){
			
			if(string1.charAt(index1) != string2.charAt(index2)){
				
				if(index1!=index2){
					//indicates that more than one change has occured
					return false;
				}
				index2++;
			}else{
				index1++;
				index2++;
			}
			
		}
		return true;
	}
	
	public boolean sameLengthEdit(String mainString,String editString){
		boolean foundDifference = false;
		 for(int i=0;i<mainString.length();i++){
			 
			 if(mainString.charAt(i)!=editString.charAt(i)){
				 
				 if(foundDifference){
					 return false;
				 }
				 
				 foundDifference = true;
				 
			 }
			 
		 }
		 return true;
		
	}
	**/
	
}
