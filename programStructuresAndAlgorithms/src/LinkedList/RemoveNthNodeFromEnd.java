package LinkedList;

public class RemoveNthNodeFromEnd {

	public Node removeNthFromEnd(Node head, int n) {
		Node fast = head;
		Node slow = head;
        if(head == null){
            return head;
        }
        Node prev = null;
        
        for(int i=0;i<n;i++){
            if(fast==null){
                return head;
            }
            fast = fast.next;
        }
        
        if(fast == null){
            head = head.next;
            return head;
        }
        
        while(fast!=null){
            prev = slow;
            fast=fast.next;
            slow=slow.next;
        }
        
        
        prev.next = slow.next;
       
      
        return head;
        
        
    }
		
}
