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
		Node current = list.first;
		Node prev = null;
		Node nextNode;
		if(list.isEmpty()){
			System.out.println("List is empty");
			return;
		}else{
			while(current!=null){
				nextNode = current.next;
				current.next = prev;
				prev=current;
				current = nextNode;
			}
			
			list.first = prev;
		}
	}
	
	
	/**
	 * Reversing a linked list recursively
	 */
	public void reverseLinkedList(LinkedList list,Node node){
		
		if(node.next == null){
			list.first = node;
			return;
		}
		reverseLinkedList(list, node.next);
		Node q = node.next;
		q.next = node;
		node.next = null;
		
	}
	
	/**
	 * Print all the elements of a linked list in reverse order
	 * @param node
	 */
	public void printLinkedListInReverseOrder(Node node){
		if(node == null){
			return;
		}
		printLinkedListInReverseOrder(node.next);
		System.out.print(node.data+"-->");
		
	}
	
}
