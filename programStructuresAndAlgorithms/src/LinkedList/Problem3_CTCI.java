package LinkedList;

/**
 * Find middle node of a linked list and delete it in one pass
 * @author Devashri
 *
 */
public class Problem3_CTCI {

	public Node findMiddleNodeAndDeleteIt(LinkedList list){
		Node first = list.first;
		Node slowPointer = first;
		Node fastPointer = first;
		Node prev=null;
		
		if(list.isEmpty()){
			System.err.println("List is empty, item cannot be deleted");
			return null;
		}else{
			while(fastPointer.next!=null){
				prev=slowPointer;
				slowPointer=slowPointer.next;
				fastPointer=fastPointer.next.next;
			}
			
			prev.next=slowPointer.next;
		}
		
		
		return slowPointer;
		
	}
	
}
