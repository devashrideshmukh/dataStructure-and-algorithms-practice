package stacksAndQueues.Problem3_CTCI;

import java.util.EmptyStackException;

public class SetStack {

	private int capacity;
	public NodeSetStack top, bottom;
	public int size = 0;

	public SetStack(int capacity) {
		this.capacity = capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void join(NodeSetStack above, NodeSetStack below) {
		if (above != null) {
			above.below = below;
		}

		if (below != null) {
			below.above = above;
		}
	}

	public boolean push(int value) {
		if (size == capacity) {
			return false;
		}

		NodeSetStack nodeToBePushed = new NodeSetStack(value);
		size++;
		if (size == 1) {
			bottom = nodeToBePushed;
		}
		join(nodeToBePushed, top);
		top = nodeToBePushed;
		return true;
	}
	
	public int peek(){
		return this.top.value;
	}

	public int pop() {
		NodeSetStack nodeToBePopped = top;
		top = top.below;
		size--;
		return nodeToBePopped.value;
	}

	public int removeBottom() {
		
		NodeSetStack bot = bottom;
		bottom = bottom.above;
		if (bottom != null) {
			bottom.below = null;
		}
		size--;
		return bot.value;
		
	}

}
