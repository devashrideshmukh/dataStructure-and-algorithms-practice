package LinkedList;

/**
 * 
 * @author Devashri
 *
 */
public class Node {
	
	Node next;
	int data;
	
	public Node(int data) {
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
}
