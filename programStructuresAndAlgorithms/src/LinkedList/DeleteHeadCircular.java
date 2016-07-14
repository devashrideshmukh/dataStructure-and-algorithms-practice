package LinkedList;

public class DeleteHeadCircular {

	/**
	 * Given a circular linked list, implement a method to delete its head node.
	 * Return the list's new head node.
	 * 
	 * @param head
	 * @return
	 */
	public Node deleteAtHead(Node head) {

		Node cur = head;

		if (head == null || head.next == head) {
			return null;
		}

		while (cur.next != head) {
			cur = cur.next;
		}

		cur.next = head.next;
		head = cur.next;
		return head;

	}

}
