package objectOrientedProgramming.callCenter;

public enum Rank {

	RESPONDER(0), MANAGER(1), DIRECTOR(2);

	private int value;

	private Rank(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
