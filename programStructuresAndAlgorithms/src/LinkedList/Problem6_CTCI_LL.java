package LinkedList;

/**
 * Implement a function to check if linked list is a palindrome
 * 
 * @author Devashri
 *
 */
public class Problem6_CTCI_LL {
	/**
	 * Time O(n) Space O(1)
	 * 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(Node head) {

		// if list contains one or no elements
		if (head == null || head.next == null) {
			return true;
		}

		// find list center
		// using tortoise and hare method
		Node fast = head;
		Node slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		// obtain second head
		Node secondHead = slow.next;

		// cut link
		slow.next = null;

		// reverse second part of list
		Node current = secondHead;
		Node nextNode;
		Node prev = null;
		while (current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		
		//set head to second list
		secondHead = prev;

		// compare two lists
		Node p = head;
		Node q = secondHead;
		while (p != null && q != null) {
			if (p.data != q.data) {
				return false;
			}
			p = p.next;
			q = q.next;
		}

		return true;
	}

}
