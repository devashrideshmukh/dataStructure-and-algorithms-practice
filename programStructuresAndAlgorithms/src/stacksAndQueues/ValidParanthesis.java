package stacksAndQueues;

import java.util.*;
import java.util.Stack;

public class ValidParanthesis {

public boolean isValid(String s) {
        
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++){
            
            char c = s.charAt(i);
            
            if(map.keySet().contains(c)){
                stack.push(c);
            }else if(map.values().contains(c)){
                if(!stack.empty() && map.get(stack.peek())==c){
                    stack.pop();
                }else{
                    return false;
                }
            }
            
        }
        
        return stack.empty();
    }
	
}
