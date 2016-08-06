package objectOrientedProgramming.callCenter;

public class Employee {
	
	private Call currentCall = null;
	protected Rank rank;
	protected String empId;
	protected static int count=0;
	private CallHandler callHandler;

	public Employee(CallHandler callHandler) {
		this.callHandler = callHandler;
	}
	
	//checks if the employee is free or not
	public boolean isFree(){
		return currentCall==null;
	}
	
	//returns rank of the employee
	public Rank getRank(){
		return rank;
	}
	
	public String getEmpId() {
		return empId;
	}
	
	//receive call
	public void receiveCall(Call call){
		System.out.println(this + "received a call from "+ call.getCaller());
		this.currentCall=call;
	}
	
	//complete call
	public void completeCall(){
		if(currentCall!=null){
			currentCall.disconnect();
			currentCall = null;
		}
		assignNewCall();
	}
	
	//assigns a new call
	public boolean assignNewCall(){
		if(!isFree()){
			return false;
		}
		return callHandler.assignCall(this);
	}
	
	//escalate calls and reassign
	public void escalateAndReassign(){
		if(currentCall!=null){
			currentCall.incrementCallsRank();
			callHandler.dispatchCall(currentCall);
			currentCall = null;
		}
		assignNewCall();
	}

	@Override
	public String toString() {
		return empId;
	}
}
