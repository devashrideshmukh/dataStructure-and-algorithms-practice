package LinkedList;

/**
 * Reversing a linked list
 * @author Devashri
 *
 */
public class ReversingLinkedList {

	/**
	 * Reversing a linked list
	 */
	public void reverseLinkedList(LinkedList list){
		Node first = list.first;
		Node nextNode;
		Node previous=null;
		Node current = first;
		
		if(list.isEmpty()){
			System.out.println("List is empty");
			return;
		}else{
			while(current!=null){
				nextNode=current.next;
				current.next=previous;
				previous=current;
				current=nextNode;
			}
			list.first=previous;
		}
		
	}
	
	
	/**
	 * Reversing a linked list recursively
	 */
	
}
