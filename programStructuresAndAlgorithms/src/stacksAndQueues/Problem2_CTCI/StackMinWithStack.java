package stacksAndQueues.Problem2_CTCI;

import stacksAndQueues.MyStack;

/**
 * Stack Min: How would you design a Stack which in addition to push and pop,
 * has a function min which returns the minimum element? Push, pop and min
 * should all operate in O(1) time. Each node of the stack keeps min of all the
 * values below it
 * 
 * 
 * If the stack is very large, we waste a lot of space by keeping a track of the
 * min for every element Hence, we can use this method of keeping an additional
 * stack which holds mins
 * 
 * @author Devashri
 *
 */
public class StackMinWithStack extends MyStack<Integer> {
	MyStack<Integer> s2;

	public StackMinWithStack() {
		s2 = new MyStack<Integer>();
		// initialise stack else it will throw EmptyStackException();
		s2.push(Integer.MAX_VALUE);
	}

	@Override
	public void push(Integer item) {
		if (item <= s2.peek()) {
			s2.push(item);
		}
		super.push(item);
	}

	public Integer pop() {
		int value = super.pop();
		if (value == s2.peek()) {
			s2.pop();
		}

		return value;
	}

	public int min() {
		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}
	}

}
