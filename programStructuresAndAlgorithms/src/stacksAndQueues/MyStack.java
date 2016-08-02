package stacksAndQueues;

import java.util.EmptyStackException;

public class MyStack<T> {

	private class StackNode<T> {
		private T item;
		private StackNode<T> next;

		public StackNode(T item) {
			this.item = item;
		}
	}

	private StackNode<T> top;

	public int size() {
		if (top == null) {
			return 0;
		} else {
			StackNode<T> cur = top;
			int count = 0;
			while (cur != null) {
				count = count+1;
				cur = cur.next;
			}
			return count;
		}
	}

	public T pop() {

		if (top == null) {
			throw new EmptyStackException();
		}
		T item = top.item;
		top = top.next;
		return item;

	}

	public void push(T item) {

		StackNode<T> node = new StackNode<T>(item);
		node.next = top;
		top = node;

	}

	public T peek() {

		if (top == null) {
			throw new EmptyStackException();
		}
		return top.item;

	}

	public void printStack() {
		StackNode<T> cur = top;
		while (cur != null) {
			System.out.println(cur.item);
			cur = cur.next;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

}
