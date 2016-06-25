package test;

import LinkedList.AddTwoNumbers;
import LinkedList.DoublyLinkedList;
import LinkedList.LinkedList;
import LinkedList.MiddleNode;
import LinkedList.Node;
import LinkedList.Problem1_CTCI_LL;
import LinkedList.Problem2_CTCI_LL;
import LinkedList.Problem3_CTCI_LL;
import LinkedList.ReversingLinkedList;

public class RunnerLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.printAllElements();
		
		System.out.println("\nInserting nodes at first");
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(4);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(1);
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(18);
		linkedList.printAllElements();
		
		System.out.println("\nInserting nodes at last");
		linkedList.insertANodeAtLast(23);
		linkedList.insertANodeAtLast(15);
		linkedList.printAllElements();
		
		System.out.println("\nInserting node '88' in middle");
		linkedList.insertIntheMiddleOfLinkedList(88);
		linkedList.printAllElements();
		
		System.out.println("\nDeleting node at first");
		linkedList.deleteANodeAFirst();
		linkedList.printAllElements();
		
		System.out.println("\nDeleting node at last");
		linkedList.deleteANodeAtLast();
		linkedList.printAllElements();
		
		
		System.out.println("\nTotal number of Nodes in the list:"+linkedList.numberOfNode());
		
		LinkedList l1 = new LinkedList();
		l1.insertANodeAtLast(2);
		l1.insertANodeAtLast(4);
		l1.insertANodeAtLast(3);
		
		LinkedList l2 = new LinkedList();
		l2.insertANodeAtLast(5);
		l2.insertANodeAtLast(6);
		l2.insertANodeAtLast(4);
		AddTwoNumbers add = new AddTwoNumbers();
		Node sumList = add.addTwoNumbersFromLinkedList(l1.getFirst(), l2.getFirst());
		Node cur = sumList;
		System.out.println("\nSum:"+"\n");
		while(cur!=null){
			System.out.print(cur.getData()+"==>");
			cur=cur.getNext();
		}
		
		LinkedList l3 = new LinkedList();
		l3.insertANodeAtLast(1);
		l3.insertANodeAtLast(2);
		l3.insertANodeAtLast(3);
		l3.insertANodeAtLast(4);
		Node node = MiddleNode.returnMiddleNode(l3.getFirst());
		System.out.println("\nMiddle Node : " + node.getData());
		
		System.out.println("\n==============================CTCI=======================================");
		System.out.println("\n==============================CTCI problem 1=======================================");
		LinkedList link = new LinkedList();
		link.insertANodeAtLast(6);
		link.insertANodeAtLast(7);
		link.insertANodeAtLast(1);
		link.insertANodeAtLast(4);
		link.insertANodeAtLast(6);
		link.insertANodeAtLast(6);
		link.insertANodeAtLast(4);
		link.insertANodeAtLast(9);
		link.printAllElements();
		System.out.println("\nUsing Buffer");
		Problem1_CTCI_LL.removeDuplicatesUsingBuffer(link.getFirst());
		link.printAllElements();
		link.insertANodeAtLast(4);
		link.insertANodeAtLast(6);
		link.insertANodeAtLast(6);
		link.insertANodeAtLast(4);
		link.insertANodeAtLast(9);
		link.printAllElements();
		System.out.println("\nWithout Using Buffer");
		Problem1_CTCI_LL.removeDuplicatesWithoutUsingBuffer(link.getFirst());
		link.printAllElements();
		
		System.out.println("\n==============================CTCI problem 2=======================================");
		System.out.println("2nd last Node:"+Problem2_CTCI_LL.returnKthToLastNode(2, link.getFirst()).getData());
		System.out.println("5th last Node:"+Problem2_CTCI_LL.returnKthToLastNode(5, link.getFirst()).getData());
		System.out.println("last Node:"+Problem2_CTCI_LL.returnKthToLastNode(1, link.getFirst()).getData());
		//System.out.println("6th last Node:"+Problem2_CTCI_LL.returnKthToLastNode(6, link.getFirst()).getData());
		
		System.out.println("\n==============================CTCI problem 3=======================================");
		Node nodeRef = Problem3_CTCI_LL.returnANode(2, link.getFirst());
		Problem3_CTCI_LL.deleteAReferredNode(nodeRef);
		link.printAllElements();
		Problem3_CTCI_LL.deleteAReferredNode(link.getFirst());
		link.printAllElements();
		System.out.println("First is "+ link.getFirst().getData());
		
		
		System.out.println("\n=============================DOUBLY LINKED LIST=====================================");
		DoublyLinkedList dll1 = new DoublyLinkedList();
		dll1.printDLL();
		dll1.insertNodeAtFirst(4);
		dll1.insertNodeAtFirst(6);
		dll1.insertNodeAtFirst(1);
		dll1.insertNodeAtLast(7);
		dll1.printDLL();
		dll1.insertNodeAtKthPosition(5, -1);
		dll1.printDLL();
		dll1.insertNodeAtKthPosition(9, 7);
		dll1.printDLL();
		dll1.insertNodeAtKthPosition(55, 4);
		dll1.printDLL();
		dll1.deleteFirst();
		dll1.printDLL();
		dll1.deleteLast();
		dll1.printDLL();
		dll1.deleteANodeWhoseReferenceIsGiven(dll1.getFirst().next);
		dll1.printDLL();
		dll1.deleteANodeWhoseReferenceIsGiven(dll1.getFirst());
		dll1.printDLL();
		dll1.deleteANodeWhoseReferenceIsGiven(dll1.getTail().previous);
		dll1.printDLL();
		dll1.deleteANodeWhoseReferenceIsGiven(dll1.getTail());
		dll1.printDLL();
		
	}
	
}
