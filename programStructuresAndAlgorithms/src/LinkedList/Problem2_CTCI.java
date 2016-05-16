package LinkedList;

/**
 * To implement an algorithm to find the kth to last element of singly linked
 * list
 * 
 * @author Devashri
 *
 */

// place two pointers k nodes apart
// move them simultaneously
// when one reaches null other reaches kth last element
public class Problem2_CTCI {

	public Node kthToLastElement(int k, LinkedList linkedList) {
		Node pointer1 = linkedList.first;
		Node pointer2 = linkedList.first;

		// set the pointer k nodes apart
		for (int i = 0; i < k; i++) {
			if (pointer2 == null)
				return null;
			pointer2 = pointer2.next;
		}

		while (pointer2 != null) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;

		}
		return pointer1;

	}

}
