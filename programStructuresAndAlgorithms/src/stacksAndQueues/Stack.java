package stacksAndQueues;

public class Stack {

	private int maxSize;
	private int top;
	private long[] stackArray;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;

	}

	public boolean isEmpty() {

		return (top == -1);

	}

	public boolean isFull() {
		return (top == (maxSize - 1));
	}

	public void push(long val) {

		if (isFull()) {
			throw new RuntimeException("Stack overflow");
		} else {
			top = top + 1;
			stackArray[top] = val;
		}

	}

	public long pop() {

		if (isEmpty()) {
			throw new RuntimeException("Stack empty");
		} else {
			top = top - 1;
			return stackArray[top + 1];
		}

	}

	public long peek() {

		if (isEmpty()) {
			throw new RuntimeException("Stack empty");
		} else {
			return stackArray[top];
		}

	}

	public void printStack() {
		if (isEmpty()) {
			System.err.println("Stack is empty");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.println(stackArray[i]);
			}
		}
	}

}
