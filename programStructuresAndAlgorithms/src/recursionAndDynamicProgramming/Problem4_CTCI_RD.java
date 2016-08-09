package recursionAndDynamicProgramming;

import java.util.ArrayList;

/**
 * Power Set : Write a method to return all subsets of a Set
 * @author Devashri
 *
 */
public class Problem4_CTCI_RD<T>{

	public ArrayList<ArrayList<T>> getSubsets(ArrayList<T> set){
		ArrayList<ArrayList<T>> listOfSubsets = new ArrayList<>();
		int maxPermutations = 1<<set.size();
		for(int i=0;i<maxPermutations;i++){
			listOfSubsets.add(getSubset(i, set));
		}
		return listOfSubsets;
	}
	
	public ArrayList<T> getSubset(int x,ArrayList<T> set){
		ArrayList<T> subList = new ArrayList<T>();
		int index =0;
		for(int i=x;i>0;i>>=1){
			if((i&1)==1){
				subList.add(set.get(index));
			}
			index++;
		}
		return subList;
	}
	
	public static void main(String[] args) {
		Problem4_CTCI_RD<String> p = new Problem4_CTCI_RD<String>();
		ArrayList<String> set = new ArrayList<>();
		set.add("Yes");
		set.add("No");
		set.add("Hello");
		ArrayList<ArrayList<String>> list = p.getSubsets(set);
		System.out.println(list.toString());
	}
	
}
