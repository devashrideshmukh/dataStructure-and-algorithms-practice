package LinkedList;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list. Input: (2 -> 4 ->
 * 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author Devashri
 *
 */
public class Problem5_CTCI_LL {

	public static Node addLists(Node node1, Node node2) {

		int sum = 0;
		int carry = 0;
		Node sumList = new Node(0);
		Node cur = sumList;
		Node p = node1;
		Node q = node2;
		while (p != null && q != null) {
			int x = p == null ? 0 : p.data;
			int y = q == null ? 0 : q.data;
			sum = carry + x + y;
			cur.next = new Node(sum % 10);
			cur = cur.next;
			carry = sum / 10;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}

		//create another node for carry
		if (carry > 0) {
			cur.next = new Node(carry);
		}

		return sumList.next;

	}
}
