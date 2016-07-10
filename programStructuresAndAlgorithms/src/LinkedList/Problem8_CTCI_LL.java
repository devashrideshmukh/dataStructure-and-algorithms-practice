package LinkedList;

public class Problem8_CTCI_LL {

	/**
	 * Given a linked list, determine if it has a cycle in it.
	 * 
	 * @param head
	 * @return
	 */
	public boolean hasCycle(Node head) {
		Node fast = head;
		Node slow = head;

		if (head == null) {
			return false;
		}

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Returning node where loop starts 
	 * @param head
	 * @return
	 */
	public Node detectCycle(Node head) {

		Node fast = head;
		Node slow = head;

		if (head == null) {
			return null;
		}

		boolean isCyclic = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				isCyclic = true;
				break;
			}
		}

		slow = head;
		if (isCyclic) {
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}

			return slow;
		}

		return null;
	}

}
