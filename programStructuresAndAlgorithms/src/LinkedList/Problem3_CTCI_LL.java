package LinkedList;

/**
 * Delete a node from the middle of the list whose reference is provided
 * @author Devashri
 *
 */
public class Problem3_CTCI_LL {
	public static boolean deleteAReferredNode(Node node){
		if(node==null || node.next==null){
			return false;
		}else{
			Node nextNode = node.next;
			node.data = nextNode.data;
			node.next = nextNode.next;
			return true;
		}
	}
	
	public static Node returnANode(int k,Node node){
		Node ref = node;
		for(int i=1;i<k;i++){
			ref = ref.next;
		}
		return ref;
	}
	
}
