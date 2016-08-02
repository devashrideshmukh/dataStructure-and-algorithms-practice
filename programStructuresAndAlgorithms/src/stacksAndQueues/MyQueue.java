package stacksAndQueues;

import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<T> {

	private class QueueNode<T> {

		private T item;
		private QueueNode<T> next;

		public QueueNode(T item) {
			this.item = item;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item) {

		QueueNode<T> node = new QueueNode<T>(item);

		if (last != null) {
			last.next = node;
		}

		last = node;

		if (first == null) {
			first = last;
		}

	}

	public T remove() {
		if (first == null) {
			throw new NoSuchElementException();
		}

		T node = first.item;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return node;
	}

	public T peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}

		return first.item;
	}

	public boolean isEmpty() {
		return first == null;
	}
	
	public void printQueue(){
		if(first==null){
			System.out.println("Queue is empty");
		}
		QueueNode<T> node = first;
		while(node!=null){
			System.out.println(node.item);
			node=node.next;
		}
		
	}

}
