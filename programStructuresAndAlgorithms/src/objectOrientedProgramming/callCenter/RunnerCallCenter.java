package objectOrientedProgramming.callCenter;

public class RunnerCallCenter {
	public static void main(String[] args) {
		CallHandler ch = new CallHandler();
		Caller caller1 = new Caller("Devashri", 01);
		Call newCall = new Call(caller1);
		ch.dispatchCall(newCall);
		Caller caller2 = new Caller("Rutuja", 02);
		Call newCall2 = new Call(caller2);
		ch.dispatchCall(newCall2);
	}
}
