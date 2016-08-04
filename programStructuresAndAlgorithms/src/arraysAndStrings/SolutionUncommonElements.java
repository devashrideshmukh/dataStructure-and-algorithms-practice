package arraysAndStrings;

import java.util.HashSet;

public class SolutionUncommonElements {
	
	public static HashSet<Integer> getUncommonElements(int[] a,int[] b){
		
		HashSet<Integer> setA = new HashSet<>();
		for(int i=0;i<a.length;i++){
			setA.add(a[i]);
		}
		
		HashSet<Integer> setB = new HashSet<>();
		for(int i=0;i<b.length;i++){
			setB.add(b[i]);
		}
		
		HashSet<Integer> result = new HashSet<>(setA);
		for(Integer number:setB){
			boolean flag = result.add(number);
			if(!flag){
				result.remove(number);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3};
		int[] b = {1,2,4,5};
		System.out.println(SolutionUncommonElements.getUncommonElements(a, b));
	}
}
