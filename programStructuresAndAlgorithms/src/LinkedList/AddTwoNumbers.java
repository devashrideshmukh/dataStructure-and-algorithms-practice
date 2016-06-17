package LinkedList;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * @author Devashri
 *
 */
public class AddTwoNumbers {
	public Node addTwoNumbersFromLinkedList(Node l1,Node l2){
		Node returningList = new Node(0);
		Node cur = returningList;
		Node p = l1;
		Node q = l2;
		int carry = 0;
		while(p!=null || q!=null){
			int x = p==null ? 0 : p.data;
			int y = q==null ? 0 : q.data;
			int sum = x+y+carry;
			carry = sum / 10;
			cur.next = new Node(sum%10);
			cur = cur.next;
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		
		if(carry>0){
			cur.next=new Node(carry);
		}
		
		return returningList.next;
	}
}
