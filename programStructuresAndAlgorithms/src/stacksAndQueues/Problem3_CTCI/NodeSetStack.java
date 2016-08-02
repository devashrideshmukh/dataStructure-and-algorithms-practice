package stacksAndQueues.Problem3_CTCI;

public class NodeSetStack {
	
	public NodeSetStack above;
	public NodeSetStack below;
	public int value;

	public NodeSetStack(int value) {
		this.value = value;
	}
}
