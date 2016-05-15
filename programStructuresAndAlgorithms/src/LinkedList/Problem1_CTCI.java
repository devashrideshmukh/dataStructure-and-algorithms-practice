package LinkedList;

import java.util.HashSet;

public class Problem1_CTCI {

	/**
	 * To remove duplicates from an unsorted linked list
	 */

	// using HashSet i.e. a temporary buffer
	//takes O(N) time
	public void removeDuplicates(LinkedList list) {
		Node first = list.first;
		HashSet<Integer> setForStoringData = new HashSet<Integer>();
		Node current = first;

		if (list.isEmpty()) {
			System.err.println("List is empty");
			return;
		} else {
			Node previous = null;
			while (current != null) {
				if (setForStoringData.contains(current.data)) {
					// logic for delete
					previous.next = current.next;
				} else {
					// logic for storing in set
					setForStoringData.add(current.data);
					previous = current;
				}
				current = current.next;
			}
		}

	}
	
	//without using temporary buffer i.e. using pointers
	//takes O(N2) time, O(1) space
	public void removeDuplicatesUsingPointers(LinkedList list){
		Node first = list.first;
		Node current = first;
		Node runner = null;
		if (list.isEmpty()) {
			System.err.println("List is empty");
			return;
		} else {
			
			while (current != null) {
				runner = current.next;
				while(runner!=null){
					Node prev = runner;
					if(current.data==runner.data){
						prev.next=runner.next;
					}
					prev = runner;
					runner = runner.next;
				}
				current = current.next;
			}
		}
		
	}

}
