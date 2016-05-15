package test;

import LinkedList.LinkedList;

public class RunnerLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.printAllElements();
		
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(4);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(1);
		linkedList.printAllElements();
		
	}
	
}
