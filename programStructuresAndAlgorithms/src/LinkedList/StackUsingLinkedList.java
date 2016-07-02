package LinkedList;

/**
 * This class implements stacks using linked lists
 * @author Devashri
 *
 */
public class StackUsingLinkedList {

	Node first;
	
	public StackUsingLinkedList() {
		first = null;
	}
	
	public Node pop(){
		if(this.first==null){
			return null;
		}else{
			Node popedNode = first;
			first = first.next;
			return popedNode;
		}
	}
	
	public void push(int data){
		Node nodeToBeInserted = new Node(data);
		if(this.first==null){
			this.first=nodeToBeInserted;
		}else{
			nodeToBeInserted.next = first;
			first= nodeToBeInserted;
		}
	}
	
	public Node peek(){
		if(first==null){
			return null;
		}else{
			return first;
		}
	}
	
	
}
