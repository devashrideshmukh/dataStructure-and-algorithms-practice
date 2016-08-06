package objectOrientedProgramming.callCenter;

public class Manager extends Employee{

	public Manager(CallHandler callHandler) {
		super(callHandler);
		this.rank=Rank.MANAGER;
		empId = Rank.MANAGER+String.valueOf(count);
	}

}
