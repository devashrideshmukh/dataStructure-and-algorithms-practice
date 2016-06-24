package LinkedList;

/**
 * Implement an algorithm to find the kth to last element of a Singly Linked List
 * @author Devashri
 */
public class Problem2_CTCI_LL {
	
	public static Node returnKthToLastNode(int k, Node node){
		Node slow = node;
		Node fast = node;
		
		//placing both pointers k nodes apart
		for(int i=0;i<k;i++){
			if(fast==null){
				return null;
			}
			fast=fast.next;
		}
		
		while(fast!=null){
			fast=fast.next;
			slow = slow.next;
		}
		return slow;
		
	}
	
}
