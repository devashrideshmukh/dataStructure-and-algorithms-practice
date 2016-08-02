package stacksAndQueues.Problem2_CTCI;

import stacksAndQueues.MyStack;

/**
 * Stack Min: How would you design a Stack which in addition to push and pop,
 * has a function min which returns the minimum element? Push, pop and min
 * should all operate in O(1) time. Each node of the stack keeps min of all the
 * values below it
 * 
 * @author Devashri
 *
 */
public class StackMin extends MyStack<NodeMin> {

	public void push(int item) {
		int min = Math.min(item, min());
		NodeMin nodeToBeInserted = new NodeMin(item, min);
		super.push(nodeToBeInserted);
	}

	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}

}
