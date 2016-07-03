package LinkedList;

/**
 * Given a singly linked list, group all odd nodes together followed by the even
 * nodes. Please note here we are talking about the node number and not the
 * value in the nodes.
 * 
 * You should try to do it in place. The program should run in O(1) space
 * complexity and O(nodes) time complexity.
 * 
 * @author Devashri
 *
 */
public class EvenOddList {

public Node oddEvenList(Node head) {
        
		Node oddHead = new Node(0);
        Node evenHead = new Node(0);
        Node current = head;
        oddHead.next = current;
        Node evenPointer = evenHead;
        int count = 1;
        Node prev = oddHead;
        while(current!=null){
            
            if(count%2==0){
                evenPointer.next = current;
                evenPointer = evenPointer.next;
                prev.next = current.next;
                current = prev.next;
                
            }else{
                current = current.next;
                prev = prev.next;
            }
            count++;
        }
        evenPointer.next = null;
        prev.next = evenHead.next;
        return head;
        
    }
	
}
