package LinkedList;

public class DoublyLinkedList {

	DLLNode first;
	DLLNode tail;
	int size;

	public DoublyLinkedList() {
		first = null;
		tail = null;
		size = 0;
	}

	public DLLNode getFirst() {
		return first;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertNodeAtFirst(int data) {

		DLLNode nodeToBeInserted = new DLLNode(data);
		if (isEmpty()) {
			this.first = nodeToBeInserted;
			this.tail = nodeToBeInserted;
			nodeToBeInserted.previous = null;
			nodeToBeInserted.next = null;
		} else {
			first.previous = nodeToBeInserted;
			nodeToBeInserted.next = first;
			first = nodeToBeInserted;
		}
		size++;
	}

	public void insertNodeAtLast(int data) {
		DLLNode nodeToBeInserted = new DLLNode(data);
		if (isEmpty()) {
			this.first = nodeToBeInserted;
			this.tail = nodeToBeInserted;
			nodeToBeInserted.previous = null;
			nodeToBeInserted.next = null;
		} else {
			this.tail.next = nodeToBeInserted;
			nodeToBeInserted.next = null;
			nodeToBeInserted.previous = tail;
			tail = nodeToBeInserted;
		}
		size++;
	}

	public void insertNodeAtKthPosition(int data, int k) {

		DLLNode nodeToBeInserted = new DLLNode(data);

		// if position is negative, set it to zero
		if (k < 0) {
			k = 0;
		}

		// if position is positive, set it to size
		if (k > size) {
			k = size;
		}
		// check if list is empty, then set it to first
		if (isEmpty()) {
			first = nodeToBeInserted;
			tail = nodeToBeInserted;
			first.next = null;
			first.previous = null;
		} else if (k == 0) {
			nodeToBeInserted.next=first;
			first.previous = nodeToBeInserted;
			first = nodeToBeInserted;
		}else if (k == size) {
			tail.next = nodeToBeInserted;
			nodeToBeInserted.previous=tail;
			tail = nodeToBeInserted;
		}  else{
			DLLNode temp = this.first;
			for(int i=0;i<k-1;i++){
				temp = temp.next;
			}
			nodeToBeInserted.next=temp.next;
			nodeToBeInserted.previous=temp;
			nodeToBeInserted.next.previous=nodeToBeInserted;
			temp.next=nodeToBeInserted;
			
		}
		size++;
	}

	public void deleteFirst() {
		if(isEmpty()){
			return;
		}else{
			first = first.next;
			first.previous=null;
		}
		size--;
	}

	public void deleteLast() {
		if(isEmpty()){
			return;
		}else{
			tail = tail.previous;
			tail.next = null;
		}
		size--;
	}

	public DLLNode getTail() {
		return tail;
	}
	
	public void deleteANodeWhoseReferenceIsGiven(DLLNode nodeToBeDeleted) {
		if(nodeToBeDeleted==null){
			return;
		}else{
			if(nodeToBeDeleted==first){
				first = first.next;
				first.previous=null;
				return;
			}else if(nodeToBeDeleted==tail){
				tail=tail.previous;
				tail.next = null;
			}else{
				DLLNode prev =nodeToBeDeleted.previous;
				prev.next = nodeToBeDeleted.next;
				nodeToBeDeleted.next.previous=prev;
			}
			
		}
	}

	public void printDLL() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			DLLNode node = this.first;
			while (node != null) {
				node.displayDLLNode();
				System.out.print("<==>");
				node = node.next;
			}
		}
		System.out.print("\n");
	}

	public int getSize() {
		return size;
	}

}
