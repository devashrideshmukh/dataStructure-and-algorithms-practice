package LinkedList;

public class SortedCicularLinkedList {
	Node head;
	public SortedCicularLinkedList() {
		head = null;
	}
	
	public Node sortedInsert(int value){
		Node newNode = new Node(value);
		
		//if list has no previous node
		if(head==null){
			head = newNode;
			head.next=newNode;
			return head;
		}
		
		Node cur = head;
		//if node needs to be inserted before head
		if(head.data>=newNode.data){
			while(cur.next!=head){
				cur = cur.next;
			}
			
			cur.next=newNode;
			newNode.next=head;
			head = newNode;
			return head;
		}
		
		//if node needs to be inserted in middle
		while(cur.next!=head && cur.next.data<newNode.data){
			cur = cur.next;
		}
		
		newNode.next=cur.next;
		cur.next=newNode;
		return head;
	}
	
	public static void main(String[] args) {
		SortedCicularLinkedList sl = new SortedCicularLinkedList();
		sl.sortedInsert(3);
		sl.sortedInsert(10);
		sl.sortedInsert(11);
		sl.sortedInsert(5);
		
		Node cur = sl.head;
		while(cur.next!=sl.head){
			System.out.print(" "+cur.data);
			cur = cur.next;
		}

		System.out.print(" "+cur.data+"*");
		
	}
}
