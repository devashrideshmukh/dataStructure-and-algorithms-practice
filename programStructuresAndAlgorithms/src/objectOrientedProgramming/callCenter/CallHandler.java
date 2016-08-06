package objectOrientedProgramming.callCenter;

import java.util.*;

public class CallHandler {

	private final int numberOfLevels = 3;
	private final int numberOfRespondents = 10;
	private final int numberOfManagers = 5;
	private final int numberOfDirectors = 2;

	// employees at different levels
	List<List<Employee>> employeesAtDifferentLevels;
	// list of call queues at different levels
	List<Queue<Call>> callQueues;

	public CallHandler() {
		employeesAtDifferentLevels = new ArrayList<List<Employee>>(numberOfLevels);
		callQueues = new ArrayList<Queue<Call>>(numberOfLevels);

		// create Responders
		ArrayList<Employee> respondents = new ArrayList<>(numberOfRespondents);
		for (int i = 0; i < numberOfRespondents; i++) {
			respondents.add(new Respondent(this));
		}
		employeesAtDifferentLevels.add(respondents);

		// create Managers
		ArrayList<Employee> managers = new ArrayList<>(numberOfManagers);
		for (int i = 0; i < numberOfManagers; i++) {
			managers.add(new Manager(this));
		}
		employeesAtDifferentLevels.add(managers);

		// create Directors
		ArrayList<Employee> directors = new ArrayList<>(numberOfDirectors);
		for (int i = 0; i < numberOfDirectors; i++) {
			directors.add(new Director(this));
		}
		employeesAtDifferentLevels.add(directors);
	
		for(int i=0;i<numberOfLevels;i++){
			callQueues.add(new LinkedList<Call>());
		}
	}
	
	/**
	 * Get first available employee who can get the call
	 */
	public Employee getHandlerForCall(Call call){
		int rank = call.getRank().getValue();
		List<Employee> empList = employeesAtDifferentLevels.get(rank);
		for(Employee emp:empList){
			if(emp.isFree()){
				return emp;
			}
		}
		return null;
	}
	
	//dispatch the call to available employee or add it to the queue
	public void dispatchCall(Call call) {
		Employee emp = getHandlerForCall(call);
		if(emp==null){
			call.reply("No employee available, please wait");
			callQueues.get(call.getRank().getValue()).add(call);
		}else{
			emp.receiveCall(call);
        	call.setEmployeeHandlingTheCall(emp);
		}
	}
	
	public boolean assignCall(Employee emp) {
		Queue<Call> queueOfGivenRank = callQueues.get(emp.getRank().getValue());
		if(!queueOfGivenRank.isEmpty()){
			Call call = queueOfGivenRank.poll();
			emp.receiveCall(call);
			return true;
		}
		return false;
	}
}
