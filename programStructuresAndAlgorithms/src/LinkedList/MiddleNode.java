package LinkedList;

public class MiddleNode {

	public static Node returnMiddleNode(Node head){
		Node fast = head;
	    Node slow = head;
	    
	    if(head!=null){
	    while(fast.next!=null && fast.next.next!=null){
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    }
	    return slow;
	}
}


