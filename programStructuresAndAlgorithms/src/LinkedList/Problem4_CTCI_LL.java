package LinkedList;

/**
 * Given a linked list and a value x, partition it such that all nodes less than
 * x come before nodes greater than or equal to x. You should preserve the
 * original relative order of the nodes in each of the two partitions. For
 * example, given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 * 
 * @author Devashri
 *
 */
public class Problem4_CTCI_LL {

	public static Node partition(Node head, int x) {

		if (head == null) {
			return null;
		}

		Node dummyNode1 = new Node(0);
		Node dummyNode2 = new Node(0);

		dummyNode1.next = head;
		Node cur = head;
		Node prev = dummyNode1;
		Node p2 = dummyNode2;

		while (cur != null) {
			if (cur.data < x) {
				cur = cur.next;
				prev = prev.next;
			} else {
				p2.next = cur;
				p2 = p2.next;
				prev.next = cur.next;
				cur = prev.next;
			}
		}

		p2.next = null;
		prev.next = dummyNode2.next;

		return dummyNode1.next;
	}

}
