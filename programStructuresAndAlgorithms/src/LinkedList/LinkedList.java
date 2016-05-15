package LinkedList;

public class LinkedList {

	Node first;

	// constructor
	public LinkedList() {
		first = null;
	}

	// check if linked list is empty
	public boolean isEmpty() {
		return (first == null);
	}

	// insert node at first
	public void insertNodeAtFirst(int data) {
		Node nodeToBeInserted = new Node(data);
		if (isEmpty()) {
			this.first = nodeToBeInserted;
			nodeToBeInserted.next = null;
		} else {
			nodeToBeInserted.next = first;
			first = nodeToBeInserted;
		}
	}

	// insert a node at last
	public void insertANodeAtLast(int data) {
		Node nodeToBeInserted = new Node(data);
		if (isEmpty()) {
			this.first = nodeToBeInserted;
			nodeToBeInserted.next = null;
		} else {
			Node current = first;

			while (current.next != null) {

				current = current.next;
			}
			current.next = nodeToBeInserted;
			nodeToBeInserted.next = null;
		}
	}

	// count number of nodes in a linked list
	public int numberOfNode() {
		int count = 0;
		if (isEmpty()) {
			return count;
		} else {
			Node current = this.first;
			while (current != null) {
				count++;
				current = current.next;
			}
		}
		return count;
	}

	// insert node in the middle
	public void insertIntheMiddleOfLinkedList(int data) {
		int countOfNodes = numberOfNode();
		int position = countOfNodes % 2 == 0 ? countOfNodes / 2 : (countOfNodes / 2) + 1;
		Node nodeToBeInserted = new Node(data);
		if (isEmpty()) {
			this.first = nodeToBeInserted;
			nodeToBeInserted.next = null;
		} else {
			Node current = this.first;
			for (int i = 0; i < position - 1; i++) {
				current = current.next;
			}

			Node prev = current.next;
			current.next = nodeToBeInserted;
			nodeToBeInserted.next = prev;
		}
	}

	// delete a node at first
	public void deleteANodeAFirst() {
		if (isEmpty()) {
			System.err.println("List is empty, item cannot be deleted");
			return;
		} else {
			first = first.next;
		}
	}

	// delete a node at last
	public void deleteANodeAtLast() {
		if (isEmpty()) {
			System.err.println("List is empty, item cannot be deleted");
			return;
		} else {
			Node current = this.first;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	// delete middle node of a linkedlist
	public void deleteIntheMiddle() {
		if (isEmpty()) {
			System.err.println("List is empty, item cannot be deleted");
			return;
		} else {
			int countOfNodes = numberOfNode();
			int position = countOfNodes % 2 == 0 ? countOfNodes / 2 : (countOfNodes / 2) + 1;
			Node current = this.first;
			Node prev = null;
			for (int i = 0; i < position - 1; i++) {
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
		}
	}
	
	// print all linked list elements
	public void printAllElements() {

		Node current = this.first;
		StringBuffer buffer = new StringBuffer();
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		} else {
			System.out.println("\n");
			while (current != null) {
				buffer.append(current.data);
				buffer.append("==>");
				current = current.next;
			}
		}

		int length = buffer.length();
		buffer.deleteCharAt(length - 1);
		buffer.deleteCharAt(length - 2);
		buffer.deleteCharAt(length - 3);

		System.out.println(buffer.toString());
	}

}
