package LinkedList;

import java.util.HashSet;

/**
 * Write code to remove duplicates from an unsorted LinkedList
 * 
 * @author Devashri
 *
 */
public class Problem1_CTCI_LL {

	/**
	 * Remove duplicates using HashSet
	 * O(1) space complexity
	 * O(N^2) time complexity 
	 * @param node
	 */
	public static void removeDuplicatesUsingBuffer(Node node) {
		HashSet<Integer> set = new HashSet<>();
		Node previous = null;
		Node current = node;
		while(current!=null){
			if(set.contains(current.data)){
				previous.next=current.next;
			}else{
				set.add(current.data);
				previous=current;
			}
			current=current.next;
		}
		
	}
	
	/**
	 * Remove duplicates without using buffer
	 * O(1) space complexity
	 * o(N^2) time complexity
	 * @param node
	 */
	public static void removeDuplicatesWithoutUsingBuffer(Node node){
		Node current = node;
		Node runner = null;
		while(current!=null){
			runner = current;
			while(runner.next!=null){
				
				if(runner.next.data==current.data){
					runner.next=runner.next.next;
				}else{
					runner = runner.next;
				}
				
			}
			current=current.next;
		}
	}

}
