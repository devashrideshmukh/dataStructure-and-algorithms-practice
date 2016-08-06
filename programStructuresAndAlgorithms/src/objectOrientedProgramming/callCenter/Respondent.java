package objectOrientedProgramming.callCenter;

public class Respondent extends Employee {

	public Respondent(CallHandler callHandler) {
		super(callHandler);
		this.rank = Rank.RESPONDER;
		empId = Rank.RESPONDER+String.valueOf(count);
	}

}
