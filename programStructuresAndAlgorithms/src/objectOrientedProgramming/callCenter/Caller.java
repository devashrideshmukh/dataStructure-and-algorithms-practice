package objectOrientedProgramming.callCenter;

public class Caller {

	private String name;
	private int userId;

	public Caller(String name, int userId) {
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return name;
	}
}
