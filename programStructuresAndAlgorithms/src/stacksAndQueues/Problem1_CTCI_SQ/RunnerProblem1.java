package stacksAndQueues.Problem1_CTCI_SQ;

public class RunnerProblem1 {
	public static void main(String[] args) throws FullStackException, EmptyStackException {
		
		//fixed
		FixedMultiStack stacks = new FixedMultiStack(2);
		stacks.push(0,5);
		stacks.push(1, 2);
		stacks.push(1, 3);
		System.out.println(stacks.peek(0));
		System.out.println(stacks.pop(1));
		System.out.println(stacks.peek(1));
		//stacks.push(1, 2);
	}
}
