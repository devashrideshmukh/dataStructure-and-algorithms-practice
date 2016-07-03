package LinkedList;

public class DuplicateNode {

	public Node deleteDuplicates(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node cur = head.next;
		Node prev = head;

		while (cur != null) {
			if (prev.data == cur.data) {
				prev.next = cur.next;
				cur = cur.next;
			} else {
				prev = cur;
				cur = cur.next;

			}
		}

		return head;

	}

}
