package objectOrientedProgramming.hashtable;

import java.util.ArrayList;

public class Hasher<K, V> {

	// created a class LinkedListNode which is private and will remain only in
	// Hash Table
	private class LinkedListNode<K, V> {
		public LinkedListNode<K, V> next;
		public LinkedListNode<K, V> prev;
		public K key;
		public V value;

		// constructor for node
		public LinkedListNode(K k, V v) {
			this.key = k;
			this.value = v;
		}
	}

	// attribute of Hasher class
	private ArrayList<LinkedListNode<K, V>> array;

	// constructer for Hasher
	public Hasher(int capacity) {
		array = new ArrayList<LinkedListNode<K, V>>();
		for (int i = 0; i < capacity; i++) {
			array.add(null);
		}
	}

	// insert key and value into hash table
	public void put(K key, V value) {
		//find node if it exists
		LinkedListNode<K,V> node = getNodeForKey(key);
		//if it exists update value
		if(node!=null){
			node.value=value;
			return;
		}
		
		node = new LinkedListNode<K,V>(key, value);
		int index = getIndexForKey(key);
		if(array.get(index)!=null){
			node.next=array.get(index);
			node.next.prev=node;
		}
		array.set(index, node);
	}
	
	// remove method
	public V remove(K key) {
		
		LinkedListNode<K, V> nodeToBeRemoved = getNodeForKey(key);
		
		if(nodeToBeRemoved==null){
			return null;
		}
		
		if(nodeToBeRemoved.prev!=null){
			nodeToBeRemoved.prev.next=nodeToBeRemoved.next;
		}else{
			//removing from head
			int index = getIndexForKey(key);
			array.set(index, nodeToBeRemoved.next);
		}
		
		//setting previous
		if(nodeToBeRemoved.next!=null){
			nodeToBeRemoved.next.prev=nodeToBeRemoved.prev;
		}
		
		return nodeToBeRemoved.value;
	}

	// get method
	public V get(K key) {
		LinkedListNode<K, V> node = getNodeForKey(key);
		if(node==null){
			return null;
		}else{
			return node.value;
		}
	}

	// helper methods

	// get linkedListnode associated with a key
	private LinkedListNode<K, V> getNodeForKey(K key) {
		int index = getIndexForKey(key);
		LinkedListNode<K,V> current = array.get(index);
		while(current!=null){
			if(current.key==key){
				return current;
			}
			current = current.next;
		}
		
		return null;
	}

	public int getIndexForKey(K key) {
		return Math.abs(key.hashCode() % array.size());
	}

}