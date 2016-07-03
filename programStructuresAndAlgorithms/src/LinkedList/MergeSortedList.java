package LinkedList;

public class MergeSortedList {

public Node mergeTwoLists(Node l1, Node l2) {
        
        if(l1==null && l2==null){
            return null;
        }
        
        Node newListNode = new Node(0);
        Node p1 = l1;
        Node p2 = l2;
        Node cur = newListNode;
        
        while(p1!=null && p2!=null){
            if(p1.data <= p2.data){
                cur.next = p1;
                p1=p1.next;
                cur = cur.next;
            }else{
                cur.next = p2;
                p2=p2.next;
                cur = cur.next;
            }
        }
        
        if(p1==null){
            cur.next = p2;
        }else{
            cur.next = p1;
        }
        return newListNode.next;
    }
	
}
