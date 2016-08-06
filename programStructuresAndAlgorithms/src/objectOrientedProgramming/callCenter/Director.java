package objectOrientedProgramming.callCenter;

public class Director extends Employee{

	public Director(CallHandler callHandler) {
		super(callHandler);
		this.rank=Rank.RESPONDER;
		empId = Rank.DIRECTOR+String.valueOf(count);
	}

}
